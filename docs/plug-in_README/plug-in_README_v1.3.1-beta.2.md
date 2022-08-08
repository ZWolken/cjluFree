---
layout: default
title: v1.3.1-beta.2
parent: 量大自由 模块APP 使用操作说明
nav_order: 1
---

> 注意：下方的详细说明最佳适用于`v1.3.1-beta.2`版本的`量大自由`模块APP。<br>未说明的功能请保持默认或自行探索。
  0.  首次使用前请按照模块APP指示点击`关闭X5内核`关闭`企业微信(WeCom)`本体APP的浏览器X5内核，并**强烈建议**进入`打开设置（使用前请先配置）`部署设置。

  1. 点击`打开设置（使用前请先配置）`进入模块设置。

  2. 首栏`自动关闭WiFi`选项的功能在本仓库分支内均无效。原因可查看：[README文件](https://github.com/ZWolken/cjluFree#%E5%8A%9F%E8%83%BD)或[网页(Web)端](https://zwolken.github.io/cjluFree/#%E5%8A%9F%E8%83%BD)“功能”部分的注意说明。

  3. `打卡设置`项目：

      1. 若需使用模块APP的自动打卡功能，请确保开启`注入自动化脚本`选项。
      
      2. 点击`脚本模板`按钮自行修改定位地址（实测打卡页面可以直接写入定位），`JJLXDH_0`代表当日是否在校内,`0`为“是”，`1`为“否”。

         > 注：以上有关定位内容请自行修改~~以免开学前打卡就已经在校内 导致返校申请不通过~~

      3. `启动时打开打卡页（全自动）`选项开启后打开`企业微信(WeCom)`本体APP将自动跳转健康打卡界面并运行自动打卡程序，打卡完成后`企业微信(WeCom)`本体APP将自动退出。
      
         > [应用快捷方式(Shortcuts)](https://developer.android.com/guide/topics/ui/shortcuts)可在[启动器(Laucher)](https://android.fandom.com/wiki/Launchers)上创建快捷方式，`企业微信(WeCom)`本体APP除了健康打卡及通行码外还有其他功能需要使用，**本仓库持有者并不推荐此功能**，此功能会引起诸多不便。

         >  若该选项开启后须打开通行码，请使用[应用快捷方式(Shortcuts)](https://developer.android.com/guide/topics/ui/shortcuts)，应用快捷方式(Shortcuts)的说明请查阅 [README文件](https://github.com/ZWolken/cjluFree/blob/LSPatch/cjluFree_plug-in/plug-in_README.md#%E4%B8%BB%E8%A6%81%E6%93%8D%E4%BD%9C%E8%AF%B4%E6%98%8E) 或 [网页(Web)端](https://zwolken.github.io/cjluFree/cjluFree_plug-in/plug-in_README.html#%E4%B8%BB%E8%A6%81%E6%93%8D%E4%BD%9C%E8%AF%B4%E6%98%8E) “主要操作说明”部分。

  4. `通行码设置`项目：
    <br> 如需修改通行码个性化图案请开启`通行码设置`下的`注入自动化脚本`选项，有关通行码自定义图片~~DLC内容~~请自行摸索。
     > 注：<br>①已知`卡片底图`会无条件拉伸已加入的图片，请自行裁剪图片为20:9以免图片拉伸~~导致老婆变形~~；<br>②添加图片大小均不建议超过1MB，实测2MB的图片添加进去后会导致个性化失效。
