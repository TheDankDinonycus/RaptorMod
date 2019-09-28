package com.thedankdinonycus.raptormod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityCompy extends EntityWolf{

	public EntityCompy(World worldIn) 
	{
		super(worldIn);
	}
		@Override
		public EntityWolf createChild(EntityAgeable ageable)
		{
		return new EntityCompy(world);
	    }
		
		@Override
		protected SoundEvent getAmbientSound() {
			return super.getAmbientSound();
		}
		
		@Override
		protected SoundEvent getHurtSound(DamageSource source) {
			return super.getHurtSound(source);
		}
		@Override
		protected SoundEvent getDeathSound() {
			return super.getDeathSound();
		}
}
