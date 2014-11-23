package net.MrLast98.EnhanceWepsMod.common;


import net.MrLast98.EnhanceWepsMod.item.armor.EnhancedArmor;
import net.MrLast98.EnhanceWepsMod.creativetabs.EnhanceWepsTab;
import net.MrLast98.EnhanceWepsMod.creativetabs.placeholder.EnhanceWepsTabPlaceHolder;
import net.MrLast98.EnhanceWepsMod.item.Mail;
import net.MrLast98.EnhanceWepsMod.item.LongBow;
import net.MrLast98.EnhanceWepsMod.item.Steel;
import net.MrLast98.EnhanceWepsMod.block.Crucible;
import net.MrLast98.EnhanceWepsMod.common.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;


@Mod(modid = "EnhanceWeaponMod", name = "Enhance Weapon Mod", version = "1.0")
public class EnhanceWeps {
@SidedProxy(clientSide = "net.MrLast98.EnhanceWepsMod.common.ClientProxy", serverSide = "net.MrLast98.EnhanceWepsMod.common.CommonProxy")
public static CommonProxy proxy;

// Material
public static ArmorMaterial EnhancedArmor = EnumHelper.addArmorMaterial("ENHACEDARMOR", 66, new int []{2, 2, 2, 2}, 30);

// Armor ID
private static int OA1;
private static int OA2;

// Weapon
public static Item LongBow = new LongBow(3002).setUnlocalizedName("Long Bow").setTextureName("");

// Armor
public static Item Bascinet = new EnhancedArmor(EnhancedArmor, OA1, 0).setUnlocalizedName("Bascinet").setTextureName("");
public static Item Cuirass = new EnhancedArmor(EnhancedArmor, OA2, 1).setUnlocalizedName("Cuirass").setTextureName("EnhanceWeaponMod:Cuirass");
public static Item GreatHelmet = new EnhancedArmor(EnhancedArmor, OA1, 0).setUnlocalizedName("Great Helmet").setTextureName("");
public static Item MailedBascinet = new EnhancedArmor(EnhancedArmor, OA1, 0).setUnlocalizedName("MailedBascinet").setTextureName("");
public static Item MailedCuirass = new EnhancedArmor(EnhancedArmor, OA1, 0).setUnlocalizedName("MailedCuirass").setTextureName("");

// Item
public static Item Steel = new Steel(3000).setUnlocalizedName("Steel").setTextureName("");
public static Item Mail = new Mail(3001).setUnlocalizedName("Mail").setTextureName("");

// Block
public static Block Crucible = new Crucible(3003, Material.rock).setBlockName("Crucible").setBlockTextureName("");

// Creative Tab
public static CreativeTabs EnhanceWepsTab = new EnhanceWepsTab(CreativeTabs.getNextID(), "EnhanceWepsTab");
public static Item EnhanceWepsTabPlaceHolder = new EnhanceWepsTabPlaceHolder(3004).setUnlocalizedName("EnhanceWepsTabPlaceHolder").setTextureName("EnhanceWeps:Steel");


public EnhanceWeps() {
	
	// Armors
	GameRegistry.registerItem(Bascinet, "Bascinet");
	GameRegistry.registerItem(Cuirass, "Cuirass");
	GameRegistry.registerItem(GreatHelmet, "Great Helmet");
	GameRegistry.registerItem(MailedBascinet, "Mailed Bascinet");
	GameRegistry.registerItem(MailedCuirass, "Mailed Cuirass");
	
	// Blocks
	GameRegistry.registerBlock(Crucible, "Crucible");
	
	// Weapons
	GameRegistry.registerItem(LongBow, "Long Bow");
	
	// Items
	GameRegistry.registerItem(Mail,"Mail");
	GameRegistry.registerItem(Steel, "Steel");
	GameRegistry.registerItem(EnhanceWepsTabPlaceHolder, "EnhanceWepsTabPlaceHolder");
	
	// Crafting
	GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(Steel), 1);
	GameRegistry.addRecipe(new ItemStack(Mail, 1), new Object[]{
		"XXX", "XXX", "XXX", 'X', Steel,
	});
	GameRegistry.addRecipe(new ItemStack(LongBow, 1), new Object[]{
		"XY ", "XZK", "XY ", 'X', Items.string, 'Y', Items.stick, 'Z', Items.bow, 'K', Steel,
	});
	
	GameRegistry.addShapelessRecipe(new ItemStack(MailedBascinet, 1), Bascinet, Mail);
	GameRegistry.addShapelessRecipe(new ItemStack(MailedCuirass, 1), Cuirass, Mail);
	
	
	
}


	
}
