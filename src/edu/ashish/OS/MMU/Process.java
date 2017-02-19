package edu.ashish.OS.MMU;

/**
 * Created by admin on 11-Nov-16.
 */
public class Process {

    int processID;
    int processState[] = new int[5]; //5 process states
    int size;

    public int getProcessID() {
        return processID;
    }

    public void setProcessID(int processID) {
        this.processID = processID;
    }

    public int[] getProcessState() {
        return processState;
    }

    public void setProcessState(int[] processState) {
        this.processState = processState;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
