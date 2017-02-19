package edu.ashish.AITRial.TSP;

import java.util.HashMap;

/**
 * Created by admin on 28-Jul-16.
 */
public class GraphFactory {

    public static final int x = 9999;

    public HashMap<String, Integer[]> generateGraph() {


        HashMap<String, Integer[]> graph = new HashMap<String, Integer[]>();

        Integer[] A = new Integer[]{0, 10, x, 10, x, x, x, 90};
        graph.put("A", A);

        Integer[] B = new Integer[]{10, 0, 20, x, x, x, x, x};
        graph.put("B", B);

        Integer[] C = new Integer[]{x, 20, 0, 40, 10, x, x, x};
        graph.put("C", C);

        Integer[] D = new Integer[]{10, x, 40, 0, 50, 70, x, 20};
        graph.put("D", D);

        Integer[] E = new Integer[]{x, x, 10, 50, 0, 60, 70, x};
        graph.put("E", E);

        Integer[] F = new Integer[]{x, x, x, 70, 60, 0, 80, 50};
        graph.put("F", F);

        Integer[] G = new Integer[]{x, x, x, x, 70, 80, 0, 70};
        graph.put("G", G);

        Integer[] H = new Integer[]{90, x, x, 30, x, 50, 70, 0};
        graph.put("B", B);

        return graph;
    }

    public HashMap<String, Integer[]> generateCompletelyConnectedGraph() {


        HashMap<String, Integer[]> graph = new HashMap<String, Integer[]>();

        Integer[] A = new Integer[]{0, 10, x, 10, x, x, x, 90};
        graph.put("A", A);

        Integer[] B = new Integer[]{10, 0, 20, x, x, x, x, x};
        graph.put("B", B);

        Integer[] C = new Integer[]{x, 20, 0, 40, 10, x, x, x};
        graph.put("C", C);

        Integer[] D = new Integer[]{10, x, 40, 0, 50, 70, x, 20};
        graph.put("D", D);

        Integer[] E = new Integer[]{x, x, 10, 50, 0, 60, 70, x};
        graph.put("E", E);

        Integer[] F = new Integer[]{x, x, x, 70, 60, 0, 80, 50};
        graph.put("F", F);

        Integer[] G = new Integer[]{x, x, x, x, 70, 80, 0, 70};
        graph.put("G", G);

        Integer[] H = new Integer[]{90, x, x, 30, x, 50, 70, 0};
        graph.put("B", B);

        return graph;
    }
}
