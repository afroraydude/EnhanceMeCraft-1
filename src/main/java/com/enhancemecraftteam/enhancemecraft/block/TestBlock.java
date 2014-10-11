package com.enhancemecraftteam.enhancemecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by afroraydude.
 */
public class TestBlock extends Block {
    public TestBlock(Material Material)
    {
        super(Material);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
