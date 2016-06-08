package com.github.apocollis.infinityrising.blocks;

import com.github.apocollis.infinityrising.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockInfinityOre extends Block
{
	public BlockInfinityOre()
	{
		super(Material.iron);
		setBlockName("infinityOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
	}
}