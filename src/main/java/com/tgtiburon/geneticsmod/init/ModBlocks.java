package com.tgtiburon.geneticsmod.init;

import com.tgtiburon.geneticsmod.block.BlockBeeHive;
import com.tgtiburon.geneticsmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Tony on 7/12/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockBeeHive beehive = new BlockBeeHive();

    public static void init()
    {
        GameRegistry.registerBlock(beehive, "beehive");


    }//end static void init()
}//end public class ModBLocks

