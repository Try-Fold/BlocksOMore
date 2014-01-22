package treyg.blocksomore.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCraftingTable extends ModelBase
{
  //fields
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer top;
    ModelRenderer support1;
    ModelRenderer support2;
    ModelRenderer support3;
    ModelRenderer support4;
    ModelRenderer clothtop;
  
  public ModelCraftingTable()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      leg1 = new ModelRenderer(this, 0, 0);
      leg1.addBox(0F, 0F, 0F, 1, 15, 1);
      leg1.setRotationPoint(-8F, 9F, 7F);
      leg1.setTextureSize(64, 64);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 0);
      leg2.addBox(0F, 0F, 0F, 1, 15, 1);
      leg2.setRotationPoint(7F, 9F, 7F);
      leg2.setTextureSize(64, 64);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 0);
      leg3.addBox(0F, 0F, 0F, 1, 15, 1);
      leg3.setRotationPoint(7F, 9F, -8F);
      leg3.setTextureSize(64, 64);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 0);
      leg4.addBox(0F, 0F, 0F, 1, 15, 1);
      leg4.setRotationPoint(-8F, 9F, -8F);
      leg4.setTextureSize(64, 64);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      top = new ModelRenderer(this, 0, 30);
      top.addBox(0F, 0F, 0F, 16, 1, 16);
      top.setRotationPoint(-8F, 9F, -8F);
      top.setTextureSize(64, 64);
      top.mirror = true;
      setRotation(top, 0F, 0F, 0F);
      support1 = new ModelRenderer(this, 0, 0);
      support1.addBox(0F, 0F, 0F, 1, 20, 1);
      support1.setRotationPoint(7F, 9F, -8F);
      support1.setTextureSize(64, 64);
      support1.mirror = true;
      setRotation(support1, 0F, 0F, 0.837758F);
      support2 = new ModelRenderer(this, 0, 0);
      support2.addBox(0F, 0F, 0F, 1, 20, 1);
      support2.setRotationPoint(-8F, 10F, 7F);
      support2.setTextureSize(64, 64);
      support2.mirror = true;
      setRotation(support2, 0F, 0F, -0.8552113F);
      support3 = new ModelRenderer(this, 0, 0);
      support3.addBox(0F, 0F, 0F, 1, 20, 1);
      support3.setRotationPoint(-8F, 10F, -8F);
      support3.setTextureSize(64, 64);
      support3.mirror = true;
      setRotation(support3, 0.8552113F, 0F, 0F);
      support4 = new ModelRenderer(this, 0, 0);
      support4.addBox(0F, 0F, 0F, 1, 20, 1);
      support4.setRotationPoint(7F, 9F, 7F);
      support4.setTextureSize(64, 64);
      support4.mirror = true;
      setRotation(support4, -0.837758F, 0F, 0F);
      clothtop = new ModelRenderer(this, 0, 49);
      clothtop.addBox(0F, 0F, 0F, 12, 1, 12);
      clothtop.setRotationPoint(-8.5F, 8F, 0F);
      clothtop.setTextureSize(64, 64);
      clothtop.mirror = true;
      setRotation(clothtop, 0F, 0.7853982F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    top.render(f5);
    support1.render(f5);
    support2.render(f5);
    support3.render(f5);
    support4.render(f5);
    clothtop.render(f5);
  }
  
  public void renderModel(float f5)
  {
	  leg1.render(f5);
	  leg2.render(f5);
	  leg3.render(f5);
	  leg4.render(f5);
	  top.render(f5);
	  support1.render(f5);
	  support2.render(f5);
	  support3.render(f5);
	  support4.render(f5);
	  clothtop.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
