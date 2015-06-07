package com.springrts.dai.fact;

import java.util.List;

public final class DamageFact implements IDamageFact {
    private final int weaponDefId;
    private final int paralyzeDamageTime;
    private final float impulseFactor;
    private final float impulseBoost;
    private final float craterMult;
    private final List<Float> types;

    public DamageFact( final int weaponDefId, final int paralyzeDamageTime, final float impulseFactor, final float impulseBoost, final float craterMult, final List<Float> types) {
        this.weaponDefId = weaponDefId;
        this.paralyzeDamageTime = paralyzeDamageTime;
        this.impulseFactor = impulseFactor;
        this.impulseBoost = impulseBoost;
        this.craterMult = craterMult;
        this.types = types;
    }

    @Override
    public int getWeaponDefId() {
        return weaponDefId;
    }

    @Override
    public int getParalyzeDamageTime() {
        return paralyzeDamageTime;
    }

    @Override
    public float getImpulseFactor() {
        return impulseFactor;
    }

    @Override
    public float getImpulseBoost() {
        return impulseBoost;
    }

    @Override
    public float getCraterMult() {
        return craterMult;
    }

    @Override
    public List<Float> getTypes() {
        return types;
    }
}
