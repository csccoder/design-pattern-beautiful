package org.geektimes.stateMachine.v1;

/**
 * 马里奥状态机
 */
public class MarioStateMachine {
    private int score;
    private State currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }


    /**
     * 获得蘑菇
     */
    public void obtainMushRoom() {
        if (currentState == State.SMALL) {
            currentState = State.SUPER;
            score += 100;
        }
    }

    /**
     * 获得斗篷
     */
    public void obtainCape() {
        if (currentState == State.SMALL || currentState == State.SUPER) {
            currentState = State.CAPE;
            score += 200;
        }
    }

    /**
     * 获得火焰花
     */
    public void obtainFireFlower() {
        if (currentState == State.SMALL || currentState == State.SUPER) {
            currentState = State.FIRE;
            score += 300;
        }
    }

    /**
     * 遇见怪兽
     */
    public void meetMonster() {
        if (currentState == State.SUPER) {
            currentState = State.SMALL;
            score -= 100;
        } else if (currentState == State.CAPE) {
            currentState = State.SMALL;
            score -= 200;
        } else if (currentState == State.FIRE) {
            currentState = State.SMALL;
            score -= 300;
        }
    }


    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState;
    }
}