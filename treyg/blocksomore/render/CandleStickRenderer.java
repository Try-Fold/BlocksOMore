package treyg.blocksomore.render;

import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import treyg.blocksomore.models.ModelCandleStick;
import treyg.blocksomore.tileentity.TileEntityCandleStick;

public class CandleStickRenderer implements IItemRenderer
{
	private ModelCandleStick model;
	
	public CandleStickRenderer()
	{
		model = new ModelCandleStick();
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
		TileEntityRenderer.instance.renderTileEntityAt(new TileEntityCandleStick(), 0.0D, 0.0D, 0.0D, 0.0F);	
	}

}
