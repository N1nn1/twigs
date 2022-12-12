package com.ninni.twigs.mixin;

import com.ninni.twigs.TwigsTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.TallGrassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(BlockBehaviour.BlockStateBase.class)
public class BlockStateBaseMixin {

    @Inject(method = "getOffset", at = @At("HEAD"), cancellable = true)
    private void removeOffset(BlockGetter blockGetter, BlockPos pos, CallbackInfoReturnable<Vec3> cir) {
        BlockBehaviour.BlockStateBase that = BlockBehaviour.BlockStateBase.class.cast(this);

        if (that.getBlock() instanceof BushBlock) {
            if (blockGetter.getBlockState(pos.below(1)).is(TwigsTags.OFFSET_REMOVER)
                || (that.getBlock() instanceof TallGrassBlock && blockGetter.getBlockState(pos.below(2)).is(TwigsTags.OFFSET_REMOVER))
            ) cir.setReturnValue(Vec3.ZERO);
        }
    }
}