package io.wolfinger.algos;

import java.util.Arrays;
import io.wolfinger.algos.search.Binary;
import io.wolfinger.algos.sort.Bubble;
import io.wolfinger.algos.sort.Selection;
import io.wolfinger.algos.sort.Insertion;
import io.wolfinger.algos.sort.Quicksort;
import io.wolfinger.algos.sort.Quickselect;
import io.wolfinger.algos.ds.Stack;
import io.wolfinger.algos.ds.Queue;
import io.wolfinger.algos.ds.Node;
import io.wolfinger.algos.ds.LinkedList;

class Algos {
    public static void main(String[] args) {
        int[] arr = {24, 3, 7, 6, 8, 103, 18, 1, 52, 12};

        // test bubble sort
        // arr = Bubble.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // test selection sort
        // arr = Selection.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // test insertion sort
        // arr = Insertion.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // test quickselect
        System.out.println(Quickselect.select(arr, 2));
        System.out.println(Quickselect.select(arr, 0));
        System.out.println(Quickselect.select(arr, 4));

        // test quicksort
        arr = Quicksort.sort(arr);
        System.out.println(Arrays.toString(arr));

        // test binary search
        int[] searchRet;
        searchRet = Binary.search(arr, 6);
        System.out.println(searchRet[0] + ", " + searchRet[1]);

        searchRet = Binary.search(arr, 52);
        System.out.println(searchRet[0] + ", " + searchRet[1]);

        searchRet = Binary.search(arr, 1);
        System.out.println(searchRet[0] + ", " + searchRet[1]);

        searchRet = Binary.search(arr, 2);
        System.out.println(searchRet[0] + ", " + searchRet[1]);

        // test a stack
        System.out.println("testing stack:");
        Stack s = new Stack();

        System.out.println(s.read());

        for (int i=0; i < arr.length; i++) {
            s.push(arr[i]);
        }

        System.out.println(s.read());
        System.out.println(s.pop());
        System.out.println(s.read());

        // test a queue
        System.out.println("testing queue:");
        Queue q = new Queue();

        System.out.println(q.read());

        for (int i=0; i < arr.length; i++) {
            q.enqueue(arr[i]);
        }

        System.out.println(q.read());
        System.out.println(q.dequeue());
        System.out.println(q.read());

        // test a linked list
        System.out.println("testing linked list:");

        Node n1 = new Node(arr[0]);
        Node n2 = new Node(arr[1]);
        Node n3 = new Node(arr[3]);

        LinkedList ll = new LinkedList(n1);
        System.out.println(ll.head.data);
        ll.addToEnd(n2);
        ll.addToEnd(n3);

        // print nodes
        for(Node node = ll.head; node != null; node = node.next) {
            System.out.println(node.data);
        }

        ll.deleteFromEnd();

        // print nodes using read method
        System.out.println(ll.read(0));
        System.out.println(ll.read(1));
        System.out.println(ll.read(2));
    }
}