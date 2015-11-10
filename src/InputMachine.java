/**
 * Created by admin on 10-Nov-15.
 */
public class InputMachine {
    public static void main(String[] args) {
        int[] A = new int[]{7, 19, 12, 13, 14, 15, 16, 4, 2, 3, 5, 6};

        new QuickSort().quickSort(A);


        for( int t = 0; t<A.length; t++ )
            System.out.print( A[t] +",");



    }
}

