package com.emc.block;

import com.emc.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TestBlock extends Block
{
    public TestBlock()
    {
        super(Material.cactus);
        setBlockName("testBlock");
        setCreativeTab(ModCreativeTabs.BLOCKS.getTab());
    }
}
