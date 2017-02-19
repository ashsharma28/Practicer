package edu.ashish.apac.Prob6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by admin on 06-Nov-16.
 */
public class Solver {

    public static void main(String[] args) throws IOException {

        String url = "C:\\Users\\admin\\IdeaProjects\\Practice\\src\\edu\\ashish\\apac\\Prob6\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(new File(url));
        byte[] b = new byte[fileInputStream.available()];
        fileInputStream.read(b);

        String input = new String(b);
        StringTokenizer tokenizer = new StringTokenizer(input, "\r\n");

        int limit = Integer.parseInt(tokenizer.nextToken());


        for (int index = 1; index <= limit; index++) {//loop for iterating through all the inputs

            String pattern = tokenizer.nextToken();

            String values = (tokenizer.nextToken());
            StringTokenizer tokenizer2 = new StringTokenizer(values, " ");

            int i = Integer.parseInt(tokenizer2.nextToken());
            int j = Integer.parseInt(tokenizer2.nextToken());

            int occurrences = countBlueOccurrences(pattern);
            System.out.println(occurrences);


            int temp1 = i;
            for (int x = 0; x <= limit; x++) {
                if ((temp1 % pattern.length()) == 0) break;
                temp1 = temp1 + 1;
            }

            int temp2 = j;
            for (int x = 0; x <= limit; x++) {
                if ((temp2 % pattern.length()) == 0) break;
                temp2 = temp2 - 1;
            }

            int diff = temp2 - temp1;
            int product = (diff / pattern.length()) * occurrences;

            int iModulo = takeModulo(i, pattern.length());
            int temp1Modulo = takeModulo(temp1, pattern.length());
            int i1 = countBlueOccurrences(pattern.substring(iModulo - 1, temp1Modulo + 1));


            int jModulo = takeModulo(j, pattern.length());
            int temp2Modulo = takeModulo(temp2, pattern.length());
            int i2 = countBlueOccurrences(pattern.substring(jModulo - 1, temp2Modulo + 1));


        }


    }

    private static int takeModulo(int i, int x) {

        if ((i % x) == 0)
            return x;
        else return i & x;

    }

    private static int countBlueOccurrences(String pattern) {
        int counter = 0;

        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'B') {
                counter++;
            }
        }

        return counter;
    }
}
