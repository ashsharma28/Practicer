package edu.ashish.AITRial.DFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * Created by admin on 28-Jul-16.
 */
public class Driver {


    static Stack<String> fringe = new Stack<>();
    static ArrayList<String> path = new ArrayList<>();

    public static void main(String[] args) {

        GraphFactory factory = new GraphFactory();
        HashMap<String, ArrayList<String>> graph = factory.generateGraph();

        new Driver().findPath(graph);
    }

    void findPath(HashMap<String, ArrayList<String>> graph) {

        String goal = "H";
        String init = "A";


        fringe.push(init);


        while (!(fringe.peek().equals(goal))) {

            String poped = popToVisited();

            ArrayList<String> adjacentArrayList = searchPoped(graph, poped);

            for (String pointer : adjacentArrayList) {
                if (!(path.contains(pointer)))
                    fringe.push(pointer);

                printStack();
            }

        }

        for (String x : path) {
            System.out.print(x);
        }
        System.out.print("H");

    }


    String popToVisited() {
        String poped = fringe.pop();
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
        HashMap<ArrayList<String>, ArrayList<Boolean>> a = new HashMap<ArrayList<String>, ArrayList<Boolean>>();

        return found;


    }


    void printStack() {
        for (String pointer : fringe) {
            System.out.println(pointer);
        }

        System.out.println("\n\n");
    }


}
