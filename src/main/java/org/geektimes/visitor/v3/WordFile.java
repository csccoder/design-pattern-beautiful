package org.geektimes.visitor.v3;

import org.geektimes.visitor.v3.util.IVisitor;

public class WordFile extends ResourceFile {

    public WordFile(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
