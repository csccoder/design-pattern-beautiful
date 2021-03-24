package org.geektimes.visitor.v1;

public class WordFile extends ResourceFile {

    public WordFile(String name) {
        super(name);
    }

    @Override
    public void extract2Txt() {
        System.out.println("word do extract2txt");
    }

}
