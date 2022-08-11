---
layout: default
title: 量大自由 - 疫情防控页面快捷方式自动化程序
nav_order: 1
---

# 量大自由

## [LSPatch]疫情防控页面快捷方式自动化程序

**注意：本程序仅供学习交流使用，请勿于微博、贴吧、钉钉、计量小梦、计量墙等GFW内的公众平台上分享，严禁用于商业用途，请在下载后24小时内删除。**<br>
本程序中包含了自动完成打卡的相关功能，用意是减少重复劳动，提高效率。<br>
**警告：疫情防控人人有责，您不应该使用此功能瞒报健康信息甚至归咎于本软件的使用。**

> 本仓库复刻自 [zxy19/cjluFree](https://github.com/zxy19/cjluFree)

> GitHub仓库地址：[https://github.com/ZWolken/cjluFree](https://github.com/ZWolken/cjluFree)<br>网页(Web)界面：[https://zwolken.github.io/cjluFree/](https://zwolken.github.io/cjluFree/)

> 中国计量大学疫情防控功能快捷导航软件。实现打卡和通行码自由！

**注意：** 由于项目的特殊性，本项目可能由于各种原因随时停更，请~~窒息~~知悉。如果本项目关闭，您应当立刻停止使用本软件并删除其全部副本。

<button class="btn js-toggle-dark-mode">切换为黑暗模式</button>

<script>
const toggleDarkMode = document.querySelector('.js-toggle-dark-mode');

jtd.addEvent(toggleDarkMode, 'click', function(){
  if (jtd.getTheme() === 'dark') {
    jtd.setTheme('light');
    toggleDarkMode.textContent = '切换为黑暗模式';
  } else {
    jtd.setTheme('dark');
    toggleDarkMode.textContent = '切换为明亮模式';
  }
});
</script>

## 视频演示：

<iframe src="//player.bilibili.com/player.html?bvid=BV1hv4y1F7UF&page=1&high_quality=1&danmaku=0" scrolling="no" border="0" frameborder="no" framespacing="0" allowfullscreen="true" width="100%" height="400px" sandbox="allow-top-navigation allow-same-origin allow-forms allow-scripts"> </iframe>

## 关于程序权限、隐私处理、原开发者等信息请查阅[原仓库](https://github.com/zxy19/cjluFree)相关内容。

**注意：** 本程序提供了一种注入企业微信的方式，此方式随时可能失效或引起其他不可预期的问题，开发者并不对其负责。

**注意： 若您的手机系统已具备 Xposed / LSPosed / EdXposed / ROOT / Shizuku 环境，请使用[原仓库](https://github.com/zxy19/cjluFree)提供的方法。**

[![GitHub Repo stars](https://img.shields.io/github/stars/ZWolken/cjluFree?style=for-the-badge)](https://github.com/ZWolken/cjluFree)
[![GitHub all releases](https://img.shields.io/github/downloads/ZWolken/cjluFree/total?style=for-the-badge)](https://zwolken.github.io/cjluFree/docs/releases_pages/)

## 功能

**注意：** 本仓库分支使用的是[LSPatch](https://github.com/LSPosed/LSPatch)修补APP的方式，适用于不具备 Xposed / LSPosed / EdXposed / ROOT / Shizuku 环境的Android系统，因此原程序的部分修改系统的功能（如自动关闭WiFi）均无法实现。

***若有使用相关问题询问或BUG告知请[查看或提交议题(issue)](https://github.com/ZWolken/cjluFree/issues)。***<br>
***若需其他本体与模块版本整合请[提交新版本请求(New version request)的议题(issue)](https://github.com/ZWolken/cjluFree/issues/new/choose)。***

**本程序实现了下列功能：**

+ 打卡界面和通行码界面一键直达。

+ 打卡提醒桌面小部件。（需`v1.9.0-beta.5`及以上版本的`量大自由`模块APP安装支持）

+ 自动填写并提交打卡表单。

+ 优化通行码布局并添加背景等。

## 安装说明请见：[安装说明页面](https://zwolken.github.io/cjluFree/docs/install_guide.html)

## 使用操作说明请见：[`量大自由`模块APP使用操作说明](https://zwolken.github.io/cjluFree/docs/plug-in_README/)