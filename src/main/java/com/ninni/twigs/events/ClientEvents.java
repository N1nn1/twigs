package com.ninni.twigs.events;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.client.particle.TwigsBreakingItemParticle;
import com.ninni.twigs.registry.TwigsEntityTypes;
import com.ninni.twigs.registry.TwigsItems;
import com.ninni.twigs.registry.TwigsParticleTypes;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Twigs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {
        ItemProperties.register(TwigsItems.BRONZED_SEASHELL.get(), new ResourceLocation("playing"), (itemStack, clientWorld, livingEntity, var) -> {
            if (livingEntity == null) return 0.0F;

            return livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F;
        });
    }

    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(TwigsEntityTypes.PEBBLE.get(), ThrownItemRenderer::new);
    }

    @SubscribeEvent
    public static void registerParticles(RegisterParticleProvidersEvent event) {
        event.registerSpecial(TwigsParticleTypes.ITEM_PEBBLE.get(), new TwigsBreakingItemParticle.Provider());
    }

}
