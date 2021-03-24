package org.geektimes.visitor.v1;

public class PptFile extends ResourceFile {

    public PptFile(String name) {
        super(name);
    }

    @Override
    public void extract2Txt() {
        System.out.println("ppt do extract2txt");

    }

}
