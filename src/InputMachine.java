/**
 * Created by admin on 10-Nov-15.
 */
public class InputMachine {

    public static void main(String[] args)
    {
        QuickSortCaller();
    }

    public static void QuickSortCaller(){
        float[] A;
        int n = 8900; //StressTest_Uppercut yet = 8933 using integers
        A = new float[n];

        for(int a = 0 ; a<A.length ; a++)
        {
            A[a] = n- a + 0.1234567f;
            System.out.print(A[a] + ", ");
        }


        QuickSort.quickSort(A);

        Stopwatch stopwatch= new Stopwatch();

        QuickSort.quickSort(A);

        for( int t = 0; t<A.length; t++ )
            System.out.print( A[t] +",");

        System.out.println("\n\nElapsed time is: " + stopwatch.elapsedTime());

    }


    public static void SelectionSortCaller(){

        int[] A;
        int n = 100000; //StressTest_Uppercut yet = 100000 using integers
        A = new int[n];

        for(int a = 0 ; a<A.length ; a++)
        {
            A[a] = n- a;
            System.out.print(A[a] + ", ");
        }


        Stopwatch stopwatch= new Stopwatch();

        SelectionSort.selectionSortFunc(A);


        System.out.println("\n\nElapsed time is: " + stopwatch.elapsedTime());

        for( int t = 0; t<A.length; t++ )
            System.out.print( A[t] +",");

    }


}

