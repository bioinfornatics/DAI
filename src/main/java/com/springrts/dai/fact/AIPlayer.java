package com.springrts.dai.fact;

public class AIPlayer implements IAIPlayer {
    private final int teamId;
    private final int allyTeams;
    private final int skirmishAIId;


    public AIPlayer( final int teamId, final int allyTeams, final int skirmishAIId) {
        this.teamId         = teamId;
        this.allyTeams      = allyTeams;
        this.skirmishAIId   = skirmishAIId;
    }

    @Override
    public int getAllyTeams() {
        return allyTeams;
    }

    @Override
    public int getTeamId() {
        return teamId;
    }

    @Override
    public int getSkirmishAIId() {
        return skirmishAIId;
    }
}
