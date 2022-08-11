# 量大自由

# **建议访问网页(Web)界面查看：[https://zwolken.github.io/cjluFree/](https://zwolken.github.io/cjluFree/)**

## [LSPatch]疫情防控页面快捷方式自动化程序


**注意：本程序仅供学习交流使用，请勿于微博、贴吧、钉钉、计量小梦、计量墙等GFW内的公众平台上分享，严禁用于商业用途，请在下载后24小时内删除。**<br>
本程序中包含了自动完成打卡的相关功能，用意是减少重复劳动，提高效率。<br>
**警告：疫情防控人人有责，您不应该使用此功能瞒报健康信息甚至归咎于本软件的使用。**

> 本仓库复刻自 [zxy19/cjluFree](https://github.com/zxy19/cjluFree)<br>GitHub仓库地址：[https://github.com/ZWolken/cjluFree](https://github.com/ZWolken/cjluFree)

> 中国计量大学疫情防控功能快捷导航软件。实现打卡和通行码自由！

**注意：** 由于项目的特殊性，本项目可能由于各种原因随时停更，请~~窒息~~知悉。如果本项目关闭，您应当立刻停止使用本软件并删除其全部副本。

## 关于程序权限、隐私处理、原开发者等信息请查阅[原仓库](https://github.com/zxy19/cjluFree)相关内容。

**注意：** 本程序提供了一种注入企业微信的方式，此方式随时可能失效或引起其他不可预期的问题，开发者并不对其负责。

**注意： 若您的手机系统已具备 Xposed / LSPosed / EdXposed / ROOT / Shizuku 环境，请使用[原仓库](https://github.com/zxy19/cjluFree)提供的方法。**

[![GitHub Repo stars](https://img.shields.io/github/stars/ZWolken/cjluFree?style=for-the-badge)](https://github.com/ZWolken/cjluFree)
[![GitHub all releases](https://img.shields.io/github/downloads/ZWolken/cjluFree/total?style=for-the-badge)](https://github.com/ZWolken/cjluFree/releases)

## 功能

**注意：** 本仓库分支使用的是[LSPatch](https://github.com/LSPosed/LSPatch)修补APP的方式，适用于不具备 Xposed / LSPosed / EdXposed / ROOT / Shizuku 环境的Android系统，因此原程序的部分修改系统的功能（如自动关闭WiFi）均无法实现。

***若有使用相关问题询问或BUG告知请[查看或提交议题(issue)](https://github.com/ZWolken/cjluFree/issues)。***<br>
***若需其他本体与模块版本整合请[提交新版本请求(New version request)的议题(issue)](https://github.com/ZWolken/cjluFree/issues/new/choose)。***

**本程序实现了下列功能：**

+ 打卡界面和通行码界面一键直达。

+ 打卡提醒桌面小部件。（需`v1.9.0-beta.5`及以上版本的`量大自由`模块APP安装支持）

+ 自动填写并提交打卡表单。

+ 优化通行码布局并添加背景等。


## 使用方法

>  系统环境要求：Android 9 ~ Android13 Beta 1
>
>  注意：**本程序随时可能在包括但不局限于下方的OEM系统中失效：<br>EMUI / HarmonyOS<br>ColorOS<br>MIUI**
<br>原因：上述系统的[PMS核心服务](https://developer.android.com/reference/android/content/pm/PackageManager)均有不同程度的缺失损坏，由系统核心服务缺失损坏引起的程序异常无法解决。<br>~~解决方法：若想正常使用，请咨询您的OEM开发商为什么要破坏其系统的[PMS核心服务](https://developer.android.com/reference/android/content/pm/PackageManager)。~~

**注意：如果您觉得下述步骤麻烦，请关闭此页面忘记本仓库程序并老老实实自己打卡**

1.  从 [GitHub Release页面](https://github.com/ZWolken/cjluFree/releases) 中选择一个~~你喜欢的~~**合适的**已Patch的版本，并下载其版本包含的全部APK数据（部件）包。

    >  **注意：版本号越新并不代表越好用，请选择合适的版本。** 建议自行查阅的更新说明或试用各版本后，选择一个稳定合适的版本使用，并不推荐频繁更新`量大自由`模块APP。

    >  关于不同`量大自由`模块APP的版本区别请前往[原仓库发行版页面](https://github.com/zxy19/cjluFree/releases)查看。

    >  注意：<br>~~Play版本比国内版本权限更加正常纯净（我反正推荐Play菜市场版本，但某些OEM系统会因Google组件的阉割出现各种问题），但是~~Play版本实施了[AAB格式](https://developer.android.com/guide/app-bundle)安装包，因此存在多个分开的数据（组件）包，为保证文件安装正常，**请勿直接从APK文件安装软件本体**。<br>国内版本（数据包无Play后缀且为单文件），可直接从APK文件安装软件本体，并可跳过`步骤2`、`步骤5`、`步骤6`。

2.  安装[`Split APKs Installer`](https://github.com/Aefyr/SAI/releases/latest)(下简称`SAI`)。

3.  安装与您从`步骤1`中下载的APK数据（部件）包**相匹配**的`量大自由`模块APP，相匹配版本的`量大自由`模块APP在`步骤1`[发行版页面](https://github.com/ZWolken/cjluFree/releases)所选择的版本下载页面描述内提供了下载链接地址。

    >  注意：已Patch的APK数据（部件）包内包含有与其对应版本的`量大自由`模块APP的组件，若安装不相匹配版本的`量大自由`模块APP，导致所出现的**功能错误、失效**，**开发者并不对其负责**。

4.  卸载原先已安装的`企业微信(WeCom)`本体APP，若未安装本步骤跳过。

    >  注意：请自行保存备份原有数据，若系统已经核心破解，可跳过本步骤直接安装 ~~（但你都核心破解了说明你已经具备了[原仓库](https://github.com/zxy19/cjluFree)所要求的Android环境，为什么还在看这里）恼.jpg~~，但依然建议卸载APP以保证稳定，**由于本模块的使用导致的数据丢失开发者并不对其负责**。

5.  启动`SAI`，点击主界面的`安装APK`按钮，将`步骤1`中下载的所有文件全部选中，点击`选择`按钮，待`SAI`读取完全部APK数据（组件）包后点击`安装`按钮。

    >  注意：建议勾选并安装所有可选择的APK部件。

6.  在弹出的软件安装界面选择安装`企业微信(WeCom)`本体APP。

7.  打开`企业微信(WeCom)`本体APP，初启动的加载进度有可能会超过100%~~（测试中曾达到了50000%）~~，Play版本的`企业微信(WeCom)`本体APP初启动建议**给予GFW外的网络环境**，也有可能不会显示加载进度（国内官网版本暂未提供[AAB格式](https://developer.android.com/guide/app-bundle)安装包）。~~应该估计都属于正常现象。~~

8.  成功进入登陆界面后，请选择手机号登陆，由于已修改APK签名，`企业微信(WeCom)`本体APP无法通过签名验证所以无法使用微信登陆。<br>若软件闪退、无法成功进入界面等现象，在重新开启或重复上述步骤依然无果后，请~~关闭此页面忘记本仓库程序老老实实自己打卡或者~~前往[原仓库](https://github.com/zxy19/cjluFree)选择其他工作方式使用本程序。

9.  后续相关功能设置配置请查看查阅以下内容并使用：<br>- [`量大自由`模块APP使用操作说明](https://zwolken.github.io/cjluFree/docs/plug-in_README/)<br>- 仓库内`量大自由`模块APP的[使用说明文件](https://github.com/ZWolken/cjluFree/blob/LSPatch/docs/plug-in_README/index.md)。<br>- [原仓库](https://github.com/zxy19/cjluFree)的说明。

    >  首次使用前建议进入`打开设置（使用前请先配置）`部署设置。

    >  **注意：** 请自行确认程序内自动打卡脚本的`现在所在地（省市区）`项和`当日是否在校内`项设置情况，若需更改，请查阅上方内容，修改自动打卡脚本设置及脚本模板后再使用，**由于未修改信息导致的健康信息报告错误开发者并不对其负责**。
