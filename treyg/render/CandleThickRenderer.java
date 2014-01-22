package treyg.render;

import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import treyg.blocksomore.models.ModelCandleThick;
import treyg.blocksomore.tileentity.TileEntityCandleThick;

public class CandleThickRenderer implements IItemRenderer
{
	private ModelCandleThick model;
	
	public CandleThickRenderer()
	{
		model = new ModelCandleThick();
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
		TileEntityRenderer.instance.renderTileEntityAt(new TileEntityCandleThick(), 0.0D, 0.0D, 0.0D, 0.0F);	
	}

}
