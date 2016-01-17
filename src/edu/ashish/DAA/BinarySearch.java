/**
 * Created by admin on 10/4/2015.
 */

package edu.ashish.DAA;



public class BinarySearch {

    public static void main(String[] args) {
        int A[] = new int[]{-11,-10,-9,-8,-6,-3,-2,-2,1,2,3,4,5,6,7,9,10,110};
        BinarySearch binarySearch = new BinarySearch();
        int position = binarySearch.Search(A, 1, A.length , 0);
        System.out.println("" + position);


    }

    int mid;
    int final1;
    private int Search(int[] A, int value, int hi, int lo) {



        mid = (hi + lo )/2;



        if( A[mid] == value )
            final1 = mid;
        else if (A[mid]> value)
            Search(A, value, mid,lo);
        else if (A[mid]< value)
            Search(A, value, hi , mid);


        return mid;
    }
}
