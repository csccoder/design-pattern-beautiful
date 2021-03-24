package org.geektimes.visitor.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式
 * 原理：访问者模式针对一组类型不同的对象，在不同的应用场景，我们需要对这些对象执行一系列不相关的业务操作。
 * 为了避免添加新功能导致类不断的修改，不违背开闭原则，并且保持类的职责单一。
 * 我们可以引入访问者模式，把对象和操作解耦，将操作从对象中抽取出来，定义到独立细分的访问者类中。
 *
 * v1:传统方式实现
 */
public class V1Bootstrap {

    public static void main(String[] args) {
        List<ResourceFile> resourceFiles = listAllResourceFile("/usr/tmp");

        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.extract2Txt();
        }
    }

    private static List<ResourceFile> listAllResourceFile(String resourcePath) {
        ArrayList<ResourceFile> list = new ArrayList<>();
        list.add(new PdfFile("a.pdf"));
        list.add(new WordFile("b.word"));
        list.add(new PptFile("c.ppt"));
        return list;
    }
}
