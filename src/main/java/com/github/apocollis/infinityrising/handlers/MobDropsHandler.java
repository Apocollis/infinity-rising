package com.github.apocollis.infinityrising.handlers;

import java.util.Random;
import com.github.apocollis.infinityrising.init.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class MobDropsHandler 
{	
	@SubscribeEvent
	public void onMobDrops(LivingDropsEvent event)
	{
		Random rand = new Random();
		int DropChance = rand.nextInt(100);
		if(DropChance<10)
		{
			if (DropChance<1)
			{
				ItemStack stack = new ItemStack(ModItems.goldenCoin);
				EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
					
				event.drops.add(drop);
			}else
			{
				ItemStack stack = new ItemStack(ModItems.silverCoin);
				EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
					
				event.drops.add(drop);
			}
		}
	}
}
