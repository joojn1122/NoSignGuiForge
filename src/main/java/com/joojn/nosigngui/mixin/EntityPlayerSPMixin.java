package com.joojn.nosigngui.mixin;

import com.joojn.nosigngui.NoSignGuiMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.tileentity.TileEntitySign;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityPlayerSP.class)
public class EntityPlayerSPMixin {
    @Inject(at = @At("HEAD"), method = "openEditSign", cancellable = true)
    public void openEditSign(TileEntitySign sign, CallbackInfo ci) {
        if(NoSignGuiMod.enabled && Minecraft.getMinecraft().thePlayer.isSneaking())
            ci.cancel();
    }
}
