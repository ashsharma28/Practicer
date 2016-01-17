package edu.ashish.DAA;

class MergeSort
{
    public static void main(String args[])
    {
        int A[] = new int[]{ -11,-10,-9,10,10,9,9,8,7,-6,5,4,-3,-2,-10,-9,-10,-10,-9,9,-8,7,6,5,4,3,-2,-10,9,10,10,9,9,8,7,6,5,4,3,2,110,9,10,10,9,9,8,7,6,5,4,3,2,1};

        MergeSort asd = new MergeSort();
        asd.MergeSortFunc(A);
    }

    int i;

    public void MergeSortFunc(int[] A)
    {

        int left[] ;
        int right[];
        //	for( int i = 0; i<A.length; i++ )
        //	System.out.print(A[i] +"--");

             if(A.length <= 1)	return;


            int mid;

            if(A.length%2 == 0) {//if A's length is even
                mid = A.length / 2;
                left = new int[mid];
                right = new int[mid];
            }

            else {//if A's length is odd
                mid = (A.length + 1 )/ 2;
                left = new int[mid];
                right = new int[mid-1];
            }

            i=0;
            while(i<mid)
            {
                left[i] = A[i];
                i++;
            }

            i = 0;

            while(mid<A.length)
            {
                right[i] = A[mid++];
                i++;
            }


            System.out.println("");

            for( int t = 0; t<left.length; t++ )
                System.out.print("L" +left[t] +"--");

            System.out.println("");

            for( int t = 0; t<right.length; t++ )
                System.out.print("R" + right[t] +"--");

            System.out.println("");


            MergeSortFunc(left);
            MergeSortFunc(right);

            A = Merge(A, left, right);


            for( int t = 0; t<A.length; t++ )
            System.out.print(A[t] +",");


    }

    private int[] Merge(int[] A, int[] left, int[] right) {
        int i = 0 ,j=0 , k=0;

        while(i<left.length && j<right.length)
        {
            if( left[i] < right[j]){
                A[k] = left[i];
                i++;
            }

            else{
                A[k] = right[j];
                j++;
            }

            k++;
            System.out.println("M struck at: 1");
        }

        if( i==left.length )
        {
            while(k < A.length)
            {
                A[k] = right[j++];
                k++;
                System.out.println("M struck at: 2");
            }


        }

        else
        if( j==right.length ){
            while(k<A.length)
            {
                A[k] = left[i++];
                System.out.println("M struck at: 3");
                k++;
            }
        }


    return A;

    }



}