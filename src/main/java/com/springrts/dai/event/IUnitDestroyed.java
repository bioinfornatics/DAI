package com.springrts.dai.event;

import com.springrts.dai.fact.IUnitFact;


public interface IUnitDestroyed {
    IUnitFact getBuilder();

    IUnitFact getUnit();
}
