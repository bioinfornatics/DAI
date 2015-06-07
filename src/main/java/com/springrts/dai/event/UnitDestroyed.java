package com.springrts.dai.event;

import com.springrts.dai.fact.IUnitFact;

public class UnitDestroyed implements IUnitDestroyed {
    private final IUnitFact unit;

    private final IUnitFact builder;

    public UnitDestroyed(final IUnitFact unit, final IUnitFact builder) {
        this.unit       = unit;
        this.builder    = builder;
    }

    @Override
    public IUnitFact getBuilder() {
        return builder;
    }

    @Override
    public IUnitFact getUnit() {
        return unit;
    }
}
