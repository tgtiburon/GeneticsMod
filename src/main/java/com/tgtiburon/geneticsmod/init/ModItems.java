package com.tgtiburon.geneticsmod.init;

import com.tgtiburon.geneticsmod.item.*;
import com.tgtiburon.geneticsmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Tony on 7/12/2014.
 */


// Initialize my items

//This prevents other mods from tinkering with your mod

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemGeneticsMod whitePeaPlant = new ItemWhitePeaPlant();
    public static final ItemGeneticsMod redPeaPlant = new ItemRedPeaPlant();
    public static final ItemGeneticsMod pinkPeaPlant = new ItemPinkPeaPlant();

    public static final ItemGeneticsMod creeptonianSword = new ItemCreeptonianSword();
    public static void init()
    {
        GameRegistry.registerItem(whitePeaPlant, "WhitePeaPlant");
        GameRegistry.registerItem(redPeaPlant, "RedPeaPlant");
        GameRegistry.registerItem(pinkPeaPlant, "PinkPeaPlant");
        GameRegistry.registerItem(creeptonianSword, "CreeptonianSword");



    }//end public static void init()


}//end public class ModItems
