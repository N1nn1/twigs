package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.block.entity.SiltPotBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Twigs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TwigsBlockEntityType {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Twigs.MOD_ID);

    public static final RegistryObject<BlockEntityType<SiltPotBlockEntity>> SILT_POT = BLOCK_ENTITY_TYPES.register(
            "silt_pot", () ->
            BlockEntityType.Builder.of(SiltPotBlockEntity::new,
                    TwigsBlocks.SILT_POT.get(),
                    TwigsBlocks.BLACK_SILT_POT.get(),
                    TwigsBlocks.BLUE_SILT_POT.get(),
                    TwigsBlocks.BROWN_SILT_POT.get(),
                    TwigsBlocks.CYAN_SILT_POT.get(),
                    TwigsBlocks.GRAY_SILT_POT.get(),
                    TwigsBlocks.GREEN_SILT_POT.get(),
                    TwigsBlocks.LIGHT_BLUE_SILT_POT.get(),
                    TwigsBlocks.LIGHT_GRAY_SILT_POT.get(),
                    TwigsBlocks.LIME_SILT_POT.get(),
                    TwigsBlocks.MAGENTA_SILT_POT.get(),
                    TwigsBlocks.ORANGE_SILT_POT.get(),
                    TwigsBlocks.PINK_SILT_POT.get(),
                    TwigsBlocks.PURPLE_SILT_POT.get(),
                    TwigsBlocks.RED_SILT_POT.get(),
                    TwigsBlocks.WHITE_SILT_POT.get(),
                    TwigsBlocks.YELLOW_SILT_POT.get()
            ).build(null)
    );
}
