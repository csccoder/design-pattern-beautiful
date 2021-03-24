package org.geektimes.visitor.v3;

import org.geektimes.visitor.v3.util.IVisitor;

public class PptFile extends ResourceFile {

    public PptFile(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
