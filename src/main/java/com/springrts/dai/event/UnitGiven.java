package com.springrts.dai.event;

import com.springrts.dai.fact.IUnitFact;

public class UnitGiven implements IUnitGiven {

    final IUnitFact unit;
    final int       oldTeamId;
    final int       newTeamId;

    public UnitGiven( final IUnitFact unit, final int oldTeamId, final int newTeamId) {
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
