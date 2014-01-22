package treyg.blocksomore.render;

import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import treyg.blocksomore.render.models.ModelCraftingTable;
import treyg.blocksomore.tileentity.TileEntityCraft;

public class CraftRenderer implements IItemRenderer
{
	private ModelCraftingTable model;
	
	public CraftRenderer()
	{
		model = new ModelCraftingTable();
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
		TileEntityRenderer.instance.renderTileEntityAt(new TileEntityCraft(), 0.0D, 0.0D, 0.0D, 0.0F);	
	}

}
