package com.thedankdinonycus.raptormod.init;

import com.thedankdinonycus.raptormod.Main;
import com.thedankdinonycus.raptormod.entity.EntityCompy;
import com.thedankdinonycus.raptormod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("compy", EntityCompy.class, Reference.ENTITY_COMPY, 50, 10784335, 6603078);
	}
	
	public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ";" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
    }
}
    
