package edu.ashish.SC;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by admin on 12-Jan-17.
 */
public class GA {


    static int numberOfChromosomes = 0;

    public static void main(String[] args) {

        int[][] x = giveMatrix();
        numberOfChromosomes = x.length;


        ArrayList<String> chromosomes = new ArrayList<>();
        for (int[] ints : x) {
            String x1 = "";
            for (int anInt : ints) {
                x1 = x1.concat(anInt + "");
            }
            chromosomes.add(x1);
        }
        System.out.println("chromosomes = " + chromosomes);


        ArrayList<String> mutatedMatingPool = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {

            System.out.println(i);

            if (i == 0) {
                mutatedMatingPool = doGA(chromosomes);
            } else {
                mutatedMatingPool = doGA(mutatedMatingPool);
            }

        }


        ////////////////////////////QUESTION 10/////////

        /////////Two pint crossover.//////////
       /* ArrayList<String> twoPC = new ArrayList<>();
        for (int i = 0; i < matingPool.size(); i+=2) {
            String s1 = matingPool.get(i);
            String s2 = matingPool.get((i+1)%matingPool.size());



            String substring1 = s1.substring(3, 6);
            String substring2 = s2.substring(3, 6);

            String firstChromosome = s1.substring(0, 3) + substring2 + s1.substring(6);
            String secondChromosome = s2.substring(0, 3) + substring1 + s2.substring(6);

            twoPC.add(firstChromosome);
            twoPC.add(secondChromosome);
        }

        for (String s : twoPC) {
            System.out.print(s + ", ");
        }


        /////////Two pint crossover.//////////
        ArrayList<String> uniformCross = new ArrayList<>();
        for (int i = 0; i < matingPool.size(); i+=2) {
            String s1 = matingPool.get(i);
            String s2 = matingPool.get((i +1) % matingPool.size());

            String firstChromosome = s1.substring(0, 2) + s2.charAt(2) +s1.substring(3, 5) + s2.charAt(5)
                    +s1.substring(6, 7) + s2.charAt(7) ;

            String secondChromosome = s2.substring(0, 2) + s1.charAt(2) +s2.substring(3, 5) + s1.charAt(5)
                    +s2.substring(6, 7) + s1.charAt(7) ;

            uniformCross.add(firstChromosome);
            uniformCross.add(secondChromosome);
        }

        System.out.println();
        for (String s : uniformCross) {
            System.out.print(s + ", ");
        }*/
        ////////////////////////////
        ////////APPLYING GA/////////
        ////////////////////////////


        System.out.println("\n============= GA ================");


    }

    private static ArrayList<String> doGA(ArrayList<String> chromosomes) {


        ArrayList<Double> decimals = new ArrayList<>();
        double res = 0;
        for (String chromosome : chromosomes) {
            double i1 = Integer.parseInt(chromosome.substring(0, 3), 2);
            double i2 = Integer.parseInt(chromosome.substring(3), 2);

            res = i1 + (i2 / 100);
            decimals.add(res);
        }
        System.out.println("decimals = " + decimals);
        //////////////////////////////
        //Calculating Fitness

        ArrayList<Double> fitness = new ArrayList<>();
        for (int i = 0; i < decimals.size(); i++) {
            double a = (decimals.get(i));
            double function = 10 * a * a - 5 * a + 8;
            double fitnessVal = 1 / function;
            fitness.add(fitnessVal);
        }

        System.out.println("fitness = " + fitness);


        double sum = 0;
        for (Double decimal : fitness) {
            sum += decimal;
        }
        //System.out.println("sum = " + sum);

        //CALCULATE AVERAGE
        double average = sum / fitness.size();

        //CALCULATing Rank
        ArrayList<Double> rank = new ArrayList<>(10);
        for (int i = 0; i < decimals.size(); i++) {
            double v = (double) fitness.get(i) / average;
            rank.add(v);
        }
        System.out.println("rank = " + rank);


        ArrayList<Integer> rounded = new ArrayList<>();
        for (Double fitnes : rank) {
            rounded.add((int) Math.round(fitnes));
        }

        int tempsum = 0;
        for (int i = 0; i < rounded.size(); i++) {
            tempsum += rounded.get(i);
        }
        //System.out.println("tempsum = " + tempsum);
        //callForPerfection(rounded , rank);
        System.out.println("rounded = " + rounded);

        ////////////////////////////////////
        ////////////////////////////////////
        ////////////////////////////////////
        ArrayList<String> matingPool = new ArrayList<>();
        for (int i = 0; i < rounded.size(); i++) {
            Integer timesToAdd = rounded.get(i);
            for (int j = 0; j < timesToAdd; j++) {
                matingPool.add(chromosomes.get(i));
            }
        }

        System.out.println("matingPool = " + matingPool);

        //////////////////////////////

        int pointOfCut = (int) (Math.random() * 10) % 8;
        int target = (int) (Math.random() * 10) % matingPool.size();
        int mp1 = (int) ((Math.random() * 10) % 6) + 1;
        //CROSSOVER
        ArrayList<String> crossoveredMatingPool = new ArrayList<>();
        for (int i = 0; i < matingPool.size(); i++) {
            String s1 = matingPool.get(i);
            String s2 = matingPool.get((i + 1) % matingPool.size());

            String pre1 = s1.substring(0, pointOfCut);
            String post2 = s2.substring(pointOfCut, s2.length());

            String finalString = pre1 + post2;


            if (i == target) {
                //Flip bit Mutation
                char c = finalString.charAt(mp1);
                if (c == '1') {
                    finalString = finalString.substring(0, mp1) + "0" + finalString.substring(mp1 + 1, finalString.length());
                } else
                    finalString = finalString.substring(0, mp1) + "1" + finalString.substring(mp1 + 1, finalString.length());
            }
            crossoveredMatingPool.add(finalString);
        }

        System.out.println("crossoveredMatingPool = " + crossoveredMatingPool);


        //////////////////////////////

        //MUTATION
/*

        int mutationPoint1  = (int) (Math.random() * 10) % 8;
        int mutationPoint2 = (int) (Math.random() * 10) % 8;
        int target = ( (int) (Math.random() * 10)) % 8;

        while ( mutationPoint1 >= mutationPoint2){
            mutationPoint2 = (int) (Math.random() * 10) % 8;
        }

        ArrayList<String> mutatedMatingPool = new ArrayList<>();




        for (int i = 0; i < crossoveredMatingPool.size(); i++) {

            String s = crossoveredMatingPool.get(i);
            String finalString = s;

            if(i == target) {

                char one = s.charAt(mutationPoint1);
                char two = s.charAt(mutationPoint2);

                finalString =
                        s.substring(0, mutationPoint1)
                                + two +
                        s.substring(mutationPoint1 + 1, mutationPoint2)
                        + one +
                        s.substring(mutationPoint2 + 1);

            }

            mutatedMatingPool.add(finalString);

        }

        System.out.println("mutatedMatingPool = " + mutatedMatingPool);
*/


        Object[] ranks = rank.toArray();
        Arrays.sort(ranks);

        String s = "";

        for (int i = 0; i < rank.size(); i++) {
            Double aDouble = rank.get(i);

            Object rank1 = ranks[ranks.length - 1];
            if (aDouble == rank1) {
                s = chromosomes.get(i);
                break;
            }
        }

        System.out.println("Fittest is = " + s);

        return crossoveredMatingPool;
    }


    private static int[][] giveMatrix() {
        int[][] chromosomes = new int[10][8];

        //System.out.print("[ ");

        for (int i = 0; i < chromosomes.length; i++) {
            int[] ints = chromosomes[i];

            for (int i1 = 0; i1 < ints.length; i1++) {
                int anInt = ints[i1];

                anInt = (int) Math.round(Math.random());
                chromosomes[i][i1] = anInt;
                //  System.out.print(anInt);
            }
            //System.out.print(", ");
        }

        //System.out.print("]\n");
        return chromosomes;

    }
}

