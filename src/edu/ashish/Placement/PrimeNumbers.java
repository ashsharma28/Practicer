package edu.ashish.Placement;

import edu.ashish.DAA.Stopwatch;

/**
 * Created by admin on 09-Aug-16.
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        int source = 2147483647/* <-int range*/, i = 2;
        boolean flag = false;

        while ((source % i) != 0) {
            if (i > Math.sqrt(source)) {
                flag = true;
                break;
            }

            i++;
        }

        if (flag) {
            System.out.println(source + " is prime !!");
        } else System.out.println(source + " is not prime !!");


        System.out.println(stopwatch.elapsedTime());
    }
}
