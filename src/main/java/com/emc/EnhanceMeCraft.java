package com.emc;

import com.emc.proxy.ServerProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "emc", name = "EnhanceMeCraft", version = "0.0.1")
public class EnhanceMeCraft
{
    @SidedProxy(serverSide = "com.emc.proxy.ServerProxy", clientSide = "com.emc.proxy.ClientProxy")
    public static ServerProxy proxy;

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        ModItems.init();

        proxy.init();
    }
}
