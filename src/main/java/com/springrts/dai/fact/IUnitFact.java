package com.springrts.dai.fact;

public interface IUnitFact {
    int getUnitId();

    int getTeamId();

    int getTeamAllyId();

    int getStockpile();

    int getStockpileQueued();

    int getGroup();

    float getMaxSpeed();

    float getSpeed();

    float getMaxRange();

    float getMaxHealth();

    float getHealth();

    boolean isActivated();

    boolean isBeingBuilt();

    boolean isCloaked();

    boolean isParalyzed();

    boolean isNeutral();

    int getUnitDefId();
}
