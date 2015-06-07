package com.springrts.dai.fact;

public final class ResourcesFact implements IResourcesFact {

    private final float  metal;
    private final float  metalIncome;
    private final float  metalUsage;
    private final float  metalStorage;
    private final float  energy;
    private final float  energyIncome;
    private final float  energyUsage;
    private final float  energyStorage;
    private final int    teamId;

    public ResourcesFact(final int teamId, final float metal, float metalIncome, float metalUsage, final float metalStorage, final float energy, float energyIncome, float energyUsage, final float energyStorage) {
        this.teamId         = teamId;
        this.metal          = metal;
        this.metalIncome    = metalIncome;
        this.metalUsage     = metalUsage;
        this.metalStorage   = metalStorage;
        this.energy         = energy;
        this.energyIncome   = energyIncome;
        this.energyUsage    = energyUsage;
        this.energyStorage  = energyStorage;
    }

    @Override
    public int getTeamId() {
        return teamId;
    }

    @Override
    public float getEnergyStorage() {
        return energyStorage;
    }

    @Override
    public float getMetal() {
        return metal;
    }

    @Override
    public float getMetalIncome() {
        return 0;
    }

    @Override
    public float getMetalUsage() {
        return 0;
    }

    @Override
    public float getMetalStorage() {
        return metalStorage;
    }

    @Override
    public float getEnergy() {
        return energy;
    }

    @Override
    public float getEnergyIncome() {
        return 0;
    }

    @Override
    public float getEnergyUsage() {
        return 0;
    }
}
