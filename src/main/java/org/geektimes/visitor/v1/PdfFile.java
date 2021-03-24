package org.geektimes.visitor.v1;

public class PdfFile extends ResourceFile {

    public PdfFile(String name) {
        super(name);
    }

    @Override
    public void extract2Txt() {
        System.out.println("pdf do extract2txt");
    }

}
