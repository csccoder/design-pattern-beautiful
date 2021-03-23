package org.geektimes.stateMachine.v4.state;

import org.geektimes.stateMachine.v4.MarioStateMachine;
import org.geektimes.stateMachine.v4.State;

public class CapeMario implements IMario {

    public static final CapeMario INSTANCE = new CapeMario();

    private CapeMario() {

    }

    @Override
    public State getName() {
        return State.CAPE;
    }


    @Override
    public void obtainMushRoom(MarioStateMachine marioStateMachine) {

    }

    @Override
    public void obtainCape(MarioStateMachine marioStateMachine) {

    }

    @Override
    public void obtainFireFlower(MarioStateMachine marioStateMachine) {

    }

    @Override
    public void meetMonster(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrentState(SmallMario.INSTANCE);
        marioStateMachine.setScore(marioStateMachine.getScore() - 200);
    }
}
