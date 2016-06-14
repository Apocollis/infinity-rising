package com.github.apocollis.infinityrising.handlers;

import java.util.Random;
import com.github.apocollis.infinityrising.init.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class MobDropsHandler 
{	
	@SubscribeEvent
	public void onMobDrops(LivingDropsEvent event)
	{
		//Generate a random number 0-99. A Coin will drop for the rates set below
		int DropGoldCoin = 1;
		int DropSilverCoin = 10;
		Random rand = new Random();
		int DropChance = rand.nextInt(100);
		
		//Reduces the chance of getting a coin if the mob is passive
		if (!(event.entity instanceof IMob))
		{
			DropChance = DropChance + 5;
			//System.out.println("Passive Mob Penalty");
		} 
		//System.out.println("Drop Chance:" + DropChance);
		if(DropChance<DropSilverCoin)
		{
			if (DropChance<DropGoldCoin)
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
