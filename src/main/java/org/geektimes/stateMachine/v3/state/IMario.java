package org.geektimes.stateMachine.v3.state;

import org.geektimes.stateMachine.v3.State;

public interface IMario {

    State getName();

    /**
     * 获得蘑菇
     */
    void obtainMushRoom();

    /**
     * 获得斗篷
     */
    void obtainCape();

    /**
     * 获得火焰花
     */
    void obtainFireFlower();

    /**
     * 遇见怪兽
     */
    void meetMonster();
}
