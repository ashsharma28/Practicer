package edu.ashish.Placement;

/**
 * Created by admin on 28-Jul-16.
 */
public class Palindrome {
    public boolean isPalindrome(int source) {

        if (source < 0)
            source = Math.abs(source);

        int dividend = source;
        int power = 0;

        while (dividend != 0) {
            dividend = dividend / 10;
            power++;
        }

        int multiplier = (int) Math.pow(10, power - 1);

        int temp = source;
        int target = 0;

        while (temp > 0) {
            int x = temp % 10;
            target = target + x * multiplier;
            temp = temp / 10;
            multiplier = multiplier / 10;
        }


        if (target == source) return true;
        else return false;
    }
}
