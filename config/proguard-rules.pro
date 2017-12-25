# 添加依赖混淆配置文件 #

#混淆文件路劲
-basedirectory proguard-pro
#APP
-include proguard_common.pro
-include proguard_special.pro

#第三方
-include proguard_gson.pro