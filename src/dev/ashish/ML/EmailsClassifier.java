package dev.ashish.ML;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by admin on 25-Dec-16.
 */
public class EmailsClassifier {


    public static void main(String[] args) throws IOException {


        new EmailsClassifier().parseXML();
/*

        BufferedInputStream br = new BufferedInputStream(new FileInputStream("F:\\Dev\\ML\\emails.csv"));
        byte[] bytes = new byte[ (int) (br.available()*.0001)];
        br.read(bytes );
        String paragraph = new String(bytes);
        System.out.println(paragraph);


        InputStream is = new FileInputStream("C:\\Users\\admin\\IdeaProjects\\Practice\\src\\dev\\ashish\\NLP\\en-sent.bin");
        SentenceModel model = new SentenceModel(is);
        SentenceDetectorME sdetector = new SentenceDetectorME(model);

        String sentences[] = sdetector.sentDetect(paragraph);

        for (String sentence : sentences) {
            System.out.println(sentence);
        }
*/

    }


    void parseXML() {

        String[] theText1, imageURLArray123;
        try {

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            XmlPullParser parser = factory.newPullParser();

            parser.setInput(new InputStreamReader(new FileInputStream(new File("C:\\Users\\admin\\IdeaProjects\\Practice\\src\\dev\\ashish\\ML\\bc3corpus.1.0\\corpus.xml"))));

            int eventType = 0;
            int postCount = 0;

            LinkedHashMap hm = new LinkedHashMap();
            String key = null, value = null;

            theText1 = new String[10];
            imageURLArray123 = new String[10];
            FileOutputStream fileOutputStream = new FileOutputStream(new File("C://Users//admin//Desktop//Expanses.txt"));

            String thisValue = null;
            int a;

            int x = 1;


            HashMap<String, List<String>> corpus = new HashMap<>();


            HashMap<String, Integer> nan = new HashMap();
            while (eventType != XmlPullParser.END_DOCUMENT) {

                if (eventType == XmlPullParser.START_TAG) {

                    if (parser.getName().equals("From")) {
                        eventType = parser.next();

                        if (nan.containsKey(parser.getText())) {
                            nan.put(parser.getText(), nan.get(parser.getText()) + 1);
                        } else
                            nan.put(parser.getText(), 1);
                    }

                    //System.out.println(parser.getName());

                    key = parser.getName();
                    value = parser.getPositionDescription();

                }

                eventType = parser.next();

            }

            Collection<Integer> values = nan.values();
            System.out.println(nan.toString().replace(", ", "\n"));
            System.out.println(nan.size());


        } catch (XmlPullParserException e) {

            System.out.println("ERROR IN XMLPullParser " + e);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }


    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {

        return "Ass";
    }
}
