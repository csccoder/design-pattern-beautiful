package org.geektimes.snapshot.v1;

import java.util.Scanner;

/**
 * 备忘录模式（快照模式）
 * 原理：在不违反封装的原则下，获取对象内部的状态，并在对象外部将状态进行备份，以便日后将对象恢复到之前的状态。
 *      如果是的大对象数据进行备份并且备份比较频繁，那么产生的快照会占用较多的内存，进行备份恢复花费的时间也会比较多，
 *      那么我们可以只提取数据中的一些重要信息进行备份，节省内存，日后恢复只要基于最新对象数据还原即可。
 *      或者采用增量备份和全量备份结合的方式，低频全量备份，高频增量备份
 *
 *
 * 案例：记录用户输入的内容至内存。如果用户输入:list，就需要将内存中的文本输出；如果用户输入:undo，就需要撤销上一次的输入
 *
 * 以下是传统实现
 * 但是有两个缺点：
 * 1.InputText暴露了setText()方法，可能会被业务系统调用，但这样暴露了不该暴露的方法，违反了封装原则
 * 2.快照应该是不可变的。但此版本中快照复用了InputText类，但该类暴露了set方法，可以修改快照内容
 */
public class V1Bootstrap {
    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotHolder = new SnapshotHolder();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (":list".equals(input)) {
                System.out.println(inputText.getText());
            } else if (":undo".equals(input)) {
                InputText snapshot = snapshotHolder.popSnapshot();
                inputText.setText(snapshot.getText());
            } else {
                snapshotHolder.saveSnapshot(inputText);
                inputText.append(input);
            }
        }
    }
}
