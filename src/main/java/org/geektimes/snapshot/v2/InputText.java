package org.geektimes.snapshot.v2;

public class InputText {
    private StringBuilder text = new StringBuilder();

    public String getText() {
        return text.toString();
    }

    public void append(String text) {
        this.text.append(text);
    }

    public Snapshot createSnapshot() {
        Snapshot snapshot = new Snapshot(text.toString());
        return snapshot;
    }

    public void restoreSnapshot(Snapshot snapshot) {
        this.text.replace(0, this.text.length(), snapshot.getText());
    }
}
