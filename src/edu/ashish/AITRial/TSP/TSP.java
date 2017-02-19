package edu.ashish.AITRial.TSP;

import java.util.HashMap;

/**
 * Created by admin on 20-Aug-16.
 */
public class TSP {

    public boolean isPathCorrect(String path) {
        boolean result = false;
        boolean one = false;
        boolean two = false;
        boolean three = false;

        HashMap<String, Integer[]> graph = new GraphFactory().generateGraph();


        //Checking if starts and ends at same or not
        if (path.charAt(0) == path.charAt(path.length() - 1)) one = true;


        //Checking if the path really exists
        for (int i = 0; i < graph.size(); i++) {
            Integer[] list = graph.get(path.charAt(i) + "");

            String nextInPath = path.charAt(i + 1) + "";

            //TODO INCOMPLETE


        }

        //Checking if each node is visited exactly once or not
        if (path.length() == (graph.size() + 1)) three = true;


        return result;
    }


    public String findOptimalbyGA() {
        String result = "";

        //TODO use Genetic Algorithm :(


        return result;
    }
}
