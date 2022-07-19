package io.wolfinger.algos.ds;

import java.util.ArrayList;

public class Heap {
    public ArrayList<Integer> data;

    public Heap(int val) {
        data = new ArrayList<>(val);
    }

    public void print() {
        for (Integer datum : data) {
            System.out.println(datum);
        }
    }

    private int rootNode() {
        if (data.size() > 0) {
            return data.get(0);
        } else {
            return -1;
        }
    }

    private int lastNode() {
        if (data.size() > 0) {
            return data.get(data.size() - 1);
        } else {
            return -1;
        }
    }

    private int leftKid(int index) {
        return (index * 2) + 1;
    }

    private int rightKid(int index) {
        return (index * 2) +2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    public int insert(int val) {
        data.add(val);

        int valIdx = data.size() - 1;
        int parentIdx = parent(valIdx);
        while (data.get(valIdx) > data.get(parentIdx)) {
            int temp = data.get(valIdx);
            data.set(valIdx, data.get(parentIdx));
            data.set(parentIdx, temp);
            valIdx = parentIdx;
            parentIdx = parent(valIdx);
        }

        return data.get(valIdx);
    }

    private boolean hasGreaterKid(int index) {
        return ((leftKid(index) < data.size()) && (data.get(index) < data.get(leftKid(index)))) ||
                ((rightKid(index) < data.size()) && data.get(index) < data.get(rightKid(index)));
    }

    private int calcLargerKid(int index) {
        int leftKid = -1, rightKid;

        if (leftKid(index) < data.size()) {
            leftKid = leftKid(index);
        }

        if (rightKid(index) >= data.size()) {
            return leftKid;
        } else {
            rightKid = rightKid(index);
        }

        if (data.get(rightKid) > data.get(leftKid)) {
            return rightKid;
        } else {
            return leftKid;
        }
    }

    public int delete() {
        int retVal = rootNode();

        // swap last item with root
        data.set(data.indexOf(rootNode()), lastNode());

        // delete last node
        data.remove(data.size()-1);

        // trickle down the root note
        int trickleIdx = 0;
        while (hasGreaterKid(trickleIdx)) {
            int largerKidIdx = calcLargerKid(trickleIdx);
            int tmpVal = data.get(trickleIdx);
            data.set(trickleIdx, data.get(largerKidIdx));
            data.set(largerKidIdx, tmpVal);
            trickleIdx = largerKidIdx;
        }

        return retVal;
    }
}
