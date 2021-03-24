package org.geektimes.visitor.v1;

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

    /**
     * 操作：抽取文件中的内容至txt
     */
    public abstract void extract2Txt();
}
