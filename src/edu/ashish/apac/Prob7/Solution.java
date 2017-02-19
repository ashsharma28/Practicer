package edu.ashish.apac.Prob7;

import edu.ashish.DAA.Stopwatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by admin on 06-Nov-16.
 */
public class Solution {


    public static void main(String[] args) {

        int[] sampleInput = new int[(int) Math.pow(10, 5)];

        for (int i = 0; i < sampleInput.length; i++) {
            sampleInput[i] = (int) (Math.random());
        }

        Stopwatch stopwatch = new Stopwatch();

        System.out.println(maxelement(sampleInput));


        System.out.println("\n\nElapsed time is: " + stopwatch.elapsedTime());

    }


    static int maxelement(int[] arr) {


        HashSet<Integer> input = new HashSet<>();
        ArrayList<Integer> inputAL = new ArrayList();

        for (int i : arr) {
            input.add(i);
            inputAL.add(i);
        }

        Collections.sort(inputAL);

        System.out.println(inputAL);


        HashSet<Integer> resultHashSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < arr.length; j++) {

                if (i == j) break;


                int sum = arr[i] + arr[j];

                if (input.contains(sum)) {
                    resultHashSet.add(sum);
                }


            }
        }


        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : resultHashSet) {
            arrayList.add(i);
        }


        Collections.sort(arrayList);

        int maxIndex = arrayList.size() - 1;

        try {
            return arrayList.get(maxIndex);
        } catch (Exception e) {
            return -1;
        }


    }
}
