package org.geektimes.chainOfResponsibility.v1;

/**
 * 处理器链
 */
public class HandlerChain {
    private Handler head;

    private Handler tail;

    public void addHandler(Handler handler) {
        if (head == null) {
            head = handler;
            tail = handler;
        }
        handler.setSuccessor(null);
        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }
}
