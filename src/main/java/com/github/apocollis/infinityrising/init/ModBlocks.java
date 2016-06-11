package com.github.apocollis.infinityrising.init;

import com.github.apocollis.infinityrising.blocks.BlockIridiumOre;
import com.github.apocollis.infinityrising.help.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks 
{
	public static Block iridiumOre = new BlockIridiumOre();
	
	public static void init()
	{
		RegisterHelper.registerBlock(iridiumOre);
	}
}
