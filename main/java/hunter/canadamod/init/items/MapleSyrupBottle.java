package hunter.canadamod.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MapleSyrupBottle extends Item 
{
	public MapleSyrupBottle(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BREWING);
	}
}
