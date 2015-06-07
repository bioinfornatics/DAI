package com.springrts.dai.event;

import com.springrts.dai.fact.IUnitFact;

public interface IUnitCreated {
    IUnitFact getBuilder();

    IUnitFact getUnit();
}
