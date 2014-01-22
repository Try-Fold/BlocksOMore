package treyg.blocksomore.tileentity.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import treyg.blocksomore.render.models.ModelCandle;
import treyg.blocksomore.tileentity.TileEntityCandle;

public class TileEntityCandleRenderer extends TileEntitySpecialRenderer
{
	private ModelCandle model;
	
	public Minecraft mc = Minecraft.getMinecraft();
	
	public TileEntityCandleRenderer()
	{
		model = new ModelCandle();
	}
	
	public void renderAModelAt(TileEntityCandle tile, double d, double d1, double d2, float f)
	{
		int i =0; // a regular int, with a zero. more on this below

		if(tile.worldObj != null) // to tell the world that your object is placed.
		{
			i =(tile.worldObj.getBlockMetadata(tile.xCoord, tile.yCoord, tile.zCoord)); // to tell the game it needs to pick up metadata from your block
		}


		switch (i) // the good part. get's your block muliple textures
		{
		case 0:
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("textures/blocks/blocksomore/textures/blocks/candle.png"));
			break;
		default:
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("textures/blocks/blocksomore/textures/blocks/candle.png"));
		}

	GL11.glPushMatrix(); //start
	GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F); //size
	GL11.glRotatef(0, 0.0F, 1.0F, 0.0F); //change the first 0 in like 90 to make it rotate 90 degrees.
	GL11.glScalef(1.0F, -1F, -1F); // to make your block have a normal positioning. comment out to see what happens
	model.renderModel(0.0625F); //renders and 0.0625F is exactly 1/16. every block has 16 entitys/pixels. if you make the number 1, every pixel will be as big as a block. make it 0.03125 and your block will be half as big as a normal one.
	GL11.glPopMatrix(); //end


	}

	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		renderAModelAt((TileEntityCandle) tileentity, d, d1, d2, f); //where to render
	}

}
