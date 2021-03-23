package org.geektimes.stateMachine.v3;

import org.geektimes.stateMachine.v3.state.IMario;
import org.geektimes.stateMachine.v3.state.SmallMario;

/**
 * 马里奥状态机
 */
public class MarioStateMachine {
    private int score;
    private IMario currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = new SmallMario(this);
    }


    /**
     * 获得蘑菇
     */
    public void obtainMushRoom() {
        this.currentState.obtainMushRoom();
    }

    /**
     * 获得斗篷
     */
    public void obtainCape() {
        this.currentState.obtainCape();
    }

    /**
     * 获得火焰花
     */
    public void obtainFireFlower() {
        this.currentState.obtainFireFlower();
    }

    /**
     * 遇见怪兽
     */
    public void meetMonster() {
        this.currentState.meetMonster();
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