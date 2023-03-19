package com.ninni.twigs;

import com.ninni.twigs.block.enums.TwigsColumnShape;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public interface TwigsProperties {
    EnumProperty<TwigsColumnShape> SHAPE = EnumProperty.create("shape", TwigsColumnShape.class);
    BooleanProperty FILLED = BooleanProperty.create("filled");
    IntegerProperty LAYERS_1_4 = IntegerProperty.create("layers", 1, 4);
}
