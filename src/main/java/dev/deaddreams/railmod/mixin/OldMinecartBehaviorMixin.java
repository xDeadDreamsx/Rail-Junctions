package dev.deaddreams.railmod.mixin;

import dev.deaddreams.railmod.util.MinecartRailHooks;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.vehicle.minecart.AbstractMinecart;
import net.minecraft.world.entity.vehicle.minecart.OldMinecartBehavior;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(OldMinecartBehavior.class)
public abstract class OldMinecartBehaviorMixin {
    @Shadow @Final protected AbstractMinecart minecart;

    @Inject(method = "moveAlongTrack", at = @At("HEAD"))
    private void railmod$prepareSpecialRails(ServerLevel level, CallbackInfo ci) {
        MinecartRailHooks.prepareRail(level, minecart);
    }

    @Inject(method = "moveAlongTrack", at = @At("TAIL"))
    private void railmod$stopAtDeadEnd(ServerLevel level, CallbackInfo ci) {
        MinecartRailHooks.stopAtDeadEnd(level, minecart);
    }
}
