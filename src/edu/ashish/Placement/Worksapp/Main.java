import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Ashish Sharma on 18-Aug-16.
 * Solution for second question - MaxXOR problem
 */


public class Main {


    public static void main(String[] args) {


        try {

            BufferedReader ob1 = new BufferedReader(new InputStreamReader(System.in)); // Assigning System.in to the InputStream
            int arraySize = Integer.parseInt(ob1.readLine()); //reading first parameter (Value of N)

            String totalNumbers = "";

            totalNumbers = ob1.readLine();//reading the array line


            /*
            * Iteratively read alternate characters from the 'totalNumbers' String (input above) to the long array.
            */

            ArrayList<Long> arrayList = new ArrayList<>(arraySize); // Initialize a ArrayList of initial size = arraySize
            for (int i = 0; i < arraySize; i++) {
                arrayList.add(Long.parseLong((totalNumbers.charAt(i * 2)) + ""));
            }


            long answer = new Main().getMaxXOR(arrayList);
            System.out.println(answer);


        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Error: Please enter a correct number of elements previously mentioned");
        } catch (IOException e) {
            System.err.println("Error: Internal error. Please Try again. If problem persist please report to IT Dept.");
        } catch (NumberFormatException e) {
            System.err.println("Error: Please enter a correct numeric value for the array");
        }

    }


    /**
     * Calculates the Max XOR value of a prefix array and a suffix array,
     * by which we can get the maximum xor value with all elements in them.
     *
     * @param array the user given array of numbers
     */
    private long getMaxXOR(ArrayList<Long> array) {

        long max = 0L, xor = 0L;   // for going left to right
        long maxR = 0L, xorR = 0L; // for going right to left


        //Use Dynamic Programming to save the values already calculated. Saves processing and memory.
        for (int i = 0; i < array.size(); i++) {

            //Traverse the array from left to right, and dynamically save the successive XOR values
            xor = xor ^ array.get(i);//(Dynamic Programming)

            // If a XOR value is found greater that the max value found till now, Update the max value
            if (xor > max) {
                max = xor;
            }


            //Traverse the array from right to left, and dynamically save the successive XOR values
            xorR = xorR ^ array.get(array.size() - i - 1);

            // If a XOR value is found greater that the max value found till now, Update the max value
            if (xorR > maxR) {
                maxR = xorR;
            }
        }

        //If suffix fetched a max value, then return maxR else return max

        return (maxR > max ? maxR : max);

    }
}
