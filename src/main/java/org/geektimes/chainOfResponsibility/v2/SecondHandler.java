package org.geektimes.chainOfResponsibility.v2;

import java.util.Random;

/**
 * 处理器实现类
 */
public class SecondHandler extends Handler {

    @Override
    protected boolean doHandle() {
        Random random = new Random();
        boolean handled = random.nextBoolean();

        if (handled) {
            System.out.println("SecondHandler 成功处理请求，中止请求传递....");
        } else {
            System.out.println("SecondHandler....");
        }

        return handled;
    }
}
