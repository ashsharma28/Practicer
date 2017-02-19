package edu.ashish.PCD.FirstAndFollow;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by Ashish on 18-Feb-16.
 */
public class ProductionRules {


    public LinkedHashMap<NonTerminal, ArrayList<Object>> makeProductionTable() {

        ProductionRules productionRules = new ProductionRules();

        LinkedHashMap<NonTerminal, ArrayList<Object>> hashmap = new LinkedHashMap<>();
        ArrayList<Object> arrayList = new ArrayList<Object>();


        try {

            String url = "C:\\Users\\admin\\IdeaProjects\\Practice\\src\\edu\\ashish\\PCD\\FirstAndFollow\\input.txt";

            FileInputStream fileInputStream = new FileInputStream(new File(url));
            byte[] b = new byte[fileInputStream.available()];
            fileInputStream.read(b);
            String ggg = new String(b).replaceAll("\n", "-");


            ArrayList<String> source = new ArrayList<>();


            for (int a = 0; a < ggg.length(); a++) {

                String text = ggg.charAt(a) + "";

                if (text.equals("\n") || text.equals("\r")) {
                    continue;
                }

                source.add(text);
            }

            NonTerminal nonTerminal = null;
            NonTerminal nonTerminalForRHS = null;
            Terminal terminal = null;
            int index = 0;


            while ((index < source.size()) && !(source.get(index).equals("-"))) {

                nonTerminal = new NonTerminal(source.get(index));
                //hashmap.put(nonTerminal, )

                index = index + 2;

                arrayList = new ArrayList<>();

                while (index < source.size() && !(source.get(index).equals("-"))) {

                    if (Character.isUpperCase(source.get(index).charAt(0))) {
                        nonTerminalForRHS = new NonTerminal(source.get(index));
                        arrayList.add(nonTerminalForRHS);
                    } else {
                        terminal = new Terminal(source.get(index));
                        arrayList.add(terminal);
                    }

                    index = index + 1;
                }
                hashmap.put(nonTerminal, arrayList);

                index = index + 1;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return hashmap;
    }

}
