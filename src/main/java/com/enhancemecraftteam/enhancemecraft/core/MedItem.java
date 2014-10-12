package com.enhancemecraftteam.enhancemecraft.core;

// imports
import com.enhancemecraftteam.enhancemecraft.item.TestItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

// static imports
import static com.enhancemecraftteam.enhancemecraft.Main.modid;

/**
 * Created by afroraydude.
 */
public class MedItem
{
    public static Item basicItem;

    public static void init()
    {
        basicItem = new TestItem().setUnlocalizedName("testitem").setTextureName(modid + ":testitem");

        GameRegistry.registerItem(basicItem, "testItem");
    }

}
