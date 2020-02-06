package hunter.canadamod.proxy;

import hunter.canadamod.handlers.RegistryHandler;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.Common();
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
