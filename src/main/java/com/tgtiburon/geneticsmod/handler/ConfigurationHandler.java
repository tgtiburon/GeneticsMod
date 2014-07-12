package com.tgtiburon.geneticsmod.handler;


import com.tgtiburon.geneticsmod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Tony on 7/12/2014.
 * This class handles the loading of Config Files
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        //make a new configuration based on the file passed to us
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            //Since there is no config, lets load one
            loadConfiguration();

        }

    }//end public static void init()

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //Resync configs
            loadConfiguration();
        }

    }//end public void OnConfigurationChangedEvent()
//private because it is only called within this class
    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value.");


        if(configuration.hasChanged())
        {
            configuration.save();
        }//end if(config
    }//end public void loadConfiguration()9

}//end public class ConfigurationHandler()
