/**
 * Created by admin on 10/4/2015.
 */

package edu.ashish.DAA;



public class BinarySearch {

    int mid;
    int final1;

    public static void main(String[] args) {
        int A[] = new int[]{1, 1, 7, 7, 7, 7, 7, 7, 7, 55}; //!.length =18 , index of biggest = 17
        BinarySearch binarySearch = new BinarySearch();
        //int position = binarySearch.Search(A, 8  , A.length  , 0);

        int position = binarySearch.countOccurrences(A, 7);
        System.out.println("" + position);
    }

    private int Search(int[] A, int value, int hi, int lo) {


        if ((value > A[A.length - 1]) || (value < A[0])) return (mid = -1);

        if ((lo == hi + 1) || (lo == hi))

            mid = (hi + lo) / 2;

        if (A[mid] == value) ;
        else if (A[mid] > value)
            Search(A, value, mid, lo);
        else if (A[mid] < value)
            Search(A, value, hi, mid);



        return mid;
    }


    public int countOccurrences(int[] A, int value) {
        int result = -1;

        int first = getFirstIndex(A, value);
        if (first == -1) return result;

        int last = getLastIndex(A, value);

        result = (last - first) + 1;

        return result;
    }

    private int getFirstIndex(int[] A, int value) {

        int lo = 0;
        int hi = A.length - 1;
        int mid;
        int result = -1;

        while (lo <= hi) {
            mid = (lo + hi) / 2;

            if (A[mid] == value) {
                result = mid;
                hi = mid - 1;
            } else if (A[mid] > value) hi = mid - 1;
            else lo = mid + 1;
        }


        return result;
    }

    private int getLastIndex(int[] A, int value) {

        int lo = 0;
        int hi = A.length - 1;
        int mid = 0;
        int result = -1;

        while (lo <= hi) {
            mid = (lo + hi) / 2;

            if (A[mid] == value) {
                result = mid;
                lo = mid + 1;
            } else if (A[mid] > value) hi = mid - 1;
            else lo = mid + 1;
        }


        return result;
    }


}
