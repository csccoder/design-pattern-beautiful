package org.geektimes.visitor.v2;

import org.geektimes.visitor.v2.util.Compressor;
import org.geektimes.visitor.v2.util.Extractor;

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

    abstract void accept(Extractor extractor);

    abstract void accept(Compressor extractor);
}
