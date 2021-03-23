package org.geektimes.chainOfResponsibility.v2;

/**
 * 处理器实现类
 */
public class FirstHandler extends Handler {

    @Override
    protected boolean doHandle() {
        boolean handled = false;
        System.out.println("FirstHandler....");

        return handled;
    }
}
