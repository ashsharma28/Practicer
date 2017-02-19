package edu.ashish.apac.Prob3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Created by admin on 16-Apr-16.
 */
public class Exp3 {

    public static int convertToASCII(char c) {
        int x = (int) c;

        return x;
    }

    public static void main(String[] args) {
        try {

            String url = "C:\\Users\\admin\\IdeaProjects\\Practice\\src\\edu\\ashish\\apac\\Prob3\\input.txt";

            FileInputStream fileInputStream = new FileInputStream(new File(url));
            byte[] b = new byte[fileInputStream.available()];
            fileInputStream.read(b);

            String input = new String(b);
            StringTokenizer tokenizer = new StringTokenizer(input, "\r\n");

            int limit = Integer.parseInt(tokenizer.nextToken());

            int max = 0;


            for (int index = 1; index <= limit; index++) {//loop for iterating through all the inputs

                LinkedList<Integer> linkedList = new LinkedList();

                String target = tokenizer.nextToken();
                StringTokenizer mini = new StringTokenizer(target, "");

                char[] a = target.toCharArray();
                int y;

                char x = a[0];//first char
                y = Exp3.convertToASCII(x);//ASCII of first char
                linkedList.add(y);
                max = y;

                for (int p = 1; p < a.length; p++) {

                    int toPlayWith = Exp3.convertToASCII(a[p]);

                    if (toPlayWith >= max) {
                        linkedList.addFirst(toPlayWith);
                        max = toPlayWith;
                    } else {
                        linkedList.addLast(toPlayWith);
                    }

                }


                Object[] fin = linkedList.toArray();

                System.out.print("Case #" + index + ": ");
                for (Object aa : fin) {
                    System.out.print("" + (char) ((Integer) aa).intValue());
                }

                System.out.println();


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
