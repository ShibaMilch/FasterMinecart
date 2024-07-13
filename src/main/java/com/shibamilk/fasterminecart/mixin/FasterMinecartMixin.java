package com.shibamilk.fasterminecart.mixin;


import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.entity.vehicle.Minecart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecart.class)
public class FasterMinecartMixin {

    private static class AbstractMinecart {
        public void Minecart(){

        }
    }

    protected  double getMaxSpeed() {
        return (this.isInWater() ? 4.0 : 8.0) / 20.0;
    }



}