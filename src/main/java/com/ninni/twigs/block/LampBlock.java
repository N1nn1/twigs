package com.ninni.twigs.block;

import com.ninni.twigs.registry.TwigsSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;

public class LampBlock extends Block {
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public LampBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, true));
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult blockHitResult) {
        if (!player.isShiftKeyDown()) {
            final boolean wasLit = state.getValue(LIT);
            level.setBlockAndUpdate(pos, state.setValue(LIT, !wasLit));
            level.playSound(null, pos, !wasLit ? TwigsSoundEvents.LAMP_ON : TwigsSoundEvents.LAMP_OFF, SoundSource.BLOCKS, 1, 1);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

}
