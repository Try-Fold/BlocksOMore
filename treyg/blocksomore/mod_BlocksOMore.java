package treyg.blocksomore;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import treyg.blocksomore.blocks.BlockCandle;
import treyg.blocksomore.blocks.BlockCandleStick;
import treyg.blocksomore.blocks.BlockCandleThick;
import treyg.blocksomore.blocks.BlockCrafting;
import treyg.blocksomore.client.ClientPacketHandler;
import treyg.blocksomore.common.CommonProxy;
import treyg.blocksomore.common.ServerPacketHandler;
import treyg.blocksomore.items.ItemCandle;
import treyg.blocksomore.items.ItemCraft;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@NetworkMod(clientSideRequired=true,serverSideRequired=true, //Whether client side and server side are needed
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"BlocksOMore"}, packetHandler = ClientPacketHandler.class),
serverPacketHandlerSpec = @SidedPacketHandler(channels = {"BlocksOMore"}, packetHandler = ServerPacketHandler.class)) 

//MOD BASICS
@Mod(modid="BlocksOMore",name="Block 'O More",version="v0.1")

public class mod_BlocksOMore 
{
	@Instance("BlocksOMore")
	public static mod_BlocksOMore instance = new mod_BlocksOMore();

	@SidedProxy(clientSide = "treyg.blocksomore.client.ClientProxy", serverSide = "treyg.blocksomore.common.CommonProxy")
	public static CommonProxy proxy;
	
	public static String modid = "BlocksOMore";
	
	public static int craftingID = 58;
	public static int candleID = 1004;
	
	public static Item craftItem;
	public static Item candleItem;
	
	public static Block crafting;
	
	//Candles
	public static Block candle;
	public static Block candleThick;
	public static Block candleStick;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{	
	}
	
	@Init
	public void Init(FMLInitializationEvent event)
	{
		Block.blocksList[58] = null;
		
		crafting = (new BlockCrafting(craftingID)).setUnlocalizedName("Crafting Table").setCreativeTab(this.blocksOmore);
		candle = (new BlockCandle(candleID)).setUnlocalizedName("Candle").setCreativeTab(this.blocksOmore);
		candleThick = (new BlockCandleThick(candleID + 1)).setUnlocalizedName("Candle Thick").setCreativeTab(this.blocksOmore);
		candleStick = (new BlockCandleStick(candleID + 2)).setUnlocalizedName("Candle Stick").setCreativeTab(this.blocksOmore);
		
		craftItem = (new ItemCraft (craftingID-256, crafting).setUnlocalizedName("Crafting Table"));
		candleItem = (new ItemCandle(candleID-256, candle).setUnlocalizedName("Candle"));
		
		NetworkRegistry.instance().registerGuiHandler(this, proxy);
	
		GameRegistry.registerBlock(crafting, ItemCraft.class, modid + (crafting.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(candle, ItemCandle.class, modid + (candle.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(candleThick, ItemCandle.class, modid + (candleThick.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(candleStick, ItemCandle.class, modid + (candleStick.getUnlocalizedName().substring(5)));
	
		
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.allRegisters();
	}
	
	public static CreativeTabs blocksOmore = new CreativeTabs("blocksOmore") 
	{
		public ItemStack getIconItemStack()
		{
			return new ItemStack(candleStick, 1, 0);
         }
	};
}

