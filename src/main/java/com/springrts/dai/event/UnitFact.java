package com.springrts.dai.event;


import com.springrts.dai.fact.IUnitFact;

public final class UnitFact implements IUnitFact {
    private final int        unitId;
    private final int        teamId;
    private final int        teamAllyId;
    private final int        stockpile;
    private final int        stockpileQueued;
    private final int        group;
    private final float      maxSpeed;
    private final float      speed;
    private final float      maxRange;
    private final float      maxHealth;
    private final float      health;
    private final boolean    isActivated;
    private final boolean    isBeingBuilt;
    private final boolean    isCloaked;
    private final boolean    isParalyzed;
    private final boolean    isNeutral;
    private final int        unitDefId;

    public UnitFact(final int unitId,           final int teamId,           final int teamAllyId,
                    final int stockpile,        final int stockpileQueued,  final int group,        final float maxSpeed,
                    final float speed,          final float maxRange,       final float maxHealth,  final float health,
                    final boolean isActivated,  final boolean isBeingBuilt, final boolean isCloaked,final boolean isParalyzed,
                    final boolean isNeutral, final int unitDefId) {
        this.unitId = unitId;
        this.teamId = teamId;
        this.teamAllyId = teamAllyId;
        this.stockpile = stockpile;
        this.stockpileQueued = stockpileQueued;
        this.group = group;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
        this.maxRange = maxRange;
        this.maxHealth = maxHealth;
        this.health = health;
        this.isActivated = isActivated;
        this.isBeingBuilt = isBeingBuilt;
        this.isCloaked = isCloaked;
        this.isParalyzed = isParalyzed;
        this.isNeutral = isNeutral;
        this.unitDefId = unitDefId;
    }

    @Override
    public int getUnitId() {
        return unitId;
    }

    @Override
    public int getTeamId() {
        return teamId;
    }

    @Override
    public int getTeamAllyId() {
        return teamAllyId;
    }

    @Override
    public int getStockpile() {
        return stockpile;
    }

    @Override
    public int getStockpileQueued() {
        return stockpileQueued;
    }

    @Override
    public int getGroup() {
        return group;
    }

    @Override
    public float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getMaxRange() {
        return maxRange;
    }

    @Override
    public float getMaxHealth() {
        return maxHealth;
    }

    @Override
    public float getHealth() {
        return health;
    }

    @Override
    public boolean isActivated() {
        return isActivated;
    }

    @Override
    public boolean isBeingBuilt() {
        return isBeingBuilt;
    }

    @Override
    public boolean isCloaked() {
        return isCloaked;
    }

    @Override
    public boolean isParalyzed() {
        return isParalyzed;
    }

    @Override
    public boolean isNeutral() {
        return isNeutral;
    }

    @Override
    public int getUnitDefId() {
        return unitDefId;
    }
}
