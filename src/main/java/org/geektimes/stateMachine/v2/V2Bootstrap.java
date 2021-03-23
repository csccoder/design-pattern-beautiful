package org.geektimes.stateMachine.v2;

/**
 * 状态机：查表法
 * 实现：将状态机用二维表表示，表的第一维表示状态，表的第二维表示事件，值表示当前状态经过事件之后转移到的新状态以及要执行的动作。
 *      在状态机中，我们只要根据当前状态以及触发的事件进行查表，就可以找到转移后的状态以及要执行的动作
 *      这种实现方法相对于分支逻辑法，代码可维护性、可读性更好
 * 场景：用于实现状态较多，状态转移比较复杂，但执行动作逻辑简单的状态机场景。比如网游
 */
public class V2Bootstrap {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        mario.obtainCape();
        mario.meetMonster();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}