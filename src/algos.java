package io.wolfinger.algos;

import java.util.Arrays;
import java.util.HashMap;

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
import io.wolfinger.algos.ds.BSTNode;
import io.wolfinger.algos.ds.BST;
import io.wolfinger.algos.ds.Heap;
import io.wolfinger.algos.ds.Trie;
import io.wolfinger.algos.ds.Graph;
import io.wolfinger.algos.ds.Vertex;

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

        // test a binary search tree
        //                   12
        //               7       24
        //             3   8   18   52
        //           1  6        20   103

        BSTNode root = new BSTNode(12);
        BST.insert(root, 7);
        BST.insert(root, 24);
        BST.insert(root, 3);
        BST.insert(root, 8);
        BST.insert(root, 18);
        BST.insert(root, 52);
        BST.insert(root, 1);
        BST.insert(root, 6);
        BST.insert(root, 103);
        BST.insert(root, 20);

        System.out.println(BST.search(root, 18));
        System.out.println(BST.search(root, 3));
        System.out.println(BST.search(root, 21));

        BST.delete(root, 12);

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.left.data);

        System.out.println("heap time ---");
        Heap heap = new Heap(arr[0]);
        for (int i=1; i < arr.length; i++) {
            heap.insert(arr[i]);
        }

        heap.print();
        System.out.println("===");

        heap.delete();
        heap.delete();
        heap.delete();

        heap.print();

        System.out.println("===");

        Trie t = new Trie();
        t.insert("cat");
        t.insert("cab");
        t.insert("call");
        t.insert("caller");

        System.out.println(t.root.kids.get('c').kids.get('a').kids);

        t.collectAllWords(null, "");

        for (String word : t.words) {
            System.out.println(word);
        }

        System.out.println("===");

        // create graph, vertices, and edges
        Graph g = new Graph();

        Vertex vAlice = new Vertex("alice");

        Vertex vBob = new Vertex("bob");
        Vertex vCandy = new Vertex("candy");
        Vertex vDerek = new Vertex("derek");
        Vertex vElaine = new Vertex("elaine");

        Vertex vFred = new Vertex("fred");
        Vertex vGina = new Vertex("gina");

        Vertex vHelen = new Vertex("helen");
        Vertex vIrena = new Vertex("irena");

        g.addVertex(vAlice);

        g.addVertex(vBob);
        g.addVertex(vCandy);
        g.addVertex(vDerek);
        g.addVertex(vElaine);

        g.addVertex(vFred);
        g.addVertex(vGina);

        g.addVertex(vHelen);
        g.addVertex(vIrena);

        vAlice.addAdjacentVertex(vBob);
        vAlice.addAdjacentVertex(vCandy);
        vAlice.addAdjacentVertex(vDerek);
        vAlice.addAdjacentVertex(vElaine);

        vBob.addAdjacentVertex(vCandy);
        vBob.addAdjacentVertex(vFred);

        vCandy.addAdjacentVertex(vAlice);
        vCandy.addAdjacentVertex(vHelen);

        vDerek.addAdjacentVertex(vAlice);
        vDerek.addAdjacentVertex(vElaine);
        vDerek.addAdjacentVertex(vGina);

        vElaine.addAdjacentVertex(vAlice);
        vElaine.addAdjacentVertex(vDerek);

        vFred.addAdjacentVertex(vBob);
        vFred.addAdjacentVertex(vHelen);

        vGina.addAdjacentVertex(vDerek);
        vGina.addAdjacentVertex(vIrena);

        vHelen.addAdjacentVertex(vFred);
        vHelen.addAdjacentVertex(vCandy);

        vIrena.addAdjacentVertex(vGina);

        HashMap<String, Boolean> visited = new HashMap<>();

        System.out.println("=== dfs ===");
        Graph.dfsTraverse(vAlice, visited);

        System.out.println("=== bfs ===");
        Graph.bfsTraverse(vAlice);
    }
}