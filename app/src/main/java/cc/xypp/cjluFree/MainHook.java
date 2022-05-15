package cc.xypp.cjluFree;

import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class MainHook implements IXposedHookLoadPackage {

    private static final String JUMP_WEB = "https://qywx.cjlu.edu.cn/Pages/Detail.aspx?ID=5986121fe88949c283e1719f595d57da";
    private dataUtil data;
    private final HashSet<String> classNameSet = new HashSet<>();

    private void XVdLog(String flg, String content) {
        Log.i("[AS_LOG]" + flg, content);
    }

    private boolean hasInj = false;
    private boolean started = false;
    private boolean autoed = false;
    private boolean toExit = false;
    private String getPassScript(){
        String B2="";
        return "document.body.appendChild(function(){\n" +
                "    var cs=document.createElement(\"style\");\n" +
                "    cs.innerHTML=\"#bglayer{background-image:url("+data.get("im1")+")!important;background-size: cover;background-position: center;position:fixed;left:0;top:0;right:0;bottom:0;z-index:-1;}\"+\n" +
                "    \"body{background:tranparent!important;}\"+\n" +
                "    \".combg{background:#ffffffa3!important;}\"+\n" +
                "    \".passcode{height:500px!important;position:relative;}\"+\n" +
                "    \"#notice{position:absolute;bottom: 15px;left: 0;right: 0;}\"+\n" +
                "    \".passstatus{right: -14px;top: -19px;}\"+\n" +
                "    \".card{border-radius:11px;overflow:hidden;}\"+\n" +
                "    \"*{transition:all 0.7s;}\"+\n" +
                "    \"#rq{display: inline-block;padding-right: 12px;color:lightgray;}\"+\n" +
                "    \"#sj{font-size: 30px;display: inline-block;color:gray;}\"+\n" +
                "    \"#bglayer-card{background: linear-gradient(45deg, black 4%,transparent 63%);position: absolute;left: 13px;top: 12px;right: 0;height: 150px;z-index: 0;border-radius: 11px;}\"+\n" +
                "    \".card div{z-index:1;}\"\n" +
                "    ;\n" +
                "    return cs;\n" +
                "}());\n" +
                "document.body.appendChild(function(){\n" +
                "    var t=document.createElement(\"div\");\n" +
                "    t.id=\"bglayer\";\n" +
                "    return t;\n" +
                "}())\n" +
                "$(\".card\")[0].appendChild(function(){\n" +
                "    var t=document.createElement(\"div\");\n" +
                "    t.id=\"bglayer-card\";\n" +
                "    return t;\n" +
                "}())\n" +
                "$(\".card .bgimg\").attr(\"src\",\""+data.get("im2")+"\");\n";
    }
    private String getSigScript(){
        return "document.body.appendChild(function(){var c=document.createElement(\"div\");c.style.position=\"fixed\";" +
                "c.style.width=\"100px\";c.style.textAlign=\"center\";c.style.height=\"30px\";c.style.zIndez=\"1000000\";c.style.left=\"0px\";" +
                "c.style.top=\"0px\";c.style.transition=\"all 1s\";c.style.opacity=\"0\";c.style.background=\"black\";c.style.color=\"white\";" +
                "c.style.borderRadius=\"4px\";c.innerHTML=\"脚本已注入\";c.onclick=function(e){e.currentTarget.style.opacity=\"0\";" +
                "var head=document.getElementsByTagName(\"head\")[0],tmt;if(tmt=document.getElementById(\"__injected_atos\")){head.removeChild(tmt);}var cc=document.createElement(\"script\");cc.src=\""+
                data.get("sigSrc")
                +"\";cc.id=\"__injected_atos\";cc.onload=function(){c.style.opacity=\"1\";};setTimeout(function(head,cc){head.appendChild(cc);}" +
                ",500,head,cc)};setTimeout(function(c){c.onclick({currentTarget:c});},500,c);return c;}());";
    }
    /**
     * 处理Xposed注入事件
     *
     * @param lpparam
     * @throws Throwable
     */
    public void handleLoadPackage(final XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        if (!lpparam.packageName.equals("com.tencent.wework")) return;
        if (lpparam.isFirstApplication) {
            if (hookCheck(lpparam.packageName)) {
                try {
                    hasInj = false;
                    started = false;
                    autoed= false;
                    toExit = false;
                    this.hookSystemWebView(lpparam);
                    this.hookAutomation(lpparam);
                } catch (Exception e) {
                    XVdLog("初始化注入", e.toString() + "|" + Arrays.toString(e.getStackTrace()));
                }
            }
        }
    }

    /**
     * 自动化方法注入
     *
     * @param lpparam
     */
    private void hookAutomation(final XC_LoadPackage.LoadPackageParam lpparam) {
        XVdLog("初始化注入", "系统函数hook");
        AppHook_Context(lpparam);
        AppHook_functions(lpparam);
        AppHook_classLoader(lpparam);
    }

    /**
     * 全局上下文HOOK
     *
     * @param lpparam 参数
     */
    private void AppHook_Context(XC_LoadPackage.LoadPackageParam lpparam) {
        try {
            Class<?> ContextClass = XposedHelpers.findClass("android.content.ContextWrapper", lpparam.classLoader);
            XposedHelpers.findAndHookMethod(ContextClass, "getApplicationContext", new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    super.afterHookedMethod(param);
                    if (data != null) return;
                    try {
                        Context applicationContext = (Context) param.getResult();
                        if (applicationContext == null) return;
                        XVdLog("取得Context", applicationContext.toString());
                        ContentResolver rsv = applicationContext.getContentResolver();
                        if (rsv == null) return;
                        data = new dataUtil(rsv);
                        XVdLog("取得Data", data.get("auto") + "-" + data.get("inj") + "-" + data.get("once"));
                    } catch (Exception e) {
                        XVdLog("取Context错误", e.toString());
                    }
                }
            });
        } catch (Throwable t) {
            XVdLog("取Context错误", t.toString());
        }
    }

    /**
     * 关键方法HOOK
     *
     * @param lpparam 参数
     */
    private void AppHook_functions(XC_LoadPackage.LoadPackageParam lpparam) {
        try {
            Class<?> tmp = XposedHelpers.findClass("com.tencent.wework.launch.WwMainActivity", lpparam.classLoader);
            if (tmp != null) {
                XVdLog("方法HOOK", "WwMainActivity");
                XposedHelpers.findAndHookMethod(tmp, "onStart", new WmMainHook());
            }
        } catch (Exception e) {
            XVdLog("HOOK方法错误:WwMainActivity", e.toString());
        }

        try {
            Class<?> tmp = XposedHelpers.findClass("com.tencent.wework.common.web.JsWebActivity", lpparam.classLoader);
            if (tmp != null) {
                XVdLog("方法HOOK", "JsWebActivity");
                XposedHelpers.findAndHookMethod(tmp, "onStart", new JSStartHook());
            }
        } catch (Exception e) {
            XVdLog("HOOK方法错误:JsWebActivity", e.toString());
        }

    }

    /**
     * 类加载器HOOK，用于异步加载的类hook
     *
     * @param lpparam 参数
     */
    private void AppHook_classLoader(final XC_LoadPackage.LoadPackageParam lpparam) {
        try {
            XposedHelpers.findAndHookMethod(
                    ClassLoader.class,
                    "loadClass",
                    String.class,
                    new XC_MethodHook() {
                        @Override
                        protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                            super.afterHookedMethod(param);
                            try {
                                Class<?> clazz = (Class<?>) param.getResult();
                                if (clazz == null) return;
                                String name = clazz.getName();
                                if (name.contains("com.tencent.wework.launch.WwMainActivity")) {
                                    XVdLog("方法HOOK", "WwMainActivity");
                                    XposedHelpers.findAndHookMethod(clazz, "onStart", new WmMainHook());
                                }else if (name.contains("com.tencent.wework.common.web.JsWebActivity")) {
                                    XVdLog("方法HOOK", "WwMainActivity");
                                    XposedHelpers.findAndHookMethod(clazz, "onStart", new JSStartHook());
                                }else if(name.equals("android.webkit.WebView")) {
                                    XposedBridge.hookAllConstructors(clazz, new WebViewConstructorHooker());
                                    XposedBridge.hookMethod(findMethod(clazz, "setWebViewClient"), new WebviewHook());
                                }
                            } catch (Exception e) {
                                XVdLog("HOOK方法错误:LoadClass", e.toString());
                            }
                            ;
                        }
                    });
        } catch (Exception e) {
            XVdLog("HOOK方法错误:LoadClass", e.toString());
        }
    }

    /**
     * 打开网页浏览器健康打卡页面
     *
     * @param ctx 当前上下文对象
     */
    private void openWeb(Context ctx, String URL) {
        try {
            XVdLog("JSWeb", "启动JSWeb");
            Intent intent = new Intent();
            intent.setClassName(ctx, "com.tencent.wework.common.web.JsWebActivity");
            intent.putExtra("extra_web_title", "自动化页面中间页");
            intent.putExtra("extra_web_url", URL);
            ctx.startActivity(intent);
        } catch (Exception e) {
            XVdLog("JsWeb启动失败", e.toString());
        }
    }

    /**
     * 系统WebViewHook，用于注入脚本。需要将X5内核关闭
     *
     * @param lpparam 参数
     */
    private void hookSystemWebView(final XC_LoadPackage.LoadPackageParam lpparam) {
        XVdLog("初始化注入", "WebView相关");
        try {
            final Class<?> webViewClazz = XposedHelpers.findClass("android.webkit.WebView", lpparam.classLoader);
            XposedBridge.hookAllConstructors(webViewClazz, new WebViewConstructorHooker());
            XposedBridge.hookMethod(findMethod(webViewClazz, "setWebContentsDebuggingEnabled"), new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    param.args[0] = true;
                }
            });
            XposedBridge.hookMethod(findMethod(webViewClazz, "setWebViewClient"), new WebviewHook());
        } catch (Exception e) {
            XVdLog("WebView注入错误", e.toString());
        }
    }

    private Method findMethod(Class<?> clazz, String name) {
        for (Method method : clazz.getMethods()) {
            if (name.equals(method.getName())) {
                return method;
            }
        }
        XVdLog("METHOD_NOT_FOUND", clazz.toString()+":"+name);
        return null;
    }

    private boolean hookCheck(String className) {
        if (classNameSet.contains(className)) {
            return false;
        } else {
            classNameSet.add(className);
            return true;
        }
    }

    private class WmMainHook extends XC_MethodHook {
        @Override
        protected void afterHookedMethod(final XC_MethodHook.MethodHookParam param) throws Throwable {
            super.afterHookedMethod(param);
            XVdLog("主Activity", "OnStart函数");
            if (data == null) return;
            if(toExit){
                toExit=false;
                started=false;
                ((Activity)param.thisObject).finish();
                return;
            }
            if (started) return;
            started = true;
            hasInj=false;
            XVdLog("WwMainActivity类", "标记启动");
            autoed=true;
            if (data.get("quick").equals("pass")) {
                data.set("quick", "");
                openWeb((Context) param.thisObject, "http://qywx.cjlu.edu.cn/Pages/RuXiao/XSLXM.aspx");
            }else if (data.get("quick").equals("x5")) {
                data.set("quick", "");
                openWeb((Context) param.thisObject, "http://debugtbs.qq.com/");
            }else if (data.get("auto").equals("true") || data.get("quick").equals("sig")) {
                data.set("quick", "");
                try {
                    XVdLog("主Activity", "OnStart执行");
                    openWeb((Context) param.thisObject, "https://qywx.cjlu.edu.cn/Pages/Detail.aspx?ID=5986121fe88949c283e1719f595d57da");
                    XVdLog("主Activity", "OnStart执行完成");
                } catch (Exception e) {
                    XVdLog("主Activity错误", e.toString());
                }
            } else started=autoed=false;

        }
    }

    private class JSStartHook extends XC_MethodHook {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
            if(autoed){
                toExit=true;
            }
        }
    }

    private class WebviewHook extends XC_MethodHook {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
            if (param.args[0] != null && hookCheck(param.args[0].getClass().getName())) {
                XVdLog("WebViewHook", param.args[0].getClass().getName());
                XposedBridge.hookMethod(findMethod(param.args[0].getClass(), "onPageFinished"), new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        XVdLog("脚本注入", "ENT");
                        if (!data.get("inj").equals("true") && !data.get("once_inj").equals("true"))
                            return;
                        final WebView webview = (WebView) param.args[0];
                        String url=webview.getUrl();
                        XVdLog("脚本注入判断", webview.getUrl());
                        if (url.contains("https://qywx.cjlu.edu.cn/Pages/Detail") && !hasInj) {
                            XVdLog("脚本注入", "确认开始");
                            webview.evaluateJavascript(getSigScript(), new ValueCallback<String>() {
                                @Override
                                public void onReceiveValue(String value) {
                                    hasInj = true;
                                    XVdLog("脚本注入", "结束");
                                }
                            });
                        }else if(url.contains("https://qywx.cjlu.edu.cn/Pages/RuXiao/XSLXM.aspx")){
                            XVdLog("脚本注入", "确认开始");
                            webview.evaluateJavascript(getPassScript(), new ValueCallback<String>() {
                                @Override
                                public void onReceiveValue(String value) {
                                    XVdLog("脚本注入", "结束");
                                }
                            });
                        }
                    }
                });
                XVdLog("WebViewHookB", param.args[0].getClass().getName());
                XposedBridge.hookMethod(findMethod(param.args[0].getClass(), "onPageStarted"), new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        XVdLog("脚本注入P", "ENT");
                        if (!data.get("inj").equals("true") && !data.get("once_inj").equals("true"))
                            return;
                        final WebView webview = (WebView) param.args[0];
                        String url= (String) param.args[1];
                        XVdLog("脚本注入判断P", url);
                        if(url.contains("https://qywx.cjlu.edu.cn/Pages/RuXiao/XSLXM.aspx")){
                            XVdLog("脚本注入P", "确认开始");
                            webview.evaluateJavascript(getPassScript(), new ValueCallback<String>() {
                                @Override
                                public void onReceiveValue(String value) {
                                    XVdLog("脚本注入P", "结束");
                                }
                            });
                        }
                    }
                });
            }
        }
    }

    private class WebViewConstructorHooker extends XC_MethodHook{
        @Override
        protected void afterHookedMethod(XC_MethodHook.MethodHookParam param) throws Throwable {
            XposedHelpers.callStaticMethod(param.thisObject.getClass(), "setWebContentsDebuggingEnabled", true);
            XVdLog("WebView注入", "构造函数");
            final WebView webview = (WebView) param.thisObject;
            WebSettings webSettings = webview.getSettings();
            webSettings.setJavaScriptEnabled(true);
            if (hookCheck(webSettings.getClass().getName())) {
                XposedBridge.hookMethod(findMethod(webSettings.getClass(), "setJavaScriptEnabled"), new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        param.args[0] = true;
                    }
                });
            }
        }
    }

}
