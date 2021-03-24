package org.geektimes.snapshot.v2;

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
 * 以下是使用了设计模式的实现
 */
public class V2Bootstrap {
    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotHolder = new SnapshotHolder();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (":list".equals(input)) {
                System.out.println(inputText.getText());
            } else if (":undo".equals(input)) {
                Snapshot snapshot = snapshotHolder.popSnapshot();
                inputText.restoreSnapshot(snapshot);
            } else {
                Snapshot snapshot = inputText.createSnapshot();
                snapshotHolder.saveSnapshot(snapshot);
                inputText.append(input);
            }
        }
    }
}
