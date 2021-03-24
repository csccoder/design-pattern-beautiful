package org.geektimes.visitor.v2;

import org.geektimes.visitor.v2.util.Compressor;
import org.geektimes.visitor.v2.util.Extractor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式
 * 原理：访问者模式针对一组类型不同的对象，在不同的应用场景，我们需要对这些对象执行一系列不相关的业务操作。
 * 为了避免添加新功能导致类不断的修改，不违背开闭原则，并且保持类的职责单一。
 * 我们可以引入访问者模式，把对象和操作解耦，将操作从对象中抽取出来，定义到独立细分的访问者类中。
 * <p>
 * v1:访问者模式实现
 */
public class V2Bootstrap {

    public static void main(String[] args) {
        //抽取文本
        Extractor extractor = new Extractor();
        for (ResourceFile resourceFile : listAllResourceFile("/usr/tmp")) {
            resourceFile.accept(extractor);
        }

        //压缩
        Compressor compressor = new Compressor();
        for (ResourceFile resourceFile : listAllResourceFile("/usr/tmp")) {
            resourceFile.accept(compressor);
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
