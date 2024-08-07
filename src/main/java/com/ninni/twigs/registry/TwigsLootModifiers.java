package com.ninni.twigs.registry;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.ninni.twigs.Twigs;
import com.ninni.twigs.util.TwigLootModifier;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Twigs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TwigsLootModifiers {
    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Twigs.MOD_ID);

    public static final RegistryObject<MapCodec<TwigLootModifier>> TWIG_LOOT_MODIFIER = LOOT_MODIFIERS.register("twig_loot_modifier", () -> TwigLootModifier.CODEC);
}
