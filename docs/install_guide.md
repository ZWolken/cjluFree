---
layout: default
title: 安装说明
nav_order: 2
---

# 安装说明

>  系统环境要求：Android 9 ~ Android13 Beta 1
>
>  注意：**本程序随时可能在包括但不局限于下方的OEM系统中失效：<br>EMUI / HarmonyOS<br>ColorOS<br>MIUI**
<br>原因：上述系统的[PMS核心服务](https://developer.android.com/reference/android/content/pm/PackageManager)均有不同程度的缺失损坏，由系统核心服务缺失损坏引起的程序异常无法解决。<br>~~解决方法：若想正常使用，请咨询您的OEM开发商为什么要破坏其系统的[PMS核心服务](https://developer.android.com/reference/android/content/pm/PackageManager)。~~

**注意：如果您觉得下述步骤麻烦，请关闭此页面忘记本仓库程序并老老实实自己打卡**

1. 从 [发行版下载页面](https://zwolken.github.io/cjluFree/docs/releases_pages/) 中选择一个~~你喜欢的~~**合适的**已Patch的版本，并下载其版本包含的全部APK数据（部件）包。

    >  **注意：版本号越新并不代表越好用，请选择合适的版本。** 建议自行查阅的更新说明或试用各版本后，选择一个稳定合适的版本使用，并不推荐频繁更新`量大自由`模块APP。

    >  关于不同`量大自由`模块APP的版本区别请前往[原仓库发行版页面](https://github.com/zxy19/cjluFree/releases)查看。

    >  注意：<br>~~Play版本比国内版本权限更加正常纯净（我反正推荐Play菜市场版本，但某些OEM系统会因Google组件的阉割出现各种问题），但是~~Play版本实施了[AAB格式](https://developer.android.com/guide/app-bundle)安装包，因此存在多个分开的数据（组件）包，为保证文件安装正常，**请勿直接从APK文件安装软件本体**。<br>国内版本（数据包无Play后缀且为单文件），可直接从APK文件安装软件本体，并可跳过`步骤2`、`步骤5`、`步骤6`。

2. 安装[`Split APKs Installer`](https://github.com/Aefyr/SAI/releases/latest)(下简称`SAI`)。

    >  123云盘：[`SAI`下载链接](https://www.123pan.com/s/bir8Vv-90UK3)（密码：`CJLU`，可能不是最新版本）（失效请 [提交议题(issue)](https://github.com/ZWolken/cjluFree/issues/new/choose) 并选择“123盘下载链接失效报告”项）

3. 安装与您从`步骤1`中下载的APK数据（部件）包**相匹配**的`量大自由`模块APP，相匹配版本的`量大自由`模块APP在`步骤1`[发行版页面](https://github.com/ZWolken/cjluFree/releases)所选择的版本下载页面描述内提供了下载链接地址。

    >  注意：已Patch的APK数据（部件）包内包含有与其对应版本的`量大自由`模块APP的组件，若安装不相匹配版本的`量大自由`模块APP，导致所出现的**功能错误、失效**，**开发者并不对其负责**。

4. 卸载原先已安装的`企业微信(WeCom)`本体APP，若未安装本步骤跳过。

    >  注意：请自行保存备份原有数据，若系统已经核心破解，可跳过本步骤直接安装 ~~（但你都核心破解了说明你已经具备了[原仓库](https://github.com/zxy19/cjluFree)所要求的Android环境，为什么还在看这里）恼.jpg~~，但依然建议卸载APP以保证稳定，**由于本模块的使用导致的数据丢失开发者并不对其负责**。

5. 启动`SAI`，点击主界面的`安装APK`按钮，将`步骤1`中下载的所有文件全部选中，点击`选择`按钮，待`SAI`读取完全部APK数据（组件）包后点击`安装`按钮。

    >  注意：建议勾选并安装所有可选择的APK部件。

6. 在弹出的软件安装界面选择安装`企业微信(WeCom)`本体APP。

7. 打开`企业微信(WeCom)`本体APP，初启动的加载进度有可能会超过100%~~（测试中曾达到了50000%）~~，Play版本的`企业微信(WeCom)`本体APP初启动建议**给予GFW外的网络环境**，也有可能不会显示加载进度（国内官网版本暂未提供[AAB格式](https://developer.android.com/guide/app-bundle)安装包）。~~应该估计都属于正常现象。~~

8. 成功进入登陆界面后，请选择手机号登陆，由于已修改APK签名，`企业微信(WeCom)`本体APP无法通过签名验证所以无法使用微信登陆。<br>若软件闪退、无法成功进入界面等现象，在重新开启或重复上述步骤依然无果后，请~~关闭此页面忘记本仓库程序老老实实自己打卡或者~~前往[原仓库](https://github.com/zxy19/cjluFree)选择其他工作方式使用本程序。

9. 从`企业微信(WeCom)`本体APP的应用详情界面 **强行停止** 应用，并在后续步骤中通过`量大自由`模块APP打开，以提高`量大自由`模块APP生效概率。
    >  位于手机系统设置的应用管理内，通常可通过长按软件图标直接打开应用详情界面。

10. 后续相关功能设置配置请查看查阅以下内容并使用：<br>- [`量大自由`模块APP使用操作说明](https://zwolken.github.io/cjluFree/docs/plug-in_README/)<br>- [原仓库](https://github.com/zxy19/cjluFree)的说明。

    >  首次使用前建议进入`打开设置（使用前请先配置）`部署设置。

    >  **注意：** 请自行确认程序内自动打卡脚本的`现在所在地（省市区）`项和`当日是否在校内`项设置情况，若需更改，请查阅上方内容，修改自动打卡脚本设置及脚本模板后再使用，**由于未修改信息导致的健康信息报告错误开发者并不对其负责**。