package treyg.blocksomore.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCandle extends ModelBase
{
  //fields
    ModelRenderer wax;
    ModelRenderer wick;
  
  public ModelCandle()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      wax = new ModelRenderer(this, 0, 0);
      wax.addBox(0F, 0F, 0F, 2, 4, 2);
      wax.setRotationPoint(-1F, 20F, -1F);
      wax.setTextureSize(64, 64);
      wax.mirror = true;
      setRotation(wax, 0F, 0F, 0F);
      wick = new ModelRenderer(this, 12, 0);
      wick.addBox(0F, 0F, 0F, 1, 1, 1);
      wick.setRotationPoint(-0.5F, 19.1F, -0.5F);
      wick.setTextureSize(64, 64);
      wick.mirror = true;
      setRotation(wick, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    wax.render(f5);
    wick.render(f5);
  }
  
  public void renderModel(float f5)
  {
	  wax.render(f5);
	  wick.render(f5);
  }
  
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
