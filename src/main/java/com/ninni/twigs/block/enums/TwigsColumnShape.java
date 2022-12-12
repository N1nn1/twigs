package com.ninni.twigs.block.enums;


import net.minecraft.util.StringRepresentable;

public enum TwigsColumnShape implements StringRepresentable {
    TIP("tip"),
    BASE("base");

    private final String name;

    TwigsColumnShape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }
}
