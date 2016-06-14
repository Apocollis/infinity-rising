package com.github.apocollis.infinityrising.init;

import com.github.apocollis.infinityrising.help.RegisterHelper;
import com.github.apocollis.infinityrising.items.ItemInfinityRisingAxe;
import com.github.apocollis.infinityrising.items.ItemInfinityRisingPick;
import com.github.apocollis.infinityrising.items.ItemInfinityRisingShovel;
import com.github.apocollis.infinityrising.items.ItemInfinityRisingSword;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmory 
{
	static Item.ToolMaterial IRIDIUM = EnumHelper.addToolMaterial("IRIDIUM", 5, 4096, 12.0F, 11.0F, 22);
	static Item.ToolMaterial INFINIUM = EnumHelper.addToolMaterial("INFINIUM", 10, 9192, 20.0F, 71.0F, 35);
	static Item.ToolMaterial BONE = EnumHelper.addToolMaterial("BONE", 2, 131, 5.0F, 2.0F, 16);
	
	public static Item infinitySword = new ItemInfinityRisingSword(INFINIUM).setUnlocalizedName("infinitySword");
	public static Item iridiumSword = new ItemInfinityRisingSword(IRIDIUM).setUnlocalizedName("iridiumSword");
	public static Item iridiumPick = new ItemInfinityRisingPick(IRIDIUM).setUnlocalizedName("iridiumPick");
	public static Item iridiumAxe = new ItemInfinityRisingAxe(IRIDIUM).setUnlocalizedName("iridiumAxe");
	public static Item iridiumShovel = new ItemInfinityRisingShovel(IRIDIUM).setUnlocalizedName("iridiumShovel");
	public static Item boneSword = new ItemInfinityRisingSword(BONE).setUnlocalizedName("boneSword");
	public static Item bonePick = new ItemInfinityRisingPick(BONE).setUnlocalizedName("bonePick");
	public static Item boneAxe = new ItemInfinityRisingAxe(BONE).setUnlocalizedName("boneAxe");
	public static Item boneShovel = new ItemInfinityRisingShovel(BONE).setUnlocalizedName("boneShovel");
		
	public static void init()
	{
		RegisterHelper.registerItem(infinitySword);
		RegisterHelper.registerItem(iridiumSword);
		RegisterHelper.registerItem(iridiumPick);
		RegisterHelper.registerItem(iridiumAxe);
		RegisterHelper.registerItem(iridiumShovel);
		RegisterHelper.registerItem(boneSword);
		RegisterHelper.registerItem(bonePick);
		RegisterHelper.registerItem(boneAxe);
		RegisterHelper.registerItem(boneShovel);
	}
}