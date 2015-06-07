package com.springrts.dai.event;

import com.springrts.ai.oo.clb.Unit;

import java.util.List;

public interface IPlayerCommand {
    List<Unit> getUnits();

    int getCommandTopicId();

    int getPlayerId();
}
