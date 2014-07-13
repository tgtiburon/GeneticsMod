package com.tgtiburon.geneticsmod;

import com.tgtiburon.geneticsmod.handler.ConfigurationHandler;
import com.tgtiburon.geneticsmod.init.ModBlocks;
import com.tgtiburon.geneticsmod.init.ModItems;
import com.tgtiburon.geneticsmod.proxy.IProxy;
import com.tgtiburon.geneticsmod.reference.Reference;
import com.tgtiburon.geneticsmod.utilities.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Tony on 7/11/2014.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)


public class GeneticsMod
{
    @Mod.Instance (Reference.MOD_ID)
    public static GeneticsMod instance;
//Telling Forge to use different proxy's for client and server side

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS , serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;



    @Mod.EventHandler //tells modloader this responds to an event.
    public void preInit(FMLPreInitializationEvent event)
    {
        //initialize items/blocks

        //send the suggested config file name to the handler
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        //Lets register our configurationHandler class is listening for events
        // on the bus (event system)
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler() );
        ModItems.init(); //Lets initialize our Items
        ModBlocks.init(); //Lets initialize our blocks


        LogHelper.warn("Pre Initialization Complete!");

    }//end public void preInit()



    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //register guis, tile entities
        LogHelper.fatal("Initialization Complete!");

    }//end public void init()



    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // run after other mods have initialized
        LogHelper.info("Post Initialization Complete!");

    } //end public void postInit()







}//End Public class GeneticsMod ()
