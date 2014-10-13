package com.emc;

import com.emc.block.TestBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public enum ModBlocks
{
    TEST(new TestBlock());

    private Block block;
    private ModBlocks(Block b)
    {
        block = b;
    }

    public Block getBlock()
    {
        return block;
    }

    public static void init()
    {
        for (int i = 0; i < ModBlocks.values().length; i++)
        {
            Block obj = ModBlocks.values()[i].getBlock();
            GameRegistry.registerBlock(obj, obj.getUnlocalizedName());
        }
    }
}
