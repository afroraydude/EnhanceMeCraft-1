package com.enhancemecraftteam.enhancemecraft;

import com.enhancemecraftteam.enhancemecraft.core.MedBlock;
import com.enhancemecraftteam.enhancemecraft.core.MedItem;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import static cpw.mods.fml.common.Mod.EventHandler;

/**
 * Created by EnhanceMeCraftTeam.
 * For minecraft version 1.7.10 and Forge build 1208 or higher
 */
@Mod(name="enhance", modid="enhance", version="indev")
public class Main
{
    public static String modid = "enhance";

    // Blocks

    // Items

    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        MedBlock.init();
        MedItem.init();
    }

    @EventHandler
    public void Init(FMLInitializationEvent e)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {

    }
}
