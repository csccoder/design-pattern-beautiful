package org.geektimes.chainOfResponsibility.v1;

/**
 * 处理器抽象类
 */
public abstract class Handler {
    protected Handler successor = null;

    public abstract void handle();

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
