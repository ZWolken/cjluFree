#  量大自由

**警告：本程序仅供学习交流使用，严禁用于商业用途，请于24小时内删除。**<br>
该程序中包含了自动完成打卡的相关功能，用意是减少重复劳动，提高效率。<br>
**警告：疫情防控人人有责，您不应该使用此功能瞒报健康信息甚至归咎于该软件的使用。**

> 本仓库复刻自 [zxy19/cjluFree](https://github.com/zxy19/cjluFree)

> 中国计量大学疫情防控功能快捷导航软件。实现打卡和通行码自由！

**注意：** 该程序提供了一种注入企业微信的方式，该方式随时可能失效或引起其他不可预期的问题，开发者并不对其负责。

**注意：** 由于项目的特殊性，该项目可能由于各种原因随时停更，请悉知。如果该项目关闭，您应当立刻停止使用该软件并删除其全部副本。

**注意：若您的手机系统已具备Xposed/LSPosed/EdXposed/ROOT/Shizuku环境，请使用[原仓库](https://github.com/ZWolken/cjluFree)提供的方法。**

## 功能

**注意：** 本仓库分支使用的是[LSPatch](https://github.com/LSPosed/LSPatch)修补APP的方式实现的，适用于不具备Xposed/LSPosed/EdXposed/ROOT/Shizuku环境的Android系统，因此原程序的部分修改系统的功能（如自动关闭WiFi）均失效。

**程序实现了下列功能：**

+ 打卡界面和通行码界面一键直达。

+ 自动填写并提交打卡表单。

+ 优化通行码布局并添加背景等。

## 使用方法
>  系统环境：Android 9 ~ Android13 Beta 1
>
>  注意：**该程序随时可能在以下OEM系统失效：<br>EMUI/HarmonyOS<br>ColorOS<br>MIUI<br>etc.**
<br>上述系统的[PMS核心服务](https://developer.android.com/reference/android/content/pm/PackageManager)均有不同程度的缺失损坏，由系统核心服务缺失损坏引起的程序异常无法解决。<br>~~若想正常使用，请咨询您的OEM开发商为什么要破坏其系统的[PMS核心服务](https://developer.android.com/reference/android/content/pm/PackageManager)。~~

**注意：如果您觉得下述步骤麻烦，请关闭此页面忘记本仓库程序并老老实实自己打卡**

1.  从[最新的发行版页面](https://github.com/ZWolken/cjluFree/releases/latest)中下载全部的APK数据包。
>  注意：请勿直接从APK文件安装软件。
2.  安装[Split APKs Installer](https://github.com/Aefyr/SAI/releases/latest)(下简称SAI)。
3.  安装[量大自由APP](https://github.com/zxy19/cjluFree/releases/latest)。
4.  卸载原先已安装的企业微信(Wecom)APP，若未安装本步骤跳过。
>  注意：请自行保存备份原有数据，若系统已经核心破解，本步骤可跳过，但依然建议卸载APP以保证稳定。
5.  启动SAI，点击主界面的`安装APK`按钮，将步骤1中下载的所有文件全部选中，点击`选择`按钮，待SAI读取完全部APK数据包后点击`安装`按钮。
>  注意：建议同时勾选安装可选择的APK部件。
6.  在弹出的软件安装界面选择安装企业微信(Wecom)APP
7.  打开企业微信(Wecom)APP，初启动的加载进度可能会超过100%（测试中曾到达了50000%）。~~应该估计属于正常现象。~~
8.  若成功进入登陆界面，请选择手机号登陆，由于已修改签名，其验证无法通过所以无法使用微信登陆。<br>若软甲闪退、无法成功进入界面，请前往[原仓库](https://github.com/ZWolken/cjluFree)选择其他工作方式使用本程序。~~或者关闭此页面忘记本仓库程序老老实实自己打卡。~~

## 关于程序权限、隐私处理、原开发者等信息请查阅[原仓库](https://github.com/ZWolken/cjluFree)。
