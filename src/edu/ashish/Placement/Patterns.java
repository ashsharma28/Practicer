package edu.ashish.Placement;

/**
 * Created by admin on 09-Aug-16.
 */
public class Patterns {

    public static void main(String[] args) {
        Patterns patterns = new Patterns();


        patterns.ChristmasTree();
        System.out.println("\n\n");
        patterns.oneTwoThree();
        System.out.println("\n\n");
        patterns.ABDEFG();
        System.out.println("\n\n");
        patterns.programPrint();
        System.out.println("\n\n");
        patterns.oneTwoOne();
        System.out.println("\n\n");
        patterns.oneOneTwoTwo();
        System.out.println("\n\n");
        patterns.starReverse();
        System.out.println("\n\n");
        patterns.incrementalOneTwoThree();
        System.out.println("\n\n");


    }

    void ChristmasTree() {
        int limit = 10;

        for (int i = 1; i < limit; i++) {

            for (int j = limit - i; j != 1; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++)
                System.out.print("* ");


            System.out.println();
        }

    }

    void oneTwoThree() {

        int limit = 6;

        for (int i = 1; i < limit; i++) {

            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= limit - i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    void ABDEFG() {

        int limit = Alphabets.values().length;
        for (int i = 0; i < limit; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }


            for (int k = 0; k < limit - i; k++)
                System.out.print(Alphabets.getAlphabet(k) + " ");

            System.out.println(

            );

        }
    }

    private void programPrint() {

        char[] program = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};

        String a = new String("");

        for (int i = 0; i < program.length; i++) {
            a = a.concat(String.valueOf(program[i]));
            System.out.println(a);
        }


    }

    private void oneTwoOne() {

        int limit = 5;

        for (int count = 1; count < limit; count++) {
            int i;
            for (i = 1; i <= count; i++) {
                System.out.print(i);
            }

            i = i - 1;
            while (i != 1) {
                System.out.print(i = i - 1);
            }

            System.out.println();


        }
    }

    private void oneOneTwoTwo() {

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private void starReverse() {

        int limit = 8;

        for (int a = limit; a > 0; a--) {

            for (int i = 1; i < a; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void incrementalOneTwoThree() {
        int limit = 9;

        for (int i = 1; i < limit; i++) {

            for (int l = 1; l < i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }

    }

    enum Alphabets {
        A, B, C, D, E, F, G, H, I;

        public static Alphabets getAlphabet(int x) {
            return Alphabets.values()[x];
        }

    }


}

