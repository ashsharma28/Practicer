/**
 * Created by admin on 10-Nov-15.
 */
public class Test {



    public static void main(String[] args) {


        int x=0b1010 ;
        int y=0b1111;

        int z= x ^ y ;

        System.out.println("" + x + "+" + y + "=" + z);

        //5+6=11

        /*
        * If you want to output in binary format, use Integer.toBinaryString()
        */

        //System.out.println(Integer.toBinaryString(x) + "+" + Integer.toBinaryString(y) + "=" + Integer.toBinaryString(z));
    }
}
