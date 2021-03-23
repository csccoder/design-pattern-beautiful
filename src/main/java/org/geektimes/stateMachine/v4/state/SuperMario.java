package org.geektimes.stateMachine.v4.state;

import org.geektimes.stateMachine.v4.MarioStateMachine;
import org.geektimes.stateMachine.v4.State;

public class SuperMario implements IMario {

    public static final SuperMario INSTANCE = new SuperMario();

    private SuperMario() {
    }

    @Override
    public State getName() {
        return State.SUPER;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine marioStateMachine) {

    }

    @Override
    public void obtainCape(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrentState(SuperMario.INSTANCE);
        marioStateMachine.setScore(marioStateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrentState(FireMario.INSTANCE);
        marioStateMachine.setScore(marioStateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrentState(SmallMario.INSTANCE);
        marioStateMachine.setScore(marioStateMachine.getScore() - 100);
    }
}
