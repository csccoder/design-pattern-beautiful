package org.geektimes.chainOfResponsibility.v4;

/**
 * 处理器实现类
 */
public class FirstHandler implements Handler {

    @Override
    public boolean handle() {
        boolean handled = false;

        System.out.println("FirstHandler....");

        return handled;
    }
}
