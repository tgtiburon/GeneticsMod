package com.tgtiburon.geneticsmod.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Tony on 7/12/2014.
 * This class handles the loading of Config Files
 */
public class ConfigurationHandler
{

    public static void init(File configFile)
    {
        //make a new configuration based on the file passed to us
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try
        {
            //Load the config File.
            configuration.load();

            //Read in properties from config
             configValue = configuration.get(configuration.CATEGORY_GENERAL, "configValue", true, "This an example config Value").getBoolean(true);

        } // end try
        catch (Exception e)
        {
            //Log the exception

        }//end catch
        finally//executes at the end no matter what happens
        {
            //Save the config file
            configuration.save();
        }
        System.out.println("Configuration Value: " + configValue);
    }//end public static void init()

}//end public class ConfigurationHandler()
