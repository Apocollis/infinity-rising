package com.github.apocollis.infinityrising.crafting;

import com.github.apocollis.infinityrising.init.ModBlocks;
import com.github.apocollis.infinityrising.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes
{
	public static void init()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.boneIngot), new Object[] {" A ", "AAA", " A ", 'A', Items.bone});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.flint), Blocks.gravel);
		GameRegistry.addSmelting(ModBlocks.iridiumOre, new ItemStack(ModItems.iridiumIngot),1.2F);
	}
}
