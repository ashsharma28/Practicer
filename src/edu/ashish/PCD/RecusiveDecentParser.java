package edu.ashish.PCD;

/**
 * Created by admin on 17-Mar-16.
 */
public class RecusiveDecentParser {

    /*
    for this grammar:

    E : iE'
    E': +iE
    E : epsilon



     */
    private char input[] = {'i', '+', 'i', '$'};

    private int i = 0;
    char l = input[i];

    public static void main(String[] args) {

        RecusiveDecentParser rec = new RecusiveDecentParser();
        rec.doWork();

    }

    void doWork() {

        E();


        if (l == '$') {
            System.out.println("PARSING DONE");
        }

    }

    private void E() {
        if (l == 'i') {
            match('i');
            EE();
        }
    }

    private void EE() {
        if (l == '+') {
            match('+');
            match('i');
            EE();
        } else return;
    }

    private void match(char t) {
        if (t == l) {
            i++;
            l = input[i];
        } else System.out.println("Error");

    }
}
