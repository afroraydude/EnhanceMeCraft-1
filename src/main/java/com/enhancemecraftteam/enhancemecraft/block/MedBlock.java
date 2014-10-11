package com.enhancemecraftteam.enhancemecraft.block;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import static com.enhancemecraftteam.enhancemecraft.Main.modid;

/**
 * Created by afroraydude.
 */
public class MedBlock
{
    public static Block basicBlock;

    public static void init()
    {
        basicBlock = new TestBlock(Material.rock).setBlockName("testblock").setBlockTextureName(modid + ":testblock");

        GameRegistry.registerBlock(basicBlock, "testBlock");
    }

}
