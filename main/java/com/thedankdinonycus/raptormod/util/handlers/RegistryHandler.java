package com.thedankdinonycus.raptormod.util.handlers;

import com.thedankdinonycus.raptormod.init.EntityInit;

public class RegistryHandler 
{
	
	{
		
	}
	
	public static void preInitRegistries()
	{
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
	}

}
