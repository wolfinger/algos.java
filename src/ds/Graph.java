package io.wolfinger.algos.ds;

import java.util.HashMap;
import java.util.Map;

public class Graph {
    public HashMap<String, Vertex> vertices;

    public Graph() {
        vertices = new HashMap<>();
    }

    public void addVertex(Vertex v) {
        if (!vertices.containsKey(v.name)) {
            vertices.put(v.name, v);
        }
    }

    public static void dfsTraverse(Vertex v, HashMap<String, Boolean> visited) {
        visited.put(v.name, true);

        System.out.println("visited: " + v.name);

        for (Map.Entry<String, Vertex> adjV : v.adjacentVertices.entrySet()) {
            if (!visited.containsKey(adjV.getKey())) {
                dfsTraverse(adjV.getValue(), visited);
            }
        }
    }

    public static void bfsTraverse(Vertex v) {
        VertexQueue vq = new VertexQueue();
        HashMap<String, Boolean> visited = new HashMap<>();

        visited.put(v.name, true);
        vq.enqueue(v);

        while (!vq.isEmpty()) {
            Vertex currV = vq.dequeue();

            System.out.println("visited: " + currV.name);

            for(Map.Entry<String, Vertex> adjV : v.adjacentVertices.entrySet()) {
                if (!visited.containsKey(adjV.getKey())) {
                    visited.put(adjV.getKey(), true);
                    vq.enqueue(adjV.getValue());
                }
            }
        }
    }
}
