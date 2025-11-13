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

        Edge removed = mst.remove(0);
        System.out.println("Removed edge: " + removed);

        UnionFind uf = new UnionFind(V);
        for (Edge edge : mst) {
            uf.union(edge.src, edge.dest);

        }
        int rootOne = uf.find(removed.src);
        int rootTwo = uf.find(removed.dest);
        System.out.println("Root one: " + rootOne + ", Root two: " + rootTwo);

        Edge replace = null;
        for (Edge edge : edges) {
            if (edge == removed) continue;
            if (uf.find(edge.src) != uf.find(edge.dest) ) {
                if (replace == null || edge.weight < replace.weight) {
                    replace = edge;
                }
            }
        }
        System.out.println("Replace: " + replace);
        mst.add(replace);

        System.out.println(" New Mst: " + mst);
        int newWeight = 0;
        for (Edge edge : mst) {
            newWeight += edge.weight;
            System.out.println(edge);
        }
        System.out.println("New total weight: " + newWeight);




    }

}