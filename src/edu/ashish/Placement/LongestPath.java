package edu.ashish.Placement;

import java.io.*;

/**
 * Created by admin on 18-Aug-16.
 */
public class LongestPath {
    static BufferedReader ob1;

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        try {

            ob1 = new BufferedReader(new InputStreamReader(System.in));
            int testCases = Integer.parseInt(ob1.readLine());

            for (int i = 1; i <= testCases; i++) {
                doExecute();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void doExecute() throws IOException {
        String dimension = (ob1.readLine());

        int xmax = Integer.parseInt(String.valueOf(dimension.charAt(0)));
        int ymax = Integer.parseInt(String.valueOf(dimension.charAt(2)));


        char matrix[][] = new char[xmax][ymax];

        for (int i = 0; i <= xmax - 1; i++) {
            String line = (ob1.readLine());

            for (int j = 0; j <= ymax - 1; j++) {
                if (j == 0) {
                    matrix[i][0] = (line.charAt(j));
                } else matrix[i][j] = (line.charAt(j * 2));
            }

        }

       /* for (int x = 0; x <= xmax-1; x++) {
            System.out.println();
            for (int y = 0; y <= ymax - 1; y++) {
                System.out.print(matrix[x][y]);
            }
        }*/


        char source = ob1.readLine().charAt(0);

        System.out.println(source);


        boolean shouldIcontinue = true;

        int length = 1;

        int xi = 0, yi = 0;
        while (shouldIcontinue == true) {

            int[] coords = findSource(source, matrix, xi, yi, xmax, ymax);
            xi = coords[0];
            yi = coords[1];


            if (coords.equals("-1-1")) {
                break;
            }

            //if()


        }


    }

    private static int[] findSource(char source, char[][] matrix, int xi, int yi, int xmax, int ymax) {

        int x = 0, y = 0;
        int toReturnX = -1, toReturnY = -1;

        FIRST:
        for (x = xi; x <= xmax - 1; x++) {
            System.out.println();
            for (y = yi; y <= ymax - 1; y++) {
                if (matrix[x][y] == source) {
                    toReturnX = x;
                    toReturnY = y;
                    break FIRST;
                }

            }
        }

        int rett[] = {toReturnX, toReturnY};

        return rett;
    }
}
