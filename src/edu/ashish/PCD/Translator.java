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

                File file = new File("C:\\Users\\admin\\IdeaProjects\\Practice\\src\\edu\\ashish\\PCD\\Sample.C");
                FileInputStream fis = new FileInputStream(file);
                int size = fis.available();


                byte[] bArray = new byte[size];
                int limit = fis.read(bArray);

                String source = new String(bArray);


                source = source.replaceAll( "printf" , "cout<<");

                System.out.println(source);

                fis.close();
            }
            catch(Exception e)
            {
                System.err.print(e);
            }

        }

}
