package com.thedankdinonycus.raptormod.util.handlers;

import com.thedankdinonycus.raptormod.entity.EntityCompy;
import com.thedankdinonycus.raptormod.entity.render.RenderCompy;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityCompy.class, new IRenderFactory<EntityCompy>()
		{
			@Override
			public Render<? super EntityCompy> createRenderFor(RenderManager manager) 
			{
				return new RenderCompy(manager);
			}
		});
				
	}
}
