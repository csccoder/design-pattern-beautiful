package org.geektimes.chainOfResponsibility.v2;

/**
 * 处理器抽象类
 */
public abstract class Handler {
    protected Handler successor = null;

    /**
     * 基于模板方法设计模式 将处理器调度逻辑和业务逻辑解耦
     */
    public final void handle() {
        boolean handled = doHandle();

        //如果请求不能被当前处理器处理，并且该处理器包含后继处理器，则将请求委托给下一个处理器进行处理
        if (!handled && successor != null) {
            successor.handle();
        }
    }

    protected abstract boolean doHandle();

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
