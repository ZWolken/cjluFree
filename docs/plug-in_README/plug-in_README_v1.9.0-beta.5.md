---
layout: default
title: v1.9.0-beta.5
parent: 量大自由 模块APP 使用操作说明
nav_order: 2
---

> 注意：下方的详细说明最佳适用于`v1.9.0-beta.5`版本的`量大自由`模块APP。<br>未说明的功能请保持默认或自行探索。

0.  首次使用前请按照模块APP指示点击`关闭X5内核`关闭企业微信(WeCom)的浏览器X5内核，并**强烈建议**进入`打开设置（使用前请先配置）`部署设置。

1.  点击`打开设置（使用前请先配置）`进入模块设置。

2.  “通用设置”项目：

    1.  `自动关闭WiFi`选项的功能在本仓库分支内均无效。原因可查看：[README文件](https://github.com/ZWolken/cjluFree#%E5%8A%9F%E8%83%BD)或[网页(Web)端](https://zwolken.github.io/cjluFree/#%E5%8A%9F%E8%83%BD)“功能”部分的注意说明。

    2.  `自动更新脚本`选项的功能由[原仓库](https://github.com/zxy19/cjluFree)提供支持，相关疑问/BUG请前往[原仓库提交议题(issue)](https://github.com/zxy19/cjluFree/issues)。

3.  “打卡设置”项目：

    1.  按照界面指示说明确认各个项目的设置配置状态。

    2.  若需使用模块APP的自动打卡功能，请确保开启`注入自动化脚本`选项。

    3.  推荐开启`自动确认位置`选项。

        >  注意：`v1.9.0-beta.5`版本的`量大自由`模块APP本身不需要定位权限，模块将读取企业微信原健康打卡界面的定位信息，所以请授予`企业微信(WeCom)`本体APP定位权限，模块在读取到定位信息后将与 *”浙江省 杭州市 钱塘区“* 进行比较，相同则`当日是否在校内`项同步勾选 *“是”*，反之若不相同则将`当日是否在校内`项同步勾选 *“否”*。

    4.  `启动时打开打卡页（全自动）`选项开启后打开`企业微信(WeCom)`本体APP将自动跳转健康打卡界面并运行自动打卡程序，打卡完成后`企业微信(WeCom)`本体APP将自动退出。

        > [应用快捷方式(Shortcuts)](https://developer.android.com/guide/topics/ui/shortcuts)可在[启动器(Laucher)](https://android.fandom.com/wiki/Launchers)上创建快捷方式，企业微信(WeCom)除了健康打卡及通行码外还有其他功能需要使用，**本仓库持有者并不推荐此功能**，此功能会引起诸多不便。

        >  若该选项开启后须打开通行码，请使用[应用快捷方式(Shortcuts)](https://developer.android.com/guide/topics/ui/shortcuts)，应用快捷方式(Shortcuts)的说明请查阅 [README文件](https://github.com/ZWolken/cjluFree/blob/LSPatch/docs/plug-in_README/index.md#%E4%B8%BB%E8%A6%81%E6%93%8D%E4%BD%9C%E8%AF%B4%E6%98%8E) 或 [网页(Web)端](https://zwolken.github.io/cjluFree/docs/plug-in_README/#%E4%B8%BB%E8%A6%81%E6%93%8D%E4%BD%9C%E8%AF%B4%E6%98%8E) “主要操作说明”部分。

4.  “通行码设置”项目：

    1.  推荐开启`自动高亮度（优化扫描）`选项。

    2.  `使用内置文件缓存加载`选项开启后，量大通行码将由企业微信本地信息生成。~~量大通行码的加载将不受网络影响。~~ 开启该选项后可在量大通行码展示界面最下方点击`禁用快速模式`加载正常界面的量大通行码。

    3.  有关量大通行码个性化设置的相关说明请查阅 [`v1.3.1-beta.2`版本的详细说明](https://zwolken.github.io/cjluFree/docs/plug-in_README/plug-in_README_v1.3.1-beta.2.html) 或 [README文件](https://github.com/ZWolken/cjluFree/blob/LSPatch/docs/plug-in_README/plug-in_README_v1.3.1-beta.2.md)。
