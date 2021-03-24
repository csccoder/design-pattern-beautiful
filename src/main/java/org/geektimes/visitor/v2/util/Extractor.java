package org.geektimes.visitor.v2.util;

import org.geektimes.visitor.v2.PdfFile;
import org.geektimes.visitor.v2.PptFile;
import org.geektimes.visitor.v2.WordFile;

/**
 * 抽取文本工具类
 */
public class Extractor {

    public void extract2Txt(PdfFile pdfFile) {
        System.out.println("pdf:" + pdfFile.getName() + " do extract2txt");
    }

    public void extract2Txt(PptFile pptFile) {
        System.out.println("ppt:" + pptFile.getName() + " do extract2txt");
    }

    public void extract2Txt(WordFile wordFile) {
        System.out.println("word:" + wordFile.getName() + " do extract2txt");
    }
}
