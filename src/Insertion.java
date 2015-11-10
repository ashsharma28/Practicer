
public class Insertion {

    static Stopwatch stopwatch;

    public static void main(String[] args) {
        int A[] = new int[]{1,5,3,9,6,22,1,4,7,2,65,34};
        stopwatch = new Stopwatch();
        Insertion asd = new Insertion();

        asd.InsertionSortFunc(A);

        System.out.println("\n\nElapsed time is: " + stopwatch.elapsedTime());

    }

    private void InsertionSortFunc(int[] A) {

        int i, j;

        for(i=0 ; i<A.length ; i++)
        {
            for (j=i ; j>0 ; j--)
            {
                if(A[j-1]<A[j]) {
                    SelectionSort.swap(A, j-1 , j);
                }
                else break;
            }
        }




        for( int t = 0; t<A.length; t++ )
            System.out.print( A[t] +",");
    }
}
