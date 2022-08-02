package com.sfd.testmod_one;

public class ModInfo {
    //MODID，唯一，每个模组必须不同
    public static final String MOD_ID = "TestMod1";
    //人读的，游戏中显示的mod名
    public static final String NAME = "TestMod1";
    //Mod版本号
    public static final String VERSION = "0.1";
    //支持的游戏版本
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    //启用的包路径.模组名.proxy.ClientProxy
    public static final String CLIENT_PROXY_CLASS = "com.sfd.testmod_one.proxy.ClientProxy";
    //启用的包路径.模组名.proxy.CommonProxy
    public static final String COMMON_PROXY_CLASS = "com.sfd.testmod_one.proxy.CommonProxy";
}
