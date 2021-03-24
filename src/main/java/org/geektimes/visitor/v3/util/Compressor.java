package org.geektimes.visitor.v3.util;

import org.geektimes.visitor.v3.PdfFile;
import org.geektimes.visitor.v3.PptFile;
import org.geektimes.visitor.v3.WordFile;

/**
 * 压缩工具类
 */
public class Compressor implements IVisitor{


    @Override
    public void visit(PptFile pptFile) {
        System.out.println("ppt:" + pptFile.getName() + " do compress");
    }

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("pdf:" + pdfFile.getName() + " do compress");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("word:" + wordFile.getName() + " do compress");
    }
}
