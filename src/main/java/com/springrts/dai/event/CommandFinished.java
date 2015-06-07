package com.springrts.dai.event;

import com.springrts.dai.fact.IUnitFact;

public class CommandFinished implements ICommandFinished {
    private final IUnitFact unit;
    private final int       commandId;
    private final int       commandTopicId;

    public CommandFinished(final IUnitFact unit, final int commandId, final int commandTopicId) {
        this.unit           = unit;
        this.commandId      = commandId;
        this.commandTopicId = commandTopicId;
    }

    @Override
    public IUnitFact getUnit() {
        return unit;
    }

    @Override
    public int getCommandId() {
        return commandId;
    }

    @Override
    public int getCommandTopicId() {
        return commandTopicId;
    }
}
