package treyg.blocksomore.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPillar extends ModelBase
{
//fields
 ModelRenderer pillarBase;
 ModelRenderer pillarBase2;
 ModelRenderer pillar;
 ModelRenderer pillarTop2;
 ModelRenderer pillarTop;

public ModelPillar()
{
 textureWidth = 64;
 textureHeight = 64;
 
   pillarBase = new ModelRenderer(this, 0, 23);
   pillarBase.addBox(0F, 0F, 0F, 14, 1, 14);
   pillarBase.setRotationPoint(-7F, 23F, -7F);
   pillarBase.setTextureSize(64, 64);
   pillarBase.mirror = true;
   setRotation(pillarBase, 0F, 0F, 0F);
   pillarBase2 = new ModelRenderer(this, 0, 40);
   pillarBase2.addBox(0F, 0F, 0F, 10, 2, 10);
   pillarBase2.setRotationPoint(-5F, 21F, -5F);
   pillarBase2.setTextureSize(64, 64);
   pillarBase2.mirror = true;
   setRotation(pillarBase2, 0F, 0F, 0F);
   pillar = new ModelRenderer(this, 0, 0);
   pillar.addBox(0F, 0F, 0F, 6, 10, 6);
   pillar.setRotationPoint(-3F, 11F, -3F);
   pillar.setTextureSize(64, 64);
   pillar.mirror = true;
   setRotation(pillar, 0F, 0F, 0F);
   pillarTop2 = new ModelRenderer(this, 0, 40);
   pillarTop2.addBox(0F, 0F, 0F, 10, 2, 10);
   pillarTop2.setRotationPoint(-5F, 9F, -5F);
   pillarTop2.setTextureSize(64, 64);
   pillarTop2.mirror = true;
   setRotation(pillarTop2, 0F, 0F, 0F);
   pillarTop = new ModelRenderer(this, 0, 23);
   pillarTop.addBox(0F, 0F, 0F, 14, 1, 14);
   pillarTop.setRotationPoint(-7F, 8F, -7F);
   pillarTop.setTextureSize(64, 64);
   pillarTop.mirror = true;
   setRotation(pillarTop, 0F, 0F, 0F);
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
{
super.render(entity, f, f1, f2, f3, f4, f5);
setRotationAngles(f, f1, f2, f3, f4, f5);
pillarBase.render(f5);
pillarBase2.render(f5);
pillar.render(f5);
pillarTop.render(f5);
pillarTop2.render(f5);
}
public void renderModel(float f5){
	pillarBase.render(f5);
	pillarBase2.render(f5);
	pillar.render(f5);
	pillarTop.render(f5);
	pillarTop2.render(f5);
}

private void setRotation(ModelRenderer model, float x, float y, float z)
{

}

public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
{
}

}

