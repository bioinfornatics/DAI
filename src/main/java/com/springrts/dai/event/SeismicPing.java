package com.springrts.dai.event;

import com.springrts.ai.oo.AIFloat3;

public class SeismicPing implements ISeismicPing {
    private final AIFloat3 pos;
    private final float strength;

    public SeismicPing(final AIFloat3 pos, final float strength) {
        this.pos = pos;
        this.strength = strength;
    }

    @Override
    public AIFloat3 getPos() {
        return pos;
    }

    @Override
    public float getStrength() {
        return strength;
    }
}
