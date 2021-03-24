package org.geektimes.visitor.v3.util;

import org.geektimes.visitor.v3.PdfFile;
import org.geektimes.visitor.v3.PptFile;
import org.geektimes.visitor.v3.WordFile;

public interface IVisitor {

    void visit(PptFile pptFile);

    void visit(PdfFile PdfFile);

    void visit(WordFile wordFile);
}
