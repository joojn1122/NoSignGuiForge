package com.joojn.nosigngui;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
    modid = "NoSignGui",
    version = "1.8.9",
    useMetadata = true,
    clientSideOnly = true
)
public class NoSignGuiMod {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("NoSignGuiMod has been loaded!");
    }
}
