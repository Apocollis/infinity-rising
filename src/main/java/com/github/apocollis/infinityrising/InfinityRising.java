package com.github.apocollis.infinityrising;

//Custom Mod for Infinity Rising modpack

import com.github.apocollis.infinityrising.crafting.ModRecipes;
import com.github.apocollis.infinityrising.generation.InfinityRisingWorldGeneration;
import com.github.apocollis.infinityrising.handlers.MobDropsHandler;
import com.github.apocollis.infinityrising.help.Reference;
import com.github.apocollis.infinityrising.init.ModArmory;
import com.github.apocollis.infinityrising.init.ModBlocks;
import com.github.apocollis.infinityrising.init.ModItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class InfinityRising 
{
	@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		ModItems.init();
		ModArmory.init();
		ModBlocks.init();
		GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);
    }
	
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
    	ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
    }
    
	InfinityRisingWorldGeneration eventWorldGen = new InfinityRisingWorldGeneration();
}