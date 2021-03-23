package org.geektimes.stateMachine.v1;

/**
 * 状态机：分支判断实现
 * 实现：将状态转移图的每个状态转移使用代码翻译一遍
 * 场景：适用于实现简单状态机。
 */
public class V1Bootstrap {
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