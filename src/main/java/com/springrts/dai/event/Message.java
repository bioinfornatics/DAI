package com.springrts.dai.event;

final public class Message implements IMessage {
    private final String    message;
    private final int       playerId;

    public Message(final int playerId, final String message){
        this.message    = message;
        this.playerId   = playerId;

    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public int getPlayerId() {
        return playerId;
    }

}
