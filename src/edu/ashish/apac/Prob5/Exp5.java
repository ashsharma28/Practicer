package edu.ashish.apac.Prob5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by admin on 16-Apr-16.
 */
public class Exp5 {


    public static void main(String[] args) throws IOException {
        String url = "C:\\Users\\admin\\IdeaProjects\\Practice\\src\\edu\\ashish\\apac\\Prob5\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(new File(url));
        byte[] b = new byte[fileInputStream.available()];
        fileInputStream.read(b);

        String input = new String(b);
        StringTokenizer tokenizer = new StringTokenizer(input, "\r\n");

        int limit = Integer.parseInt(tokenizer.nextToken());


        for (int index = 1; index <= limit; index++) {

            int numberOfParties = Integer.parseInt(tokenizer.nextToken());
            StringTokenizer membersInfo = new StringTokenizer(tokenizer.nextToken(), " ");

            HashMap<Character, ArrayList<Character>> lokSabhha = new HashMap<Character, ArrayList<Character>>();
            int totalCount = 0;

            for (int partyNumber = 1; partyNumber <= numberOfParties; partyNumber++) {

                ArrayList<Character> members = new ArrayList<Character>();
                char partyName = (char) (partyNumber + 64);
                int memberCount = Integer.parseInt(membersInfo.nextToken());


                for (int memberIndex = 1; memberIndex <= memberCount; memberIndex++) {
                    members.add(partyName);
                    totalCount++;
                }

                lokSabhha.put(partyName, members);
            }
            System.out.println(lokSabhha);
        }


    }
}
