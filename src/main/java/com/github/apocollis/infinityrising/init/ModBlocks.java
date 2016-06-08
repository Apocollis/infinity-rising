package com.github.apocollis.infinityrising.init;

import com.github.apocollis.infinityrising.blocks.BlockInfinityOre;
import com.github.apocollis.infinityrising.help.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks 
{
	public static Block infinityOre = new BlockInfinityOre();
	
	public static void init()
	{
		RegisterHelper.registerBlock(infinityOre);
	}
}