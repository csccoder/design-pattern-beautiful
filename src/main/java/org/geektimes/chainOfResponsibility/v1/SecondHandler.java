package org.geektimes.chainOfResponsibility.v1;

import java.util.Random;

/**
 * 处理器实现类
 */
public class SecondHandler extends Handler {

    @Override
    public void handle() {
        Random random = new Random();
        boolean handled = random.nextBoolean();

        if (handled) {
            System.out.println("SecondHandler 成功处理请求，中止请求传递....");
        } else {
            System.out.println("SecondHandler....");
        }


        //如果请求不能被当前处理器处理，并且该处理器包含后继处理器，则将请求委托给下一个处理器进行处理
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
