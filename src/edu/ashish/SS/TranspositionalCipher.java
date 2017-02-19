package edu.ashish.SS;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by admin on 30-Jan-17.
 */
public class TranspositionalCipher {

    public static void main(String[] args) {
        new TranspositionalCipher().encrypt("My Name is Ashish", "Ashish");
    }

    public String encrypt(String message, String key) {
        String temp = getOurKey(key);

        String ourKey = temp.substring(0, temp.length() - 1);
        int m = Integer.parseInt(temp.substring(temp.length() - 1));
        int n = (message.length() / m) + 1;

        int size = (m * n);
        int x = message.length();

        if (message.length() < size) {
            for (int i = 0; i != (size - x); i++) {
                message = message.concat("$");
            }
        }


        return "";
    }

    private String getOurKey(String key) {

        TreeSet<String> treeSet = new TreeSet<>();

        for (int i = 0; i < key.length(); i++) {
            treeSet.add("" + key.charAt(i));
        }

        treeSet.size();
        Object[] array = treeSet.toArray();

        String result = "";
        for (int i = 0; i < key.length(); i++) {
            int i1 = Arrays.binarySearch(array, key.charAt(i) + "");
            result = result.concat(i1 + "");
        }

        return result + treeSet.size();
    }

}
