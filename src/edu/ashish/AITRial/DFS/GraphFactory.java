package edu.ashish.AITRial.DFS;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by admin on 28-Jul-16.
 */
public class GraphFactory {

    public HashMap<String, ArrayList<String>> generateGraph() {
        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();

        ArrayList<String> A = new ArrayList<String>();
        A.add("B");
        A.add("C");
        A.add("E");
        A.add("I");
        graph.put("A", A);

        ArrayList<String> B = new ArrayList<String>();
        B.add("A");
        B.add("C");
        B.add("D");
        B.add("F");
        graph.put("B", B);

        ArrayList<String> C = new ArrayList<String>();
        C.add("A");
        C.add("B");
        C.add("D");
        graph.put("C", C);

        ArrayList<String> D = new ArrayList<String>();
        D.add("B");
        D.add("C");
        D.add("H");
        graph.put("D", D);

        ArrayList<String> E = new ArrayList<String>();
        E.add("A");
        E.add("F");
        E.add("G");
        E.add("I");
        graph.put("E", E);

        ArrayList<String> F = new ArrayList<String>();
        F.add("B");
        F.add("E");
        graph.put("F", F);

        ArrayList<String> G = new ArrayList<String>();
        G.add("E");
        G.add("H");
        graph.put("G", G);

        ArrayList<String> H = new ArrayList<String>();
        H.add("D");
        H.add("G");
        graph.put("H", H);

        ArrayList<String> I = new ArrayList<String>();
        I.add("A");
        I.add("E");
        graph.put("I", I);

        return graph;
    }
}
