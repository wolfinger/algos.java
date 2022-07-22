package io.wolfinger.algos.ds;

import java.util.HashMap;

public class Vertex {
    public String name;
    public HashMap<String, Vertex> adjacentVertices;

    public Vertex(String newName) {
        name = newName;
        adjacentVertices = new HashMap<>();
    }

    public void addAdjacentVertex(Vertex adjV) {
        if (!adjacentVertices.containsKey(adjV.name)) {
            adjacentVertices.put(adjV.name, adjV);
        }
    }
}
