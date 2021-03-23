package org.geektimes.stateMachine.v4.state;

import org.geektimes.stateMachine.v4.MarioStateMachine;
import org.geektimes.stateMachine.v4.State;

public interface IMario {

    State getName();

    /**
     * 获得蘑菇
     */
    void obtainMushRoom(MarioStateMachine marioStateMachine);

    /**
     * 获得斗篷
     */
    void obtainCape(MarioStateMachine marioStateMachine);

    /**
     * 获得火焰花
     */
    void obtainFireFlower(MarioStateMachine marioStateMachine);

    /**
     * 遇见怪兽
     */
    void meetMonster(MarioStateMachine marioStateMachine);
}
