package treyg.blocksomore.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMiddlePillar extends ModelBase
{
  //fields
    ModelRenderer pillar;
  
  public ModelMiddlePillar()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      pillar = new ModelRenderer(this, 0, 16);
      pillar.addBox(0F, 0F, 0F, 6, 16, 6);
      pillar.setRotationPoint(-3F, 8F, -3F);
      pillar.setTextureSize(64, 64);
      pillar.mirror = true;
      setRotation(pillar, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
  super.render(entity, f, f1, f2, f3, f4, f5);
  setRotationAngles(f, f1, f2, f3, f4, f5);
  pillar.render(f5);
  }
  public void renderModel(float f5){
  	pillar.render(f5);
  }

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {

  }

  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
