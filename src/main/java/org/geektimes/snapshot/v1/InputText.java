package org.geektimes.snapshot.v1;

public class InputText {
    private StringBuilder text = new StringBuilder();

    public String getText() {
        return text.toString();
    }

    public void append(String text) {
        this.text.append(text);
    }

    public void setText(String text) {
        this.text.replace(0, this.text.length(), text);
    }
}
