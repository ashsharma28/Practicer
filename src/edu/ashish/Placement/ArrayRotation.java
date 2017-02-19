package edu.ashish.Placement;

/**
 * Created by admin on 15-Aug-16.
 */
public class ArrayRotation {


    public static int timesRotated = 0;
    private static boolean isNotDone = true;

    public static void main(String[] args) {
        int A[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        findTimesRotated(A, 0, A.length - 1);

        if (timesRotated == 0) System.out.println(0);
        else System.out.println(timesRotated + 1);
    }

    private static void findTimesRotated(int[] A, int lo, int hi) {


        if (isNotDone == false) return;

        if (A[lo] > A[hi]) {
            int mid = (lo + hi) / 2;
            findTimesRotated(A, lo, mid);
            findTimesRotated(A, mid, hi);
        } else {
            if (lo == hi) {
                timesRotated = lo;
                isNotDone = false;
            }
        }

    }
}
