package com.springrts.dai.fact;

public final class ShieldFact implements IShieldFact {
    private final int weapondefId;
    private final float metalUse;
    private final float energyUse;
    private final float radius;
    private final float maxSpeed;
    private final float powerRegen;

    private final int interceptType;

    public ShieldFact( final int weapondefId, final float metalUse, final float energyUse, final float radius, final float maxSpeed, final float powerRegen, final int interceptType) {
        this.weapondefId = weapondefId;
        this.metalUse = metalUse;
        this.energyUse = energyUse;
        this.radius = radius;
        this.maxSpeed = maxSpeed;
        this.powerRegen = powerRegen;
        this.interceptType = interceptType;
    }

    @Override
    public int getInterceptType() {
        return interceptType;
    }

    @Override
    public int getWeapondefId() {
        return weapondefId;
    }

    @Override
    public float getMetalUse() {
        return metalUse;
    }

    @Override
    public float getEnergyUse() {
        return energyUse;
    }

    @Override
    public float getRadius() {
        return radius;
    }

    @Override
    public float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public float getPowerRegen() {
        return powerRegen;
    }
}
