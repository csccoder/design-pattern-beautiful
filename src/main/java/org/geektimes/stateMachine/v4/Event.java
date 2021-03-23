package org.geektimes.stateMachine.v4;

public enum Event {
    GOT_MUSHROOM(0), GOT_CAPE(1), GOT_FIRE_FLOWER(2), MET_MONSTER(3);
    int value;

    Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
