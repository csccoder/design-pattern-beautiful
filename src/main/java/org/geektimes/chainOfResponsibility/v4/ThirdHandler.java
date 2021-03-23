package org.geektimes.chainOfResponsibility.v4;

/**
 * 处理器实现类
 */
public class ThirdHandler implements Handler {

    @Override
    public boolean handle() {
        boolean handled = false;

        System.out.println("ThirdHandler....");

        return handled;
    }
}
