package com.tgtiburon.geneticsmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Tony on 7/24/2014.
 */
public class Recipes
{
    public static void init()
    {
        //class that will register registries
        //Shaped recipe example
        //First Parameter is output item, second is grid layout, third is what is put in grid

        //GameRegistry.addShapedRecipe(new ItemStack(ModItems.pinkPeaPlant), " s ", "sss", " s ", 's', new ItemStack(Items.stick));

        //shapeless recipe
        //First parameter is output item, second through 9 are items needed in grid

       // GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.beehive), new ItemStack(ModItems.pinkPeaPlant), new ItemStack(ModItems.whitePeaPlant), new ItemStack(ModItems.redPeaPlant));

        //Now lets see the Ore Dictionary way of doing it
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pinkPeaPlant), " s ", "sss", " s ", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.beehive), "stickWood", new ItemStack(ModItems.pinkPeaPlant), new ItemStack(ModItems.whitePeaPlant), new ItemStack(ModItems.redPeaPlant)));
    }

}//end recipes

