package io.wolfinger.algos.ds;

public class LinkedList {
    public Node head;
    public Node tail;

    public LinkedList(Node node) {
        head = node;
        tail = node;
    }

    public void addToEnd(Node newNode) {
        // if first element add as head
        if (head == null) {
            head = newNode;
        }

        newNode.prev = tail;
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public Node deleteFromEnd() {
        if (tail != null) {
            Node deleteNode = tail;
            if (tail.prev == null) {
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            return deleteNode;
        } else {
            return null;
        }
    }

    public Node read(int index) {
        Node node = head;

        for (int i=1; i <= index; i++) {
            node = node.next;
            // break loop if requested index is outside list
            if (node == null) {
                break;
            }
        }

        return node;
    }
}
