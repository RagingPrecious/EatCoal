package com.cloobs.eatcoal.handler;

import com.cloobs.eatcoal.reference.Reference;
import com.cloobs.eatcoal.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{   public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
        }

    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
            LogHelper.info("Config Loaded!");
        }
    }

    public void loadConfiguration()
    {
        testValue = configuration.getBoolean("Hax", Configuration.CATEGORY_GENERAL, false, "Sweet hax enabled?");

        if (configuration.hasChanged());
        {
            configuration.save();
            LogHelper.info("Config Saved!");
        }
    }


}
