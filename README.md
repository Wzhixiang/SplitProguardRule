# SplitProguardRule
一般情况下都是在默认的proguard-rules.pro中配置，一旦配置过多的时候，视觉感受极差。  
如果你有时间精力可以学下这种做法：  
1.在项目根目录下建目录/config/proguard  
2.在上述新建的proguard目录下建需要混淆的xxx.pro,PS:proguard_common.pro  
3.在上述新建的config目录下建一个proguard-rules.pro，  
#添加依赖混淆配置文件#  
#依赖混淆文件路劲  
-basedirectory proguard  
#APP通用混淆 
-include proguard_common.pro    
4.在app.gradle中配置proguard-rules.pro路径"$rootDir/config/proguard-rules.pro"（记得是双引号）  
buildTypes {  
        release {  
            minifyEnabled true  
            proguardFiles getDefaultProguardFile('proguard-android.txt'), "$rootDir/config/proguard-rules.pro"  
        }  
    }  
