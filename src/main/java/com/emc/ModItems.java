package com.emc;

import com.emc.item.TestItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public enum ModItems
{
    TEST(new TestItem());

    private Item item;
    private ModItems(Item i)
    {
        item = i;
    }

    public Item getItem()
    {
        return item;
    }

    public static void init()
    {
        for (int i = 0; i < ModItems.values().length; i++)
        {
            Item obj = ModItems.values()[i].getItem();
            GameRegistry.registerItem(obj, obj.getUnlocalizedName());
        }
    }
}
