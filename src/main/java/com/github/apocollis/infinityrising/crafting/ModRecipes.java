package com.github.apocollis.infinityrising.crafting;

import com.github.apocollis.infinityrising.init.ModArmory;
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
		//Recipes for Vanilla Items
		GameRegistry.addShapelessRecipe(new ItemStack(Items.flint), Blocks.gravel);		
		GameRegistry.addShapedRecipe(new ItemStack(Items.saddle), new Object[] {"AAA", "ABA", " C ", 'A', Items.leather, 'B', Items.string, 'C', Items.iron_ingot});
		
		//Recipes for Mod Items
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.boneIngot), new Object[] {" A ", "AAA", " A ", 'A', Items.bone});
		GameRegistry.addSmelting(ModBlocks.iridiumOre, new ItemStack(ModItems.iridiumIngot),1.2F);
		GameRegistry.addRecipe(new ItemStack (ModArmory.iridiumPick), new Object[] {"AAA", " B ", " B ", 'A', ModItems.iridiumIngot, 'B', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack (ModArmory.iridiumAxe), new Object[] {" AA", " BA", " B ", 'A', ModItems.iridiumIngot, 'B', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack (ModArmory.iridiumShovel), new Object[] {" A ", " B ", " B ", 'A', ModItems.iridiumIngot, 'B', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack (ModArmory.iridiumSword), new Object[] {" A ", " A ", " B ", 'A', ModItems.iridiumIngot, 'B', Blocks.obsidian});
	}
}
