package org.geektimes.chainOfResponsibility.v2;

/**
 * 处理器实现类
 */
public class ThirdHandler extends Handler {

    @Override
    protected boolean doHandle() {
        boolean handled = false;

        System.out.println("ThirdHandler....");

        return handled;
    }
}
