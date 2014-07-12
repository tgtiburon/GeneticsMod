package com.tgtiburon.geneticsmod.client.gui;

import com.tgtiburon.geneticsmod.handler.ConfigurationHandler;
import com.tgtiburon.geneticsmod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

/**
 * Created by Tony on 7/12/2014.
 */

//our Gui extends the Forge standard gui
public class ModGuiConfig extends GuiConfig
{


    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }//end public ModGuiConfig
}//end public class ModGuiConfig
