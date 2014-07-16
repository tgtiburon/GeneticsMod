package com.tgtiburon.geneticsmod.creativetab;

import com.tgtiburon.geneticsmod.init.ModItems;
import com.tgtiburon.geneticsmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Tony on 7/12/2014.
 */
public class CreativeTabGeneticsMod
{
    public static final CreativeTabs GENETICSMOD_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.whitePeaPlant;
        }//end getTabIconItem()


    };



}//end class CreativeTabGeneticsMod

