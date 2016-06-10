package com.github.apocollis.infinityrising.tabs;

import com.github.apocollis.infinityrising.init.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class InfinityRisingTab extends CreativeTabs
{
	String name;
	
	public InfinityRisingTab(int par1, String par2Str)
	{
		super(par1, par2Str);
		this.name = par2Str;
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return ModItems.infinitySword;
	}
}
