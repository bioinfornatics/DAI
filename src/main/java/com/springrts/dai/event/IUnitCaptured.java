package com.springrts.dai.event;

import com.springrts.dai.fact.IUnitFact;


public interface IUnitCaptured {
    IUnitFact getUnit();

    int getOldTeamId();

    int getNewTeamId();
}
