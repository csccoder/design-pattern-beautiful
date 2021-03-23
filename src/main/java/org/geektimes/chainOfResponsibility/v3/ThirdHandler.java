package org.geektimes.chainOfResponsibility.v3;

/**
 * 处理器实现类
 */
public class ThirdHandler extends Handler {

    @Override
    public boolean handle() {
        boolean handled = false;

        System.out.println("ThirdHandler....");

        return handled;
    }
}
