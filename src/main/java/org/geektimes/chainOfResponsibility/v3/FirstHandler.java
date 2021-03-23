package org.geektimes.chainOfResponsibility.v3;

/**
 * 处理器实现类
 */
public class FirstHandler extends Handler {

    @Override
    public boolean handle() {
        boolean handled = false;

        System.out.println("FirstHandler....");

        return handled;
    }
}
