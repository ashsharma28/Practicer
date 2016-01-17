package edu.ashish.DAA;

/**
 * Created by admin on 10/7/2015.
 *//*

public class edu.ashish.DAA.HeapSort {
    public static void main(String[] args) {
        int A[] = new int[]{8,7,6,5,4,3,2,1};
        edu.ashish.DAA.Stopwatch stopwatch = new edu.ashish.DAA.Stopwatch();
        edu.ashish.DAA.HeapSort heapSort = new edu.ashish.DAA.HeapSort();

        A = heapSort.sort(A);

        for (int t = 0; t < A.length; t++)
            System.out.print(A[t] + ",");

       System.out.println("\n\nElapsed time is: " + stopwatch.elapsedTime());
    }

    private int[] sort(int[] A)
    {
        int k= 0;
        int length = A.length;
        


        if(length %2 ==0)
        {
            k = (length-1)/2; //EVEN
            System.out.println(k);

            while (length>0) {
                for (int t = k; t > -1; t--)
                    A = MaxHeapify(A, t, length);

                edu.ashish.DAA.SelectionSort.swap(A, 0, length - 1);
                length--;
            }
            

        }
        else
        {
            k = (length -2) / 2 ; //ODD

        }

        return A;
    }


    private int[] MaxHeapify(int[] A, int index, int length)
    {
        int maxIndex = 0;

        try
        {
            if (((2 * index) + 2 < length))
            {
                if (A[(2 * index) + 2] <= A[2 * index + 1]) maxIndex = 2 * index + 1;
                else maxIndex = (2 * index) + 2;

                if (A[maxIndex] > A[index])
                {
                    A = edu.ashish.DAA.SelectionSort.swap(A, index, maxIndex);

                    if ( ( (2 * index) + 2 > length)  );
                    else MaxHeapify(A ,maxIndex, length);


                }
                return A;
            }
            else
            {
                if (A[index] < A[2 * index + 1])
                {
                    A = edu.ashish.DAA.SelectionSort.swap(A, index, 2 * index + 1);

                    if ( ( (2 * index) + 1 > length)  );
                    else MaxHeapify(A , 2 * index + 1, length);

                }

                return A;
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Overflow " + e);
            return A;
        }
    }
}







*/


public class HeapSort {

    public static void main(String[] args) {
        int A[] = new int[]{9,8,7,6,5,4,3,2,1};
        Stopwatch stopwatch = new Stopwatch();
        HeapSort heapSort = new HeapSort();

        A = heapSort.sort(A);

        for (int t = 0; t < A.length; t++)
            System.out.print(A[t] + ",");


    }



    private int[] maxHeapify(int[] A , int root , int length) {

        int left =  2*root ;
        int right =  2*root+1;


        int maxIndex ;


        if(left <= length && A[root] < A[left]) maxIndex= left ;
        else maxIndex = root ;

        if( right <= length && A[maxIndex] < A [right]  )
            maxIndex= right;




        SelectionSort.swap(A, root, maxIndex);


        System.out.println("I reach");

        if(maxIndex< length)        maxHeapify(A, maxIndex , length);


        return A;
    }

    private int[] buildMaxHeap(int[] A, int length)
    {
            for(int i =(length-1)/2 ; i > 0 ; i-- )
                A = maxHeapify(A,i , length);

        return A;
    }

    private int[] sort(int[] A)
    {
        int length = A.length;

        A = buildMaxHeap(A, length);

        for(int i = length  ; i > 1 ; i-- )
        {
            A = SelectionSort.swap(A,0,length);
            length--;
            A = maxHeapify(A, 0, length);
        }


        return A;
    }






    }





















