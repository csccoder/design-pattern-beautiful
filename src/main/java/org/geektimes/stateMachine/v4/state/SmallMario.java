package org.geektimes.stateMachine.v4.state;

import org.geektimes.stateMachine.v4.MarioStateMachine;
import org.geektimes.stateMachine.v4.State;

public class SmallMario implements IMario {

    public static final SmallMario INSTANCE = new SmallMario();

    private SmallMario() {
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrentState(SuperMario.INSTANCE);
        marioStateMachine.setScore(marioStateMachine.getScore() + 100);
    }

    @Override
    public void obtainCape(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrentState(CapeMario.INSTANCE);
        marioStateMachine.setScore(marioStateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrentState(FireMario.INSTANCE);
        marioStateMachine.setScore(marioStateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster(MarioStateMachine marioStateMachine) {

    }
}
