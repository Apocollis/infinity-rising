package com.github.apocollis.infinityrising.items;

import com.github.apocollis.infinityrising.help.Reference;
import com.github.apocollis.infinityrising.tabs.ModTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;

public class ItemInfinityRisingPick extends ItemPickaxe
{
	public final ToolMaterial toolMaterial;
	
	public ItemInfinityRisingPick(ToolMaterial EnumToolMaterial)
	{
		super(EnumToolMaterial);
		toolMaterial = EnumToolMaterial;
		setCreativeTab(ModTabs.tabInfinityRising);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
