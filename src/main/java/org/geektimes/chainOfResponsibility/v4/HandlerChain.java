package org.geektimes.chainOfResponsibility.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理器链
 */
public class HandlerChain {

    private List<Handler> handlerList = new ArrayList<>();

    public void addHandler(Handler handler) {
        handlerList.add(handler);
    }

    public void handle() {
        for (Handler handler : handlerList) {
            boolean handled = handler.handle();
            //如果请求能被当前处理器处理，则中止请求的传递
            if (handled) {
                break;
            }
        }
    }
}
