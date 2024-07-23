package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.block.entity.SiltPotBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

@SuppressWarnings("deprecation")
public class TwigsBlockEntityType {

    public static final BlockEntityType<SiltPotBlockEntity> SILT_POT = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(Twigs.MOD_ID, "silt_pot"),
            FabricBlockEntityTypeBuilder.create(SiltPotBlockEntity::new,
                    TwigsBlocks.SILT_POT,
                    TwigsBlocks.BLACK_SILT_POT,
                    TwigsBlocks.BLUE_SILT_POT,
                    TwigsBlocks.BROWN_SILT_POT,
                    TwigsBlocks.CYAN_SILT_POT,
                    TwigsBlocks.GRAY_SILT_POT,
                    TwigsBlocks.GREEN_SILT_POT,
                    TwigsBlocks.LIGHT_BLUE_SILT_POT,
                    TwigsBlocks.LIGHT_GRAY_SILT_POT,
                    TwigsBlocks.LIME_SILT_POT,
                    TwigsBlocks.MAGENTA_SILT_POT,
                    TwigsBlocks.ORANGE_SILT_POT,
                    TwigsBlocks.PINK_SILT_POT,
                    TwigsBlocks.PURPLE_SILT_POT,
                    TwigsBlocks.RED_SILT_POT,
                    TwigsBlocks.WHITE_SILT_POT,
                    TwigsBlocks.YELLOW_SILT_POT
            ).build(null)
    );
}
