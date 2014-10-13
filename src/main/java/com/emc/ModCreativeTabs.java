package com.emc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public enum ModCreativeTabs
{
    ITEMS("items", Items.apple),
    BLOCKS("blocks", Item.getItemFromBlock(Blocks.acacia_stairs));

    private CreativeTabs creativeTab;
    private ModCreativeTabs(String n, final Item i)
    {
        creativeTab = new CreativeTabs("emc." + n)
        {
            public Item getTabIconItem()
            {
                return i;
            }
        };
    }

    public CreativeTabs getTab()
    {
        return creativeTab;
    }
}
