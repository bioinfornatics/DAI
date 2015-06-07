package com.springrts.dai.event;

import com.springrts.dai.fact.IUnitFact;

public interface ICommandFinished {
    IUnitFact getUnit();

    int getCommandId();

    int getCommandTopicId();
}
