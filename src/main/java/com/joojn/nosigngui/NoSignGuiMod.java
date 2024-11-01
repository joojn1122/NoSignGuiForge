package com.joojn.nosigngui;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLModDisabledEvent;

@Mod(
    modid = "NoSignGui",
    version = "1.8.9",
    useMetadata = true,
    clientSideOnly = true,
    canBeDeactivated = true
)
public class NoSignGuiMod {
    public static boolean enabled = true;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void deactivate(FMLModDisabledEvent event) {
        enabled = false;
    }
}
