package com.ninni.twigs;

import com.ninni.twigs.block.enums.TwigsColumnShape;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public interface TwigsProperties {
    EnumProperty<TwigsColumnShape> SHAPE = EnumProperty.create("shape", TwigsColumnShape.class);
    BooleanProperty FILLED = BooleanProperty.create("filled");
}
