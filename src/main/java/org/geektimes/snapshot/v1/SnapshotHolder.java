package org.geektimes.snapshot.v1;

import java.util.Stack;

/**
 * 快照持有类
 */
public class SnapshotHolder {
    private Stack<InputText> snapshots = new Stack<>();

    public InputText popSnapshot() {
        return snapshots.pop();
    }

    public void saveSnapshot(InputText inputText) {
        InputText cloneInputText = new InputText();
        cloneInputText.setText(inputText.getText());
        snapshots.push(cloneInputText);
    }
}
