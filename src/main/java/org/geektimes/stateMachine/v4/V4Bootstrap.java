package org.geektimes.stateMachine.v4;

/**
 * 状态机：状态模式
 * 实现：用于解决分支逻辑法存在的问题（if/else过多，导致代码变得复杂，可读性可维护性降低的问题）。
 *       其做法就是将状态机的状态使用多个类表示，并且将事件触发后的状态转移以及要后需要执行的动作分散到各个状态类中。以此来避免分支判断逻辑
 * 场景：多用于实现状态不多（状态多就要引入非常多的状态类，会导致代码比较难维护），状态转移简单（状态转移多，意味着每个状态类都要定义多定义很多方法），
 *      但事件触发的动作包含复杂业务逻辑的场景。比如外卖下单、电商订单等
 */
public class V4Bootstrap {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        mario.obtainFireFlower();
        mario.meetMonster();
        int score = mario.getScore();
        State state = mario.getCurrentState().getName();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}