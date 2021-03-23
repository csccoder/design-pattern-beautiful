package org.geektimes.chainOfResponsibility.v3;

/**
 * 处理器抽象类
 */
public abstract class Handler {
    protected Handler successor = null;

    public abstract boolean handle();

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
