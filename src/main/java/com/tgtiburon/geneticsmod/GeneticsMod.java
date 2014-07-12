package com.tgtiburon.geneticsmod;

import com.tgtiburon.geneticsmod.configuration.ConfigurationHandler;
import com.tgtiburon.geneticsmod.proxy.IProxy;
import com.tgtiburon.geneticsmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Tony on 79/11/2014.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)


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

    }//end public void preInit()



    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //register guis, tile entities

    }//end public void init()



    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // run after other mods have initialized

    } //end public void postInit()







}//End Public class GeneticsMod ()
