package edu.ashish.AITRial.BFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by admin on 28-Jul-16.
 */
public class Driver {


    static Queue<String> fringe = new LinkedList<>();
    static ArrayList<String> path = new ArrayList<>();

    public static void main(String[] args) {


        GraphFactory factory = new GraphFactory();
        HashMap<String, ArrayList<String>> graph = factory.generateGraph();

        new Driver().findPath(graph);
    }

    void findPath(HashMap<String, ArrayList<String>> graph) {

        String goal = "H";
        String init = "A";

        fringe.add(init);


        while (!(fringe.peek().equals(goal))) {

            String poped = popToVisited();

            if (poped.equals("0")) continue;

            ArrayList<String> adjacentArrayList = searchPoped(graph, poped);

            for (String pointer : adjacentArrayList) {
                if (!(path.contains(pointer)))
                    fringe.add(pointer);

                printStack();
            }

        }

        path.add(goal);
        for (String x : path) {
            System.out.print(x);
        }


        System.out.println();
        levelByLevel(graph, path);


    }


    private void levelByLevel(HashMap<String, ArrayList<String>> graph, ArrayList<String> path) {

        String goal = "A";
        ArrayList<String> levels = new ArrayList<>();

        for (String pointer : path) {
            //if(pointer=="")

            String first = pointer;
            int count = 0;

            while (!first.equals("A")) {
                ArrayList<String> arrayList = searchPoped(graph, first);
                first = arrayList.get(0);
                count++;
            }

            levels.add(count + "");


        }

        for (String x : levels) {
            System.out.print(x);
        }

    }


    String popToVisited() {


        String poped = fringe.poll();

        if (path.contains(poped)) {
            return "0";
        }
        path.add(poped);

        System.out.print("Path - {");
        for (String x : path) {

            System.out.print(x + ", ");

        }

        System.out.print("}\n");

        return poped;
    }


    ArrayList<String> searchPoped(HashMap<String, ArrayList<String>> graph, String source) {

        ArrayList<String> found = graph.get(source);
        return found;

    }


    void printStack() {
        for (String pointer : fringe) {
            System.out.print(pointer);
        }

        System.out.println("\n\n");
    }


}
