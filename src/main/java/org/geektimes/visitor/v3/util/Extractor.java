package org.geektimes.visitor.v3.util;

import org.geektimes.visitor.v3.PdfFile;
import org.geektimes.visitor.v3.PptFile;
import org.geektimes.visitor.v3.WordFile;

/**
 * 抽取文本工具类
 */
public class Extractor implements IVisitor{


    @Override
    public void visit(PptFile pptFile) {
        System.out.println("ppt:" + pptFile.getName() + " do extract2txt");
    }

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("pdf:" + pdfFile.getName() + " do extract2txt");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("word:" + wordFile.getName() + " do extract2txt");
    }
}
