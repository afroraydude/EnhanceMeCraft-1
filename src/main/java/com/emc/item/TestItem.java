package com.emc.item;

import com.emc.ModCreativeTabs;
import net.minecraft.item.Item;

public class TestItem extends Item
{
    public TestItem()
    {
        setUnlocalizedName("testItem");
        setCreativeTab(ModCreativeTabs.ITEMS.getTab());
    }
}
