package edu.ashish.Placement;

/**
 * Created by admin on 30-Jul-16.
 */
public class Armstrong {

    //Some armstrong numbers to play with :
    //int[] array = {153, 370, 371, 407, 1634, 8208, 9474, 146511208, 472335975, 534494836, 912985153};

    public boolean isArmstrong(int source) {

        if (source < 0)
            source = Math.abs(source);

        int digits = 0, temp1 = source;


        //Finding number of digits in source
        while (temp1 != 0) {
            temp1 /= 10;
            digits++;
        }

        int armstrong = 0;

        int temp2 = source;
        int multiplier = 0;

        //The main task
        while (temp2 != 0) {
            multiplier = temp2 % 10;
            armstrong = (int) (armstrong + (Math.pow(multiplier, digits)));
            temp2 = temp2 / 10;
        }

        if (armstrong == source) return true;
        else {
            System.out.print("\"" + armstrong + "\" & \"" + source + "\" - ");
            return false;
        }


    }

}
