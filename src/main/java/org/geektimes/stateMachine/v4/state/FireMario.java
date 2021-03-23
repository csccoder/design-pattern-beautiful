package org.geektimes.stateMachine.v4.state;

import org.geektimes.stateMachine.v4.MarioStateMachine;
import org.geektimes.stateMachine.v4.State;

public class FireMario implements IMario {

    public static final FireMario INSTANCE = new FireMario();

    private FireMario() {

    }

    @Override
    public State getName() {
        return State.FIRE;
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
        marioStateMachine.setScore(marioStateMachine.getScore() - 300);
    }
}