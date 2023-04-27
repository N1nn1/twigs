package com.ninni.twigs.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

public class PillarOxidizableBlock extends RotatedPillarBlock implements WeatheringCopper {
    private final WeatherState weatherState;

    public PillarOxidizableBlock(WeatherState weatherState, Properties properties) {
        super(properties);
        this.weatherState = weatherState;
    }

    @Override
    public boolean isRandomlyTicking(BlockState blockState) {
        return WeatheringCopper.getPrevious(blockState.getBlock()).isPresent();
    }

    @Override
    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        this.applyChangeOverTime(blockState, serverLevel, blockPos, randomSource);
    }

    @Override
    public WeatherState getAge() {
        return this.weatherState;
    }
}
