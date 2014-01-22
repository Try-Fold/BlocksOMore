package treyg.render;

import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import treyg.blocksomore.models.ModelCandle;
import treyg.blocksomore.tileentity.TileEntityCandle;

public class CandleRenderer implements IItemRenderer
{
	private ModelCandle model;
	
	public CandleRenderer()
	{
		model = new ModelCandle();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
	{
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		TileEntityRenderer.instance.renderTileEntityAt(new TileEntityCandle(), 0.0D, 0.0D, 0.0D, 0.0F);	
	}

}
