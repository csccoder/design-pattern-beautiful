package org.geektimes.stateMachine.v4;

import org.geektimes.stateMachine.v4.state.IMario;
import org.geektimes.stateMachine.v4.state.SmallMario;

/**
 * 马里奥状态机
 */
public class MarioStateMachine {
    private int score;
    private IMario currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = SmallMario.INSTANCE;
    }


    /**
     * 获得蘑菇
     */
    public void obtainMushRoom() {
        this.currentState.obtainMushRoom(this);
    }

    /**
     * 获得斗篷
     */
    public void obtainCape() {
        this.currentState.obtainCape(this);
    }

    /**
     * 获得火焰花
     */
    public void obtainFireFlower() {
        this.currentState.obtainFireFlower(this);
    }

    /**
     * 遇见怪兽
     */
    public void meetMonster() {
        this.currentState.meetMonster(this);
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public IMario getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }
}