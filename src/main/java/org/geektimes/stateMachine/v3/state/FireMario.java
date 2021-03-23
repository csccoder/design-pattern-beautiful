package org.geektimes.stateMachine.v3.state;

import org.geektimes.stateMachine.v3.MarioStateMachine;
import org.geektimes.stateMachine.v3.State;

public class FireMario implements IMario {

    private MarioStateMachine marioStateMachine;

    public FireMario(MarioStateMachine marioStateMachine) {
        this.marioStateMachine = marioStateMachine;
    }

    @Override
    public State getName() {
        return State.FIRE;
    }

    @Override
    public void obtainMushRoom() {

    }

    @Override
    public void obtainCape() {

    }

    @Override
    public void obtainFireFlower() {

    }

    @Override
    public void meetMonster() {
        marioStateMachine.setCurrentState(new SmallMario(marioStateMachine));
        marioStateMachine.setScore(marioStateMachine.getScore() - 300);
    }
}