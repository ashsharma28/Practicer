
/**
 * Created by admin on 10/6/2015.
 */
public class QuickSort
{

    public static void main(String[] args) {

        final int A[] = new int[]{ 7,19,12,13,14,15,16,4,2,3,5,6 } ;

        Stopwatch stopwatch = new Stopwatch();

        new QuickSort().sort(A ,A.length - 1  , 0);

        for( int t = 0; t<A.length; t++ )
            System.out.print( A[t] +",");

        System.out.println("\n\nElapsed time is: " + stopwatch.elapsedTime());

    }

    private void sort(int[] A ,int hi , int low) {
        if(hi<=low)
        return;

        int j = doPartition( A , hi , low );
        sort(A, j-1 , low);
        sort(A, hi, j+1);
    }

    private int doPartition(int[] A, int hi , int low) {

        int i = low, j = hi+1;

        while (true)
        {
            while (A[++i] <= A[low] )
                if(i == hi) break;

            while (A[low] <= A[--j] )
                if(j == low) break;

            if(i>=j)break;

            SelectionSort.swap(A, i, j);
        }

        SelectionSort.swap(A, j, low);
        return j;
    }



}
