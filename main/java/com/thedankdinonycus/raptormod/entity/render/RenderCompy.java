package com.thedankdinonycus.raptormod.entity.render;

import com.thedankdinonycus.raptormod.entity.EntityCompy;
import com.thedankdinonycus.raptormod.entity.model.ModelCompy;
import com.thedankdinonycus.raptormod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCompy extends RenderLiving<EntityCompy>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/compy.png");
	
	public RenderCompy(RenderManager manager)
	{
		super(manager, new ModelCompy(), 0.5F);
	}

	@Override
	protected net.minecraft.util.ResourceLocation getEntityTexture(EntityCompy entity)
	{
		return TEXTURES;
	}
	protected void applyRotations(EntityCompy entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
