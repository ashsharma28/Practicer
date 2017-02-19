package edu.ashish.Placement;

/**
 * Created by admin on 09-Aug-16.
 */
public class Fibonacci {

    private static int count = 0;

    public static void main(String[] args) {
/*
        int source = 50;

        int a = 1;
        int b = 2;
        int count = 0;
        while ((count) != source){
            count++;
            int temp = a + b;
            System.out.print(temp + " ");

            a = b;
            b = temp;
        }
*/

        char[] source = {'a', 'b', 'c'};
        char[] targett = {'d', 'e', 'f'};


        char[] merged = new char[source.length + targett.length];

        int k = 0;
        for (int i = 0, j = 0; i < source.length || j < targett.length; i++, j++) {

            merged[k] = source[i];
            merged[source.length + k] = targett[j];

            k++;
        }


        for (char a : merged)
            System.out.print(a);


        //fibo(1, 2);

    }

    private static void fibo(int a, int b) {
        if (count++ == 6 - 1) return;

        int temp = a + b;

        System.out.print(temp + " ");

        fibo(b, temp);

    }


}
