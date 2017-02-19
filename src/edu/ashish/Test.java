package edu.ashish;


public class Test {


    public static void main(String[] args) {

        long A[] = new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9};


        try {
            int x = 12345678, a = 0;

            while (x != 12345678 + 190) {
                //A[x] = Long.parseLong(Long.toBinaryString(a));

//                a = a ^ x ;
                //System.out.println(x + " = "+ a);
                System.out.println(x + " = " + Integer.toBinaryString(x));
                System.out.println();

                x++;
            }

        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a);
        }

    }

    private static void swap(Sampler a, Sampler b) {

        Sampler temp;


        temp = a;
        a = b;
        b = temp;


        System.out.println(a.getName());
        System.out.println(b.getName());
    }


}


class Sampler {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}