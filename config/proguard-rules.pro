# 添加依赖混淆配置文件 #

#依赖混淆文件路劲
-basedirectory proguard
#APP通用混淆
-include proguard_common.pro
#APP特有混淆
-include proguard_special.pro

#第三方
-include proguard_gson.pro