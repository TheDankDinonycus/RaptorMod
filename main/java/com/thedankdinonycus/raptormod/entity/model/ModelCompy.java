package com.thedankdinonycus.raptormod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelCompy - TheDankDinonycus
 * Created using Tabula 7.0.1
 */
public class ModelCompy extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Tail1;
    public ModelRenderer Neck1;
    public ModelRenderer RightThigh;
    public ModelRenderer LeftThigh;
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;
    public ModelRenderer Tail2;
    public ModelRenderer Neck2;
    public ModelRenderer Head;
    public ModelRenderer TopMouth;
    public ModelRenderer BottomMouth;
    public ModelRenderer RightMiddle;
    public ModelRenderer RightAnkle;
    public ModelRenderer RightFoot;
    public ModelRenderer LeftMiddle;
    public ModelRenderer LeftAnkle;
    public ModelRenderer LeftFoot;
    public ModelRenderer RightHand;
    public ModelRenderer LeftHand;

    public ModelCompy() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.RightHand = new ModelRenderer(this, 25, 17);
        this.RightHand.setRotationPoint(1.8F, 2.3F, 0.0F);
        this.RightHand.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(RightHand, 0.0F, 0.03316125578789226F, -0.20943951023931953F);
        this.RightFoot = new ModelRenderer(this, 0, 14);
        this.RightFoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightFoot.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(RightFoot, 0.0F, 0.0F, -0.029670597283903602F);
        this.Neck2 = new ModelRenderer(this, 43, 9);
        this.Neck2.setRotationPoint(3.9F, -0.2F, 0.0F);
        this.Neck2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Neck2, 0.0F, 0.0F, 0.41015237421866746F);
        this.LeftAnkle = new ModelRenderer(this, 51, 16);
        this.LeftAnkle.setRotationPoint(-1.4F, 6.0F, 0.0F);
        this.LeftAnkle.addBox(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(LeftAnkle, 0.0F, 0.0F, -0.8970992355250854F);
        this.Neck1 = new ModelRenderer(this, 38, 0);
        this.Neck1.setRotationPoint(3.7F, 0.7F, 0.4F);
        this.Neck1.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(Neck1, 0.0F, 0.0F, -0.40578905108868163F);
        this.BottomMouth = new ModelRenderer(this, 49, 0);
        this.BottomMouth.setRotationPoint(2.3F, 1.8F, 0.5F);
        this.BottomMouth.addBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F);
        this.RightAnkle = new ModelRenderer(this, 53, 12);
        this.RightAnkle.setRotationPoint(-1.4F, 6.0F, 0.0F);
        this.RightAnkle.addBox(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(RightAnkle, 0.0F, 0.0F, -0.8970992355250854F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(-2.3F, 12.9F, 3.0F);
        this.Body.addBox(0.0F, 0.0F, -0.2F, 8, 4, 4, 0.0F);
        this.setRotateAngle(Body, 0.0F, 1.583013631558857F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 24, 0);
        this.Tail1.setRotationPoint(-3.8F, 0.0F, 0.3F);
        this.Tail1.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
        this.LeftArm = new ModelRenderer(this, 0, 9);
        this.LeftArm.setRotationPoint(6.0F, 1.5F, 2.5F);
        this.LeftArm.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(LeftArm, 0.0F, 0.0F, 0.23736477827122882F);
        this.Tail2 = new ModelRenderer(this, 10, 9);
        this.Tail2.setRotationPoint(-4.7F, 0.0F, 0.6F);
        this.Tail2.addBox(0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F);
        this.RightMiddle = new ModelRenderer(this, 35, 12);
        this.RightMiddle.setRotationPoint(0.0F, 3.9F, 0.0F);
        this.RightMiddle.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(RightMiddle, 0.0F, 0.0F, -0.6550294440927893F);
        this.LeftMiddle = new ModelRenderer(this, 43, 16);
        this.LeftMiddle.setRotationPoint(0.0F, 3.9F, 0.0F);
        this.LeftMiddle.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(LeftMiddle, 0.0F, 0.0F, -0.6550220682734719F);
        this.LeftHand = new ModelRenderer(this, 0, 19);
        this.LeftHand.setRotationPoint(1.8F, 2.3F, 0.0F);
        this.LeftHand.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(LeftHand, 0.0F, -0.03316125578789226F, -0.20943951023931953F);
        this.LeftFoot = new ModelRenderer(this, 19, 17);
        this.LeftFoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftFoot.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(LeftFoot, 0.0F, 0.0F, -0.029670597283903602F);
        this.RightArm = new ModelRenderer(this, 36, 6);
        this.RightArm.setRotationPoint(6.0F, 1.5F, -1.0F);
        this.RightArm.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(RightArm, 0.0F, 0.0F, 0.23736477827122882F);
        this.RightThigh = new ModelRenderer(this, 50, 4);
        this.RightThigh.setRotationPoint(0.0F, 1.8F, -1.3F);
        this.RightThigh.addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(RightThigh, 0.0F, 0.0F, 0.7953465401338159F);
        this.LeftThigh = new ModelRenderer(this, 24, 6);
        this.LeftThigh.setRotationPoint(0.0F, 1.8F, 2.8F);
        this.LeftThigh.addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(LeftThigh, 0.0F, 0.0F, 0.7953487725589838F);
        this.Head = new ModelRenderer(this, 7, 13);
        this.Head.setRotationPoint(-0.8F, -2.9F, 0.0F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
        this.TopMouth = new ModelRenderer(this, 21, 14);
        this.TopMouth.setRotationPoint(2.3F, 0.9F, 0.5F);
        this.TopMouth.addBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F);
        this.setRotateAngle(TopMouth, 0.0F, 0.0F, -0.008901179185171082F);
        this.RightArm.addChild(this.RightHand);
        this.RightAnkle.addChild(this.RightFoot);
        this.Neck1.addChild(this.Neck2);
        this.LeftMiddle.addChild(this.LeftAnkle);
        this.Body.addChild(this.Neck1);
        this.Head.addChild(this.BottomMouth);
        this.RightMiddle.addChild(this.RightAnkle);
        this.Body.addChild(this.Tail1);
        this.Body.addChild(this.LeftArm);
        this.Tail1.addChild(this.Tail2);
        this.RightThigh.addChild(this.RightMiddle);
        this.LeftThigh.addChild(this.LeftMiddle);
        this.LeftArm.addChild(this.LeftHand);
        this.LeftAnkle.addChild(this.LeftFoot);
        this.Body.addChild(this.RightArm);
        this.Body.addChild(this.RightThigh);
        this.Body.addChild(this.LeftThigh);
        this.Neck2.addChild(this.Head);
        this.Head.addChild(this.TopMouth);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.RightThigh.rotateAngleZ = MathHelper.cos(limbSwing = 0.6662F) * 1.4F * limbSwingAmount;
    	this.LeftThigh.rotateAngleZ = MathHelper.cos(limbSwing = 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Head.rotateAngleX = headPitch * 0.017453292F;
    	
    }
}
