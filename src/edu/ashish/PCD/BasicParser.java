package edu.ashish.PCD;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by admin on 10-Mar-16.
 */
public class BasicParser {

    public static void main(String[] args) throws IOException {
        String url = "C:\\Users\\admin\\IdeaProjects\\Practice\\src\\edu\\ashish\\PCD\\tableInputFIle.txt";

        FileInputStream fileInputStream = new FileInputStream(new File(url));
        byte[] b = new byte[fileInputStream.available()];
        fileInputStream.read(b);
        String tableSource = new String(b).replace("\t", "|");
        System.out.println(tableSource);

        String[][] table2DArray = new String[10][10];


        int index = 0;
        String pointer = tableSource.charAt(0) + "";

        do {
            pointer = tableSource.charAt(index) + "";
            index++;
            System.out.print(pointer);

        } while (!pointer.equals('\n' + ""));
    }
}
