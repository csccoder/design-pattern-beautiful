package org.geektimes.stateMachine.v2;

/**
 * 马里奥状态机
 */
public class MarioStateMachine {
    private int score;
    private State currentState;

    private State[][] transitionTable = {
            {State.SUPER, State.CAPE, State.FIRE, State.SMALL},
            {State.SUPER, State.CAPE, State.FIRE, State.SMALL},
            {State.CAPE, State.CAPE, State.CAPE, State.SMALL},
            {State.FIRE, State.FIRE, State.FIRE, State.SMALL}};

    private int[][] actionTable = {
            {+100, +200, +300, +0},
            {+0, +200, +300, -100},
            {+0, +0, +0, -200},
            {+0, +0, +0, -300}};

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void executeEvent(Event event) {
        int stateValue = currentState.getValue();
        int eventValue = event.getValue();
        currentState = transitionTable[stateValue][eventValue];
        score += actionTable[stateValue][eventValue];
    }

    /**
     * 获得蘑菇
     */
    public void obtainMushRoom() {
        executeEvent(Event.GOT_MUSHROOM);
    }

    /**
     * 获得斗篷
     */
    public void obtainCape() {
        executeEvent(Event.GOT_CAPE);
    }

    /**
     * 获得火焰花
     */
    public void obtainFireFlower() {
        executeEvent(Event.GOT_FIRE_FLOWER);
    }

    public void meetMonster() {
        executeEvent(Event.MET_MONSTER);
    }


    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState;
    }
}