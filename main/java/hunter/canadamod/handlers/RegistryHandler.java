package hunter.canadamod.handlers;

import hunter.canadamod.init.ItemInit;
import net.minecraftforge.client.model.ModelLoader;

public class RegistryHandler
{
	public static void Client()
	{	
	ItemInit.register();	
	}
	
	public static void Common()
	{
		ItemInit.init();
		ItemInit.register();
		
	}
}
