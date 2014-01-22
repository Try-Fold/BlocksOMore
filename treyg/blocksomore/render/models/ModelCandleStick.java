package treyg.blocksomore.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCandleStick extends ModelBase
{
  //fields
    ModelRenderer stickBase;
    ModelRenderer stickBase2;
    ModelRenderer stickRod;
    ModelRenderer stickGuard;
    ModelRenderer wax;
  
  public ModelCandleStick()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      stickBase = new ModelRenderer(this, 0, 0);
      stickBase.addBox(0F, 0F, 0F, 4, 1, 4);
      stickBase.setRotationPoint(-2F, 23F, -2F);
      stickBase.setTextureSize(64, 64);
      stickBase.mirror = true;
      setRotation(stickBase, 0F, 0F, 0F);
      stickBase2 = new ModelRenderer(this, 0, 0);
      stickBase2.addBox(0F, 0F, 0F, 2, 1, 2);
      stickBase2.setRotationPoint(-1F, 22F, -1F);
      stickBase2.setTextureSize(64, 64);
      stickBase2.mirror = true;
      setRotation(stickBase2, 0F, 0F, 0F);
      stickRod = new ModelRenderer(this, 0, 0);
      stickRod.addBox(0F, 0F, 0F, 1, 2, 1);
      stickRod.setRotationPoint(-0.5F, 20F, -0.5F);
      stickRod.setTextureSize(64, 64);
      stickRod.mirror = true;
      setRotation(stickRod, 0F, 0F, 0F);
      stickGuard = new ModelRenderer(this, 0, 0);
      stickGuard.addBox(0F, 0F, 0F, 2, 1, 2);
      stickGuard.setRotationPoint(-1F, 19F, -1F);
      stickGuard.setTextureSize(64, 64);
      stickGuard.mirror = true;
      setRotation(stickGuard, 0F, 0F, 0F);
      wax = new ModelRenderer(this, 18, 0);
      wax.addBox(0F, 0F, 0F, 1, 3, 1);
      wax.setRotationPoint(-0.5F, 16F, -0.5F);
      wax.setTextureSize(64, 64);
      wax.mirror = true;
      setRotation(wax, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    stickBase.render(f5);
    stickBase2.render(f5);
    stickRod.render(f5);
    stickGuard.render(f5);
    wax.render(f5);
  }
  
  public void renderModel(float f5)
  {
	  stickBase.render(f5);
	    stickBase2.render(f5);
	    stickRod.render(f5);
	    stickGuard.render(f5);
	    wax.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
