package com.cloobs.eatcoal;

import com.cloobs.eatcoal.handler.ConfigurationHandler;
import com.cloobs.eatcoal.reference.Reference;
import com.cloobs.eatcoal.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME,version= Reference.VERSION, guiFactory = Reference.GUI_FACTROY_CLASS)
public class EatCoal
{
    @Mod.Instance(Reference.MOD_ID)
    public static EatCoal instance;


    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Pre-Initialization complete! ");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization complete! ");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-Initialization complete! ");
    }
}

