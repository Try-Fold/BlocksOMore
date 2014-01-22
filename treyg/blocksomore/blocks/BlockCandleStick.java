package treyg.blocksomore.blocks;

import java.util.List;
import java.util.Random;

import treyg.blocksomore.mod_BlocksOMore;
import treyg.blocksomore.tileentity.TileEntityCandle;
import treyg.blocksomore.tileentity.TileEntityCandleStick;
import treyg.blocksomore.tileentity.TileEntityCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockCandleStick extends BlockContainer
{

	public BlockCandleStick(int par1)
	{
		super(par1, Material.clay);
		this.setHardness(.1F);
		this.setResistance(1F);
		this.setBlockBounds(.365F, 0F, .365F, .635F, .5F, .635F);
		this.setLightValue(.7F);
	}
	
	public TileEntity createNewTileEntity(World world)
	{
		return new TileEntityCandleStick();
	}
	
	public int damageDropped(int par1)
	{
	    return par1;
	}
	
	@Override
	public int getRenderType()
	{
		return mod_BlocksOMore.candleID + 2;
	} 

	@Override
	public boolean isOpaqueCube() 
	{
		return false;
	} 
	
	@Override
	public boolean renderAsNormalBlock() 
	{
		return false;
	}
	
	@SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
	{
		par1IconRegister.registerIcon("blocksomore/textures/blocks/candleStick.png");
    }
	
	public void updateIcons(IconRegister par1IconRegister)
	{
		par1IconRegister.registerIcon("blocksomore/textures/blocks/candleStick.png");
	}
	
	 public void randomDisplayTick(World par1World, int x, int y, int z, Random par5Random)
	    {
	        int l = par1World.getBlockMetadata(x, y, z);
	        double d0 = (double)((float)x + 0.5F);
	        double d1 = (double)((float)y + 0.7F);
	        double d2 = (double)((float)z + 0.5F);
	        double d3 = 0.2199999988079071D;
	        double d4 = 0.27000001072883606D;

	        par1World.spawnParticle("smoke", d0, d1 - .1, d2, 0.0D, 0.0D, 0.0D);
	        par1World.spawnParticle("flame", d0, d1 - .1, d2, 0.0D, 0.0D, 0.0D);
	    }


}

