package treyg.blocksomore.items;

import treyg.blocksomore.mod_BlocksOMore;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemCraft extends ItemBlock
{
	public ItemCraft(int par1, Block block)
	{
		super(par1);
		setHasSubtypes(false);
	}
	
	public int getMetadata(int par1)
	{	
		return par1;
	}
}