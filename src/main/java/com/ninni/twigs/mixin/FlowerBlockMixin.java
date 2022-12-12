package com.ninni.twigs.mixin;

import com.ninni.twigs.TwigsProperties;
import com.ninni.twigs.TwigsTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(FlowerBlock.class)
public abstract class FlowerBlockMixin extends BushBlock {

    public FlowerBlockMixin(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState floor, BlockGetter blockGetter, BlockPos blockPos) {
        return (floor.is(TwigsTags.SILT_POTS_BLOCK) && floor.getValue(TwigsProperties.FILLED)) || super.mayPlaceOn(floor, blockGetter, blockPos);
    }
}
