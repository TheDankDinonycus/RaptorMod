package com.thedankdinonycus.raptormod.entity;

import com.google.common.base.Predicate;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIBeg;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISit;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityCompy extends EntityWolf
{

	public EntityCompy(World worldIn) 
	{
		    super(worldIn);
		    this.setSize(0.6F, 1.3F);
	    }
	
	    @Override
	    protected void initEntityAI() 
	    {
	    	  this.aiSit = new EntityAISit(this);
	          this.tasks.addTask(1, new EntityAISwimming(this));
	          this.tasks.addTask(2, this.aiSit);
	          this.tasks.addTask(4, new EntityAILeapAtTarget(this, 0.4F));
	          this.tasks.addTask(5, new EntityAIAttackMelee(this, 1.0D, true));
	          this.tasks.addTask(6, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
	          this.tasks.addTask(7, new EntityAIMate(this, 1.0D));
	          this.tasks.addTask(8, new EntityAIWanderAvoidWater(this, 1.0D));
	          this.tasks.addTask(9, new EntityAIBeg(this, 8.0F));
	          this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	          this.tasks.addTask(10, new EntityAILookIdle(this));
	    }
	    
	    @Override
	    protected void applyEntityAttributes() 
	    {
	    	super.applyEntityAttributes();
	    	this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(26.0D);
	    	this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.23D);
	    }
	    
	    @Override
	    public float getEyeHeight() 
	    {
	    	return 1.2F;
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
