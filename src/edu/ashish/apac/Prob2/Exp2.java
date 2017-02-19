package edu.ashish.apac.Prob2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by admin on 09-Apr-16.
 */
public class Exp2 {


    public static void main(String[] args) {

        try {

            String url = "C:\\Users\\admin\\IdeaProjects\\Practice\\src\\edu\\ashish\\apac\\Prob2\\input.txt";

            FileInputStream fileInputStream = new FileInputStream(new File(url));
            byte[] b = new byte[fileInputStream.available()];
            fileInputStream.read(b);

            String input = new String(b);
            StringTokenizer tokenizer = new StringTokenizer(input, "\r\n");
            StringTokenizer value;

            int limit = Integer.parseInt(tokenizer.nextToken());

            String temp = null;
            String tempStack[] = new String[]{};
            int i = 0, x = 0;
            boolean doneKya;


            for (int index = 1; index <= limit; index++) {

                char[] stack = tokenizer.nextToken().toCharArray();

                int count = 0;

                doneKya = new Temp().doneKyaM(stack);

                while (!doneKya) {

                    stack = new Exp2().doProcess(stack);
                    count++;
                    doneKya = new Temp().doneKyaM(stack);

                }


                System.out.println("Case #" + index + ": " + count);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    char[] doProcess(char[] stack) {


        if (stack[0] == '+') {
            stack[0] = '-';
            int k = 1;
            while (k < stack.length) {
                if (stack[k] != ('-')) stack[k] = '-';
                else if (stack[k] == ('-')) break;

                k++;
            }
        } else if (stack[0] == '-') {
            stack[0] = '+';
            int k = 1;

            while (k < stack.length) {

                if (stack[k] != ('+')) {
                    stack[k] = '+';
                } else if (stack[k] == ('+')) break;

                k++;
            }
        }


        return stack;

    }


}
