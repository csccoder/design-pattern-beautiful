package org.geektimes.chainOfResponsibility.v3;

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
        Handler tmp = head;
        while (tmp != null) {
            boolean handled = tmp.handle();
            //如果请求不能被当前处理器处理，并且该处理器包含后继处理器，则将请求委托给下一个处理器进行处理
            if (!handled && tmp.successor != null) {
                tmp = tmp.successor;
            } else {
                break;
            }
        }
    }
}
