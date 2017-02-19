package edu.ashish.SS;


/**
 * Created by Ashish Sharma on 04-Feb-17.
 */
public class RSA {

    public static double encryptReceivers(double Message, double e) {
        //keep e=7
        double p = 11;
        double q = 17;


        double n = p * q;
        double phi = (p - 1) * (q - 1);


        double d = 0;
        for (double d1 = 0; d1 < phi; d1++) {

            if ((e * d1) % phi == 1) {
                d = d1;
                break;
            }
        }

        ///////////ENCRYPT///////////
        double cipherText = (Math.pow(Message, e)) % n;
        ///////////DECRYPT///////////

        double messageBack = (Math.pow(cipherText, d)) % n;
        System.out.println(messageBack);


        return cipherText;


    }

    public static void main(String[] args) {
        RSA.encryptReceivers(2, 5);
    }

    public static double encryptSender(double Message, double e) {
        //keep e=7
        double p = 11;
        double q = 17;


        double n = p * q;
        double phi = (p - 1) * (q - 1);


        double d = 0;

        for (double d1 = 0; d1 < phi; d1++) {

            if ((e * d1) % phi == 1) {
                d = d1;
                break;
            }
        }


        ///////////ENCRYPT///////////
        double cipherText = (Math.pow(Message, e)) % n;


        ///////////DECRYPT///////////
        /*
        double messageBack = (Math.pow(ciphetText,d)) % n ;
        System.out.println(messageBack);
        */

        return cipherText;


    }
}
