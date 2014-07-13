package com.tgtiburon.geneticsmod.block;


import com.tgtiburon.geneticsmod.creativetab.CreativeTabGeneticsMod;
import com.tgtiburon.geneticsmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Tony on 7/12/2014.
 */
public class BlockGeneticsMod extends Block
{

    //create a block with material in parenthesis
    public BlockGeneticsMod(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabGeneticsMod.GENETICSMOD_TAB);

    }//end BlockGeneticsMod

    public BlockGeneticsMod()
    {
        //If not material is sent make it an iron block
        this(Material.iron);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));


        //Blocks named by minecraft as  tile.modid.blockname.name
    }//end getUnlocalizedName()


    @Override

    //this method only exists on the client side...Servers don't use textures

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));


    }//end public void registerIcons()

    protected String getUnwrappedUnlocalizedName(String unLocalizedName)
    {
        return unLocalizedName.substring(unLocalizedName.indexOf(".") + 1);

    }//end getUnWrapped...

}// end public class BlocGeneticsMod
