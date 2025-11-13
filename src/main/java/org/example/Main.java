package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int V = 4;

        List<Edge> edges = new ArrayList<Edge>();
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));
        edges.add(new Edge(2, 0, 6));
        edges.add(new Edge(0, 3, 5));


        List<Edge> mst = MstBuilder.buildMst(edges, V);
        System.out.println("Minimal spanning tree:" + mst);
        int totalWeight = 0;
        for (Edge edge : mst) {
            System.out.println(edge);
            totalWeight += edge.weight;
        }
        System.out.println("Total weight: " + totalWeight);


    }

}