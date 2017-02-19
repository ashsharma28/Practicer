package edu.ashish.SS;

/**
 * Created by admin on 13-Feb-17.
 */
public class DigitalCertificate {

    public static void main(String[] args) {
        double publicKey = 7;
        double privateKey = 7;

        double encrypted = RSA.encryptReceivers(2, publicKey);
        double v = RSA.encryptSender(encrypted, privateKey);

        System.out.println(v);
    }
}
