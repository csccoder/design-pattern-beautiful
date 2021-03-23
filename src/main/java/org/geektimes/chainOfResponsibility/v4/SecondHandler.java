package org.geektimes.chainOfResponsibility.v4;

import java.util.Random;

/**
 * 处理器实现类
 */
public class SecondHandler implements Handler {

    @Override
    public boolean handle() {
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
