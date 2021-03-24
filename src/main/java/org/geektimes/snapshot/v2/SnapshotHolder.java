package org.geektimes.snapshot.v2;

import java.util.Stack;

/**
 * 快照持有类
 */
public class SnapshotHolder {
    private Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void saveSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}
