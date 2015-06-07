package com.springrts.dai.event;

import com.springrts.ai.oo.clb.Unit;

import java.util.List;

public class PlayerCommand implements IPlayerCommand {
    private final List<Unit> units;
    private final int commandTopicId;
    private final int playerId;

    public PlayerCommand(final List<Unit> units, final int commandTopicId, final int playerId) {
        this.units = units;
        this.commandTopicId = commandTopicId;
        this.playerId = playerId;
    }

    @Override
    public List<Unit> getUnits() {
        return units;
    }

    @Override
    public int getCommandTopicId() {
        return commandTopicId;
    }

    @Override
    public int getPlayerId() {
        return playerId;
    }
}
