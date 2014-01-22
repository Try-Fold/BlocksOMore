package treyg.blocksomore.blocks;

import java.util.List;
import java.util.Random;

import treyg.blocksomore.mod_BlocksOMore;
import treyg.blocksomore.tileentity.TileEntityCandle;
import treyg.blocksomore.tileentity.TileEntityCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockCrafting extends BlockContainer
{

	public BlockCrafting(int par1)
	{
		super(par1, Material.clay);
		this.setHardness(0F);
		this.setResistance(1F);
	}
	
	public TileEntity createNewTileEntity(World world)
	{
		return new TileEntityCraft();
	}
	
	public int damageDropped(int par1)
	{
	    return par1;
	}
	
	@Override
	public int getRenderType()
	{
		return mod_BlocksOMore.craftingID;
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
		par1IconRegister.registerIcon("blocksomore/textures/blocks/craftTable.png");
    }
	
	public void updateIcons(IconRegister par1IconRegister)
	{
		par1IconRegister.registerIcon("blocksomore/textures/blocks/craftTable.png");
	}
	
	 public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	    {
	        if (par1World.isRemote)
	        {
	            return true;
	        }
	        else
	        {
	            par5EntityPlayer.displayGUIWorkbench(par2, par3, par4);
	            return true;
	        }
	    }


}

