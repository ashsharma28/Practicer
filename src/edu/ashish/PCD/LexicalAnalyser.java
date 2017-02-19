package edu.ashish.PCD;


import java.io.File;
import java.io.FileInputStream;
import java.util.*;

/**
 * Created by admin on 28-Jan-16.
 */
public class LexicalAnalyser {


    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\admin\\IdeaProjects\\Practice\\src\\edu\\ashish\\PCD\\sample2.txt"));
        byte[] bytes = new byte[fileInputStream.available()];

        fileInputStream.read(bytes);
        String source = new String(bytes);

        List<String> libraryFunctions = new ArrayList<>();
        libraryFunctions.add("printf");
        libraryFunctions.add("scanf");
        libraryFunctions.add("main");


        List<String> datatypes = new ArrayList<>();
        datatypes.add("void");
        datatypes.add("byte");
        datatypes.add("short");
        datatypes.add("int");
        datatypes.add("long");
        datatypes.add("float");
        datatypes.add("double");
        datatypes.add("boolean");
        datatypes.add("char");

        List<String> headerFiles = new ArrayList<>();
        headerFiles.add("stdio.h");
        headerFiles.add("iostream.h");
        headerFiles.add("conio.h");
        headerFiles.add("string.h");
        headerFiles.add("math.h");


        List<String> keywords = new ArrayList<>();
        keywords.add("for");
        keywords.add("return");
        keywords.add("break");
        keywords.add("case");
        keywords.add("if");
        keywords.add("sizeof");
        keywords.add("continue");
        keywords.add("default");
        keywords.add("do");
        keywords.add("while");
        keywords.add("else");
        keywords.add("enum");
        keywords.add("extern");
        keywords.add("goto");
        keywords.add("auto");
        keywords.add("const");
        keywords.add("struct");
        keywords.add("typedef");
        keywords.add("union");


        List breakers = new ArrayList<String>();
        breakers.add("\n");
        breakers.add(">");
        breakers.add("}");
        breakers.add("");


        HashMap<String, List> hashMap = new HashMap();
        hashMap.put("keywords", keywords);
        hashMap.put("headerFiles", headerFiles);
        hashMap.put("datatypes", datatypes);
        hashMap.put("libraryFunctions", libraryFunctions);


        String target[] = source.split("[ ;(){}<>\n,\t+=]");


        for (String k : target) {

            String result = "";
            Collection<List> values = hashMap.values();
            Set<String> strings = hashMap.keySet();

            Iterator<String> iterator2 = strings.iterator();
            for (Iterator<List> iterator = values.iterator(); iterator.hasNext(); ) {
                List value = iterator.next();
                String string = iterator2.next();

                if (value.contains(k)) {
                    result = string;
                }


            }

            if (k.equals("")) continue;
            if (k.equals("\t")) continue;

            if (result.equals(""))
                System.out.println(k + "\t\t\t\t" + "Variable Name");
            else
                System.out.println(k + "\t\t\t\t" + result);


        }


    }

}

