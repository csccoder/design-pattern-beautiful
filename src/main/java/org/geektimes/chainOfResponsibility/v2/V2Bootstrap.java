package org.geektimes.chainOfResponsibility.v2;

public class V2Bootstrap {
    public static void main(String[] args) {
        //维护处理器链
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new FirstHandler());
        handlerChain.addHandler(new SecondHandler());
        handlerChain.addHandler(new ThirdHandler());

        //执行处理器链
        handlerChain.handle();
    }
}
