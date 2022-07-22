package io.wolfinger.algos.ds;

import java.util.ArrayList;

public class VertexQueue {
    public ArrayList<Vertex> queue;

    public VertexQueue() {
        queue = new ArrayList<>();
    }

    public void enqueue(Vertex item) {
        // add to queue
        queue.add(item);
    }

    public Vertex dequeue() {
        Vertex item = null;

        // remove from queue
        if (queue.size() > 0) {
            item = queue.get(0);
            queue.remove(0);
        }

        return item;
    }

    public Vertex read() {
        Vertex item = null;

        if (queue.size() > 0) {
            item = queue.get(0);
        }

        return item;
    }

    public boolean isEmpty() {
        if (queue.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
