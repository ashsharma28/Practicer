package edu.ashish.apac.Prob4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by admin on 16-Apr-16.
 */
public class Exp4 {


    public static int count(String target, char c) {

        int count = 0;
        char[] targetArray = target.toCharArray();

        for (int i = 0; i < targetArray.length; i++) {
            if (targetArray[i] == c)
                count++;
        }


        return count;
    }


    public static void main(String[] args) throws IOException {
        String url = "C:\\Users\\admin\\IdeaProjects\\Practice\\src\\edu\\ashish\\apac\\Prob4\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(new File(url));
        byte[] b = new byte[fileInputStream.available()];
        fileInputStream.read(b);

        String input = new String(b);
        StringTokenizer tokenizer = new StringTokenizer(input, "\r\n");

        int limit = Integer.parseInt(tokenizer.nextToken());
        boolean FLAG = true;


        for (int index = 0; index < limit; index++) {

            boolean[] nums = new boolean[]{false, false, false, false, false, false, false, false, false, false};
            int length = 0;

            String target = tokenizer.nextToken();
            char[] c = target.toCharArray();
            ArrayList<Character> targetArray = new ArrayList<Character>();

            ArrayList<Character> output = new ArrayList<Character>();

            for (int i = 0; i < target.length(); i++) {
                targetArray.add(c[i]);
            }


            if (target.contains('Z' + "")) {
                int i = count(target, 'Z');

                length += length * i;

                for (int x = 0; x < i; x++) {
                    targetArray.remove(Character.valueOf('Z'));
                    targetArray.remove(Character.valueOf('E'));
                    targetArray.remove(Character.valueOf('R'));
                    targetArray.remove(Character.valueOf('O'));
                    output.add('0');
                }


            }

            if (target.contains('W' + "")) {
                int i = count(target, 'W');
                length += length * i;

                for (int x = 0; x < i; x++) {
                    targetArray.remove(Character.valueOf('W'));
                    targetArray.remove(Character.valueOf('T'));
                    targetArray.remove(Character.valueOf('O'));
                    output.add('2');
                }

            }

            if (target.contains('H' + "")) {

                if (target.contains('G' + "")) {
                    int i = count(target, 'G');
                    for (int x = 0; x < i; x++) {
                        targetArray.remove(Character.valueOf('E'));
                        targetArray.remove(Character.valueOf('I'));
                        targetArray.remove(Character.valueOf('G'));
                        targetArray.remove(Character.valueOf('H'));
                        targetArray.remove(Character.valueOf('T'));
                        output.add('8');
                    }
                    length += length * i;
                    nums[8] = true;
                } else {
                    int i = count(target, 'H');
                    length += length * i;

                    for (int x = 0; x < i; x++) {
                        targetArray.remove(Character.valueOf('T'));
                        targetArray.remove(Character.valueOf('H'));
                        targetArray.remove(Character.valueOf('R'));
                        targetArray.remove(Character.valueOf('E'));
                        targetArray.remove(Character.valueOf('E'));
                        output.add('3');
                    }


                    nums[3] = true;
                }
            }


            if (target.contains('F' + "")) {

                if (target.contains('U' + "")) {
                    int i = count(target, 'U');

                    for (int x = 0; x < i; x++) {
                        targetArray.remove(Character.valueOf('F'));
                        targetArray.remove(Character.valueOf('O'));
                        targetArray.remove(Character.valueOf('U'));
                        targetArray.remove(Character.valueOf('R'));
                        output.add('4');
                    }


                    length += length * i;
                    nums[4] = true;
                } else {
                    int i = count(target, 'F');

                    for (int x = 0; x < i; x++) {
                        targetArray.remove(Character.valueOf('F'));
                        targetArray.remove(Character.valueOf('I'));
                        targetArray.remove(Character.valueOf('V'));
                        targetArray.remove(Character.valueOf('E'));
                        output.add('5');
                    }


                    length += length * i;
                    nums[5] = true;
                }
            }


            if (target.contains('S' + "")) {

                if (target.contains('X' + "")) {
                    int i = count(target, 'X');

                    for (int x = 0; x < i; x++) {
                        targetArray.remove(Character.valueOf('S'));
                        targetArray.remove(Character.valueOf('I'));
                        targetArray.remove(Character.valueOf('X'));
                        output.add('6');
                    }

                    length += length * i;
                    nums[6] = true;
                } else {
                    int i = count(target, 'S');

                    for (int x = 0; x < i; x++) {
                        targetArray.remove(Character.valueOf('S'));
                        targetArray.remove(Character.valueOf('E'));
                        targetArray.remove(Character.valueOf('V'));
                        targetArray.remove(Character.valueOf('E'));
                        targetArray.remove(Character.valueOf('N'));
                        output.add('7');
                    }


                    length += length * i;
                    nums[7] = true;
                }
            }


            if (targetArray.contains('O')) {
                int i = count(targetArray.toString(), 'O');
                length += length * i;
                for (int x = 0; x < i; x++) {
                    targetArray.remove(Character.valueOf('O'));
                    targetArray.remove(Character.valueOf('N'));
                    targetArray.remove(Character.valueOf('E'));
                    output.add('1');
                }


                nums[1] = true;
            }

            if (targetArray.contains('I')) {
                int i = count(targetArray.toString(), 'I');
                length += length * i;
                for (int x = 0; x < i; x++) {
                    targetArray.remove(Character.valueOf('N'));
                    targetArray.remove(Character.valueOf('I'));
                    targetArray.remove(Character.valueOf('N'));
                    targetArray.remove(Character.valueOf('E'));
                    output.add('9');
                }


                nums[9] = true;
            }


            System.out.print("Case #" + index + ": ");
            //output.sort(output.toArray());
            for (int x = 0; x < output.size(); x++) {
                if (nums[x]) {
                    System.out.print(x);
                }
            }

            System.out.println();


        }

    }

}
