package com.springrts.dai.event;

import com.springrts.dai.fact.IUnitFact;

public class UnitCaptured implements IUnitCaptured {
    private final IUnitFact unit;
    private final int       oldTeamId;
    private final int       newTeamId;

    public UnitCaptured(final IUnitFact unit, final int oldTeamId, final int newTeamId) {
        this.unit       = unit;
        this.oldTeamId  = oldTeamId;
        this.newTeamId  = newTeamId;
    }

    @Override
    public IUnitFact getUnit() {
        return unit;
    }

    @Override
    public int getOldTeamId() {
        return oldTeamId;
    }

    @Override
    public int getNewTeamId() {
        return newTeamId;
    }

}
