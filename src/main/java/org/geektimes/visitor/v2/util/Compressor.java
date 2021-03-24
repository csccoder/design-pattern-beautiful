package org.geektimes.visitor.v2.util;

import org.geektimes.visitor.v2.PdfFile;
import org.geektimes.visitor.v2.PptFile;
import org.geektimes.visitor.v2.WordFile;

/**
 * 压缩工具类
 */
public class Compressor {

    public void compress(PdfFile pdfFile) {
        System.out.println("pdf:" + pdfFile.getName() + " do compress");
    }

    public void compress(PptFile pptFile) {
        System.out.println("ppt:" + pptFile.getName() + " do compress");
    }

    public void compress(WordFile wordFile) {
        System.out.println("word:" + wordFile.getName() + " do compress");
    }
}
