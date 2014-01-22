package treyg.blocksomore.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCandleThick extends ModelBase
{
  //fields
    ModelRenderer wax;
    ModelRenderer wax2;
    ModelRenderer wax3;
    ModelRenderer wax4;
    ModelRenderer wax5;
    ModelRenderer wax6;
    ModelRenderer wax7;
    ModelRenderer wax8;
    ModelRenderer wick;
  
  public ModelCandleThick()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      wax = new ModelRenderer(this, 0, 0);
      wax.addBox(0F, 0F, 0F, 4, 3, 4);
      wax.setRotationPoint(-2F, 21F, -2F);
      wax.setTextureSize(64, 64);
      wax.mirror = true;
      setRotation(wax, 0F, 0F, 0F);
      wax2 = new ModelRenderer(this, 0, 0);
      wax2.addBox(0F, 0F, 0F, 2, 1, 2);
      wax2.setRotationPoint(1F, 23F, 1F);
      wax2.setTextureSize(64, 64);
      wax2.mirror = true;
      setRotation(wax2, 0F, 0F, 0F);
      wax3 = new ModelRenderer(this, 0, 0);
      wax3.addBox(0F, 0F, 0F, 1, 2, 1);
      wax3.setRotationPoint(-3F, 22F, -1F);
      wax3.setTextureSize(64, 64);
      wax3.mirror = true;
      setRotation(wax3, 0F, 0F, 0F);
      wax4 = new ModelRenderer(this, 0, 0);
      wax4.addBox(0F, 0F, 0F, 2, 1, 1);
      wax4.setRotationPoint(0F, 23F, -3F);
      wax4.setTextureSize(64, 64);
      wax4.mirror = true;
      setRotation(wax4, 0F, 0F, 0F);
      wax5 = new ModelRenderer(this, 0, 0);
      wax5.addBox(0F, 0F, 0F, 1, 1, 1);
      wax5.setRotationPoint(-3F, 23F, 0F);
      wax5.setTextureSize(64, 64);
      wax5.mirror = true;
      setRotation(wax5, 0F, 0F, 0F);
      wax6 = new ModelRenderer(this, 0, 0);
      wax6.addBox(0F, 0F, 0F, 1, 1, 1);
      wax6.setRotationPoint(1F, 22F, 2F);
      wax6.setTextureSize(64, 64);
      wax6.mirror = true;
      setRotation(wax6, 0F, 0F, 0F);
      wax7 = new ModelRenderer(this, 0, 0);
      wax7.addBox(0F, 0F, 0F, 1, 2, 1);
      wax7.setRotationPoint(2F, 22F, -2F);
      wax7.setTextureSize(64, 64);
      wax7.mirror = true;
      setRotation(wax7, 0F, 0F, 0F);
      wax8 = new ModelRenderer(this, 0, 0);
      wax8.addBox(0F, 0F, 0F, 1, 1, 1);
      wax8.setRotationPoint(-2F, 23F, 2F);
      wax8.setTextureSize(64, 64);
      wax8.mirror = true;
      setRotation(wax8, 0F, 0F, 0F);
      wick = new ModelRenderer(this, 22, 0);
      wick.addBox(0F, 0F, 0F, 1, 1, 1);
      wick.setRotationPoint(-0.5F, 20.2F, -0.5F);
      wick.setTextureSize(64, 64);
      wick.mirror = true;
      setRotation(wick, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    wax.render(f5);
    wax2.render(f5);
    wax3.render(f5);
    wax4.render(f5);
    wax5.render(f5);
    wax6.render(f5);
    wax7.render(f5);
    wax8.render(f5);
    wick.render(f5);
  }
  
  public void renderModel(float f5)
  {
	  wax.render(f5);
	    wax2.render(f5);
	    wax3.render(f5);
	    wax4.render(f5);
	    wax5.render(f5);
	    wax6.render(f5);
	    wax7.render(f5);
	    wax8.render(f5);
	    wick.render(f5); 
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
