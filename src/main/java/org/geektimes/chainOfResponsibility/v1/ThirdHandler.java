package org.geektimes.chainOfResponsibility.v1;

/**
 * 处理器实现类
 */
public class ThirdHandler extends Handler {

    @Override
    public void handle() {
        boolean handled = false;

        System.out.println("ThirdHandler....");

        //如果请求不能被当前处理器处理，并且该处理器包含后继处理器，则将请求委托给下一个处理器进行处理
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
