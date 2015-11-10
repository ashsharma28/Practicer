/**
 * Created by admin on 10/5/2015.
 */


public class SelectionSort {
    public static void main(String[] args) {
        int A[] = new int[]{ -1, 1,3,5,7,9,-2, 3,5,7,9,0,0,0,0,8,6,4,2};

        SelectionSort asd = new SelectionSort();
        asd.SelectionSortFunc(A);
       }





    private int[] SelectionSortFunc(int[] A) {
        int i;
        int p;

        for(i=0 ; i<A.length ; i++) {

            int min= i;

            for (p = i + 1; p < A.length; p++) {
                if (A[p] < A[min]) min = p;
            }
             A = swap(A, i, min);
        }


        for( int t = 0; t<A.length; t++ )
            System.out.print( A[t] +",");
        return A;
    }

    public static int[] swap(int[] A , int i, int min) {
        int temp=0;

        if(A[i] != A[min])
        {
            temp = A[i];
            A[i] = A[min];
            A[min] = temp;
            System.out.println("Swapped " + i + "-" + min);
        }




        return A;

    }



}
