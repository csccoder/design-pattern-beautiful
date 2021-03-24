package org.geektimes.visitor.v2;

import org.geektimes.visitor.v2.util.Compressor;
import org.geektimes.visitor.v2.util.Extractor;

public class WordFile extends ResourceFile {

    public WordFile(String name) {
        super(name);
    }

    @Override
    void accept(Extractor extractor) {
        extractor.extract2Txt(this);
    }

    @Override
    void accept(Compressor compressor) {
        compressor.compress(this);
    }
}
