package edu.ashish.PCD.ThreeAddressCodeGen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


/**
 * Created by admin on 14-Apr-16.
 */
public class Converter {

    public static void main(String[] args) {
        try {

            String url = "C:\\Users\\admin\\IdeaProjects\\Practice\\src\\edu\\ashish\\PCD\\ThreeAddressCodeGen\\Input.txt";

            FileInputStream fileInputStream = new FileInputStream(new File(url));
            byte[] b = new byte[fileInputStream.available()];
            fileInputStream.read(b);
            String input = new String(b);

            StringTokenizer stringTokenizer = new StringTokenizer(input);

            ArrayList<String> inputArray = new ArrayList<String>();


            int i = 0;
            String aa;

            while (stringTokenizer.hasMoreTokens()) {
                aa = stringTokenizer.nextToken();
                inputArray.add(aa);
            }


            ArrayList<String> expressionString = new ArrayList<String>();

            i = 0;

            for (String a : inputArray) {
                if (a.contains("+") || a.contains("-") || a.contains("*") || a.contains("/") || a.contains("=")) {
                    expressionString.add(a);
                }

            }


            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("*");
            arrayList.add("/");
            arrayList.add("+");
            arrayList.add("-");

            int anotherIndex = 0;

            for (String a : expressionString) {

                int index = a.indexOf(arrayList.get(anotherIndex));
                System.out.println("t1 = " + a.charAt(index - 1) + a.charAt(index) + a.charAt(index + 1));


            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
