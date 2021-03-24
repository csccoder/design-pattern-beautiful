package org.geektimes.visitor.v3;

import org.geektimes.visitor.v3.util.Compressor;
import org.geektimes.visitor.v3.util.Extractor;
import org.geektimes.visitor.v3.util.IVisitor;

public abstract class ResourceFile {

    private String name;

    public ResourceFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void accept(IVisitor visitor);
}
