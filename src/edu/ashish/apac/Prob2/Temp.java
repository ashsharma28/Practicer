package edu.ashish.apac.Prob2;

/**
 * Created by admin on 10-Apr-16.
 */
public class Temp {


    boolean doneKyaM(char[] stack) {

        boolean doneKya = false;

        for (int q = 0; q < stack.length; q++) {

            if (stack[q] == '-') {
                doneKya = false;
                break;
            } else doneKya = true;
        }


        return doneKya;
    }
}
