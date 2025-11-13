package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MstBuilder {
    public static List<Edge> buildMst(List<Edge> edges, int V) {
        Collections.sort(edges);

        UnionFind uf = new UnionFind(V);
        List<Edge> result = new ArrayList<>();
        for (Edge edge : edges) {
            if (uf.union(edge.src, edge.dest)) {
                result.add(edge);
            }

        }
        return result;
    }
}
