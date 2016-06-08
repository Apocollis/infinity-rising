package com.github.apocollis.infinityrising.init;

import com.github.apocollis.infinityrising.help.RegisterHelper; 
import com.github.apocollis.infinityrising.items.InfinityRisingItem;

import net.minecraft.item.Item;

public class ModItems 
{
	public static Item boneIngot = new InfinityRisingItem().setUnlocalizedName("boneIngot");
	public static Item goldenCoin = new InfinityRisingItem().setUnlocalizedName("goldenCoin");
	
	public static void init()
	{
		RegisterHelper.registerItem(boneIngot);
		RegisterHelper.registerItem(goldenCoin);
	}
}
