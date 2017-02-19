package edu.ashish.SS;

/**
 * Created by admin on 09-Jan-17.
 */
public class CaesarCypher {

    public static void main(String[] args) {

        CaesarCypher obj = new CaesarCypher();
        int key = 15;
        String encrypt = obj.encrypt("WTAAD", key);
        String decrypt = obj.decrypt(encrypt, key);

        System.out.println("encryptReceivers = [" + encrypt + "]");
        System.out.println("decrypt = [" + decrypt + "]");


    }

    String encrypt(String source, int key) {

        source.replaceAll(" ", "");
        String as = "";

        for (int i = 0; i < source.length(); i++) {
            int x = source.charAt(i);

            if (Character.isUpperCase(source.charAt(i))) {
                x = ((x - 65) + key) % 26 + 65;
            }
            if (Character.isLowerCase(source.charAt(i))) {
                x = ((x - 97) + key) % 26 + 97;
            }

            as = as.concat((char) x + "");
        }

        return as;
    }

    String decrypt(String source, int key) {

        source = source.replaceAll(" ", "");
        String as = "";

        for (int i = 0; i < source.length(); i++) {
            int x = source.charAt(i);

            if (Character.isUpperCase(source.charAt(i))) {
                int y = (x - 65);
                int z = y - key;
                if (z < 0) {
                    z += 26;
                }
                int p = z % 26;
                x = p + 65;
            }
            if (Character.isLowerCase(source.charAt(i))) {
                int y = (x - 97);
                int z = y - key;
                if (z < 0) {
                    z += 26;
                }
                int p = z % 26;
                x = p + 97;
            }

            as = as.concat((char) x + "");
        }

        return as;
    }

}
