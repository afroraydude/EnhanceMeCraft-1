package com.enhancemecraftteam.enhancemecraft;

import com.enhancemecraftteam.enhancemecraft.block.MedBlock;
import com.enhancemecraftteam.enhancemecraft.item.MedItem;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

import javax.sound.sampled.CompoundControl;

import static cpw.mods.fml.common.Mod.EventHandler;
import static net.minecraftforge.common.BiomeDictionary.registerBiomeType;
import static net.minecraftforge.common.BiomeManager.BiomeEntry;
import static net.minecraftforge.common.BiomeManager.addSpawnBiome;
import static net.minecraftforge.common.BiomeManager.addVillageBiome;

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
