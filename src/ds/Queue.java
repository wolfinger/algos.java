package io.wolfinger.algos.ds;

import java.util.ArrayList;

public class Queue {
    private ArrayList<Integer> queue;

    public Queue() {
        queue = new ArrayList<Integer>();
    }

    public void enqueue(int item) {
        queue.add(item);
    }

    public int dequeue() {
        int item = 0; // return 0 if dequeue is empty, like the stack i know this could be confusing

        if (queue.size() > 0) {
            item = queue.get(0);
            queue.remove(0);
        }

        return item;
    }

    public int read() {
        int item = 0;

        if (queue.size() > 0) {
            item = queue.get(0);
        }

        return item;
    }
}
