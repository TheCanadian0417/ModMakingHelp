package hunter.canadamod.init;

import hunter.canadamod.Reference;
import hunter.canadamod.init.items.MapleSyrupBottle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit 
{
public static Item maple_syrup_bottle_empty;

public static void init()
{
maple_syrup_bottle_empty = new MapleSyrupBottle("maple_syrup_bottle_empty");
}

public static void register()
{
registerItem(maple_syrup_bottle_empty);
}

	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
