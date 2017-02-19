package edu.ashish.AITRial.TicTacToe.ComputerPlayer;

import java.util.ArrayList;

/**
 * Created by admin on 15-Nov-16.
 */
public class ComputerPlayer {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(7);

        int utilityValue = new ComputerPlayer().getUtilityValue(arrayList);

        System.out.println(utilityValue);


    }

    /**
     * @param preStatus
     * @return which state to follow next
     */
    String whatNext(ArrayList<Integer> preStatus) {
        int maxValue = -9999;

        ArrayList<Integer> children = getChildren(preStatus);

        int futiilityValue;
        for (Integer child : children) {
            futiilityValue = maximize(child, preStatus);

            if (futiilityValue > maxValue) {
                maxValue = futiilityValue;
            }
        }


        return null;
    }

    private int maximize(Integer targetChild, ArrayList<Integer> status) {

        ArrayList<Integer> tempStatus = status;
        tempStatus.add(targetChild);

        int utilityValue = getUtilityValue(status);

        boolean isTerminal;
        if (utilityValue == 10 || utilityValue == -10 || utilityValue == 0) isTerminal = true;
        else isTerminal = false;

        if (isTerminal) return utilityValue;

      /*  ArrayList<Integer> children = getChildren(preStatus);

        int futiilityValue;
        for (Integer child : children) {
            futiilityValue = maximize(child, preStatus);

            if (futiilityValue > maxValue) {
                maxValue = futiilityValue;
            }
        }*/


        return 0;
    }

    private ArrayList<Integer> getChildren(ArrayList<Integer> status) {

        ArrayList<Integer> toReturn = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (status.contains(i)) continue;
            toReturn.add(i);
        }

        return toReturn;
    }

    /**
     * @param status is the complete series of positions on the board (in order) that has been marked + the last member
     *               is the target position where we are checking if the game ends or not.
     * @return
     */
    int getUtilityValue(ArrayList<Integer> status) {

        ArrayList<Integer> atX = new ArrayList<>();
        ArrayList<Integer> atY = new ArrayList<>();
        for (int i = 0, statusSize = status.size(); i < statusSize; i++) {
            Integer state = status.get(i);

            if (i % 2 == 0) atX.add(state);
            else atY.add(state);
        }


        int toReturn = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("123");
        arrayList.add("456");
        arrayList.add("789");
        arrayList.add("147");
        arrayList.add("258");
        arrayList.add("369");
        arrayList.add("159");
        arrayList.add("357");

        //should be X or O
        //ASSUMING GAME ALWAYS STARTS WITH "X"
        String text = (((status.size() - 1) % 2 == 0) ? "X" : "O");


        int XFinal = 0;
        int OFinal = 0;
        for (String x : arrayList) {
            if (x.contains(status.get(status.size() - 1) + "")) {//checking if the last element of status(target) is in one of the members of arraylist members?

                int Xcount = 0;
                int Ocount = 0;
                for (char y : x.toCharArray()) {

                    if (atX.contains(Integer.parseInt(y + ""))) {
                        XFinal = Math.max(Xcount++, XFinal);
                    } else if (atY.contains(Integer.parseInt(y + ""))) {
                        XFinal = Math.max(Ocount++, XFinal);
                    }

                }


                if (text.equals("X")) {
                    toReturn = XFinal;
                    break;
                } else {
                    toReturn = -XFinal;
                    break;
                }
            }

        }


        // CHECKING FOR A DRAW

        boolean array[] = new boolean[]{false, false, false, false, false, false, false, false, false, false};//10 elements, so NO NEED OT SHIFT THE INDICES
        if (toReturn != -10 && toReturn != 10)

        {


            for (int i = 0, statusSize = status.size(); i < statusSize; i++) {
                int state = status.get(i);
                array[state] = true;
            }

            boolean result = true;
            for (int i = 1; i < array.length; i++) {
                boolean x = array[i];
                result = x & result;
            }

            if (result == true) {
                toReturn = 0;
            }

        }

        return toReturn;
    }
}
