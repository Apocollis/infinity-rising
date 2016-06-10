package com.github.apocollis.infinityrising.blocks;

import com.github.apocollis.infinityrising.help.Reference;
import com.github.apocollis.infinityrising.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockIridiumOre extends Block
{
	public BlockIridiumOre()
	{
		super(Material.iron);
		setBlockName("iridiumOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabInfinityRising);
		setLightLevel(0.2F);
	}
}
