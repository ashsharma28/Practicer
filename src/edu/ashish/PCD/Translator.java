/**
 * Created by admin on 15-Jan-16.
 */

package edu.ashish.PCD;

import java.io.File;
import java.io.FileInputStream;


public class Translator {


        public static void main(String[] args)
        {
            try{

                File file = new File("C:\\Users\\admin\\IdeaProjects\\Practice\\res\\Sample.C");
                FileInputStream fis = new FileInputStream(file);
                int size = fis.available();


                byte[] bArray = new byte[size];
                int limit = fis.read(bArray);

                String source = new String(bArray);

                String replacement = "replacement";

                /*printf("Graphics error: %s\n", grapherrormsg(errorcode));
                printf("Graphics error: " <<replacement << " \n", grapherrormsg(errorcode));
*/

                System.out.println(source + "\n==================================================");


                StringBuilder stringBuilder = new StringBuilder(source);
                int replacementStartIndex = source.indexOf(",", source.indexOf("\"", source.indexOf("\"", source.indexOf("printf"))));
                int replacementEndIndex = source.indexOf(");", source.indexOf("\"", source.indexOf("\"", source.indexOf("printf"))));

                int startIndex = source.indexOf("%s", source.indexOf("\"", source.indexOf("printf")));
                int endIndex = startIndex + 2;

                replacement = stringBuilder.substring(replacementStartIndex + 1, replacementEndIndex);
                stringBuilder.delete(replacementEndIndex, replacementEndIndex + 1).delete(replacementStartIndex, replacementEndIndex).insert(endIndex, " \" <<" + replacement + " << \" ").delete(startIndex, endIndex);

                source = new String(stringBuilder);
                source = source.replaceAll("printf", "cout<<");


                System.out.println(source);

                fis.close();
            }
            catch(Exception e)
            {
                System.err.print(e);
            }

        }

}
