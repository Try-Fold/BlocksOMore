package treyg.client;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import treyg.blocksomore.mod_BlocksOMore;
import treyg.blocksomore.items.ItemCandle;
import treyg.blocksomore.items.ItemCraft;
import treyg.blocksomore.tileentity.TileEntityCandle;
import treyg.blocksomore.tileentity.TileEntityCandleStick;
import treyg.blocksomore.tileentity.TileEntityCandleThick;
import treyg.blocksomore.tileentity.TileEntityCraft;
import treyg.blocksomore.tileentity.renderer.TileEntityCandleRenderer;
import treyg.blocksomore.tileentity.renderer.TileEntityCandleStickRenderer;
import treyg.blocksomore.tileentity.renderer.TileEntityCandleThickRenderer;
import treyg.blocksomore.tileentity.renderer.TileEntityCraftRenderer;
import treyg.common.CommonProxy;
import treyg.render.CandleRenderer;
import treyg.render.CandleStickRenderer;
import treyg.render.CandleThickRenderer;
import treyg.render.CraftRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ClientProxy extends CommonProxy
{
	public mod_BlocksOMore mod;
	
	@Override
	public void allRegisters()
	{
		this.registerNames();
		this.registerTileEntities();
		this.blockRegisters();
	}
	
	public void registerNames()
	{
		LanguageRegistry.addName(mod.crafting, "Crafting Table");
		LanguageRegistry.addName(mod.candle, "Candle");
		LanguageRegistry.addName(mod.candleThick, "Candle Thick");
		LanguageRegistry.addName(mod.candleStick, "Candle Stick");
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.blocksOmore", "en_US", "Blocks O' More");
	}
	
	public void registerTileEntities()
	{	
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCraft.class, new TileEntityCraftRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCandle.class, new TileEntityCandleRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCandleThick.class, new TileEntityCandleThickRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCandleStick.class, new TileEntityCandleStickRenderer());
		
		MinecraftForgeClient.registerItemRenderer(mod.crafting.blockID, new CraftRenderer());
		MinecraftForgeClient.registerItemRenderer(mod.candle.blockID, new CandleRenderer());
		MinecraftForgeClient.registerItemRenderer(mod.candleThick.blockID, new CandleThickRenderer());
		MinecraftForgeClient.registerItemRenderer(mod.candleStick.blockID, new CandleStickRenderer());
	}
	
	public void blockRegisters()
	{
		
	}
}
