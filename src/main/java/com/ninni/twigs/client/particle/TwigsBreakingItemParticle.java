package com.ninni.twigs.client.particle;

import com.ninni.twigs.registry.TwigsItems;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.BreakingItemParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TwigsBreakingItemParticle extends BreakingItemParticle {

    public TwigsBreakingItemParticle(ClientLevel clientLevel, double d, double e, double f, ItemStack itemStack) {
        super(clientLevel, d, e, f, itemStack);
    }

    @OnlyIn(Dist.CLIENT)
    public static class Provider implements ParticleProvider<SimpleParticleType> {
        @Override
        public Particle createParticle(SimpleParticleType itemParticleOption, ClientLevel clientLevel, double d, double e, double f, double g, double h, double i) {
            return new TwigsBreakingItemParticle(clientLevel, d, e, f, new ItemStack(TwigsItems.PEBBLE.get()));
        }
    }

}
