package org.geektimes.stateMachine.v3.state;

import org.geektimes.stateMachine.v3.MarioStateMachine;
import org.geektimes.stateMachine.v3.State;

public class SmallMario implements IMario {

    private MarioStateMachine marioStateMachine;

    public SmallMario(MarioStateMachine marioStateMachine) {
        this.marioStateMachine = marioStateMachine;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom() {
        marioStateMachine.setCurrentState(new SuperMario(marioStateMachine));
        marioStateMachine.setScore(marioStateMachine.getScore() + 100);
    }

    @Override
    public void obtainCape() {
        marioStateMachine.setCurrentState(new CapeMario(marioStateMachine));
        marioStateMachine.setScore(marioStateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower() {
        marioStateMachine.setCurrentState(new FireMario(marioStateMachine));
        marioStateMachine.setScore(marioStateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster() {

    }
}
