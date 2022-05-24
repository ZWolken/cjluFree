#  量大自由

> 中国计量大学疫情防控功能快捷导航软件。实现打卡和通行码自由！

**警告：** 该程序提供了一种注入企业微信的方式，该方式随时可能失效或引起其他不可预期的问题，即便其当前有效。开发者可能会帮助解决某些问题，但是不会对您的损失负责。

**警告：** 该程序中包含了自动完成打卡的相关功能，用意是减少重复劳动，提高效率。**疫情防控人人有责，您不应该使用此功能瞒报健康信息甚至归咎于该软件的使用**

**注意：** 由于项目的特殊性，该项目可能由于各种原因随时停更，请悉知。如果该项目关闭，您应当立刻停止使用该软件并删除其全部副本

## 功能

**该程序实现了下列功能：**

+ 打卡界面和通行码界面一键直达

+ 自动关闭WIFI

+ 自动填写并提交打卡表单

+ 优化通行码布局并添加背景等

+ 优化扫码体验

## 权限

| 权限        | 权限名                                                 | 用途             | 可选 |
| :---------- | :----------------------------------------------------- | :--------------- | :--- |
| 网络状态类  | ACCESS_NETWORK_STATECHANGE_WIFI_STATEACCESS_WIFI_STATE | 用于自动WIFI控制 | 否   |
| Xposed      | 用于注入脚本和原版界面跳转                             | 否               |      |
| ROOT        | 用于WIFI控制和应用跳转                                 | 否               |      |
| Shizuku/Sui | 用于WIFI控制                                           | 否               |      |

该程序使用了Xposed框架,Root,Shizuku实现相关功能。这些功能的权限非常高，在下载本程序前请确保从正确的途径下载而非从陌生人/未知下载站下载，避免造成损失

我们为提供不同权限的用户提供了不同的体验，详情参阅下表。您可以为程序准备Xposed和另外一种或多种权限来获得更好的体验

| 工作方式 | 跳转页面 | 页面直达 | 自动控制WIFI   | 注入脚本 | 结束进程       |
| :------- | :------- | :------- | :------------- | :------- | :------------- |
| ROOT     | 支持     | 支持     | 支持           | 不支持   | 支持           |
| Xposed   | 支持     | 不支持   | 不支持（手动） | 支持     | 不支持（手动） |
| Shizuku  | 支持     | 不支持   | 支持           | 不支持   | 支持           |
| 重打包   | 支持     | 支持     | 不支持         | 不支持   | 不支持（手动） |





## 使用方法

- A.Xposed/Lsposed/Edxposed

  直接安装量大自由软件和企业微信，并在您的Xposed管理器中激活量大自由。根据提示重启软件/系统即可生效

- B.XPatch/Lspatch

  安装量大自由软件，将企业微信在您的虚拟框架中进行修补。重启企业微信一般即可生效

- C.ROOT(仅快捷方式，配合A/B使用全部功能)

  安装量大自由软件并授予超级用户权限

- D.Shizuku(配合A/B使用全部功能)

  打开量大自由时授权使用Shizuku即可

- E.重打包(仅快捷方式，配合A/B使用全部功能)

  卸载原先的企业微信，安装重打包的企业微信安装包和量大自由即可。可以将该安装包进行修补以支持无Root下直达页面

> **注意：** 小米等手机在B方法下可能无法注入脚本，该问题暂时未能解决。
> 无法Root的用户理论上可以通过B+D+E来达到A+C的效果。

## 隐私处理

我们不会处理您的任何数据，该程序不会向任何网络地址发送或获取任何数据，

## 开发者

小鱼飘飘

 [邮件联系：z@xypp.cc](mailto:z@xypp.cc)
