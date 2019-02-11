package org.lasencinas;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args ) {
        String[] strings = {"01", "02", "03"};
        System.out.println(strings.length);

        String[] stringArray = {"foo", "bar", "monty"};
        List<String> stringList = Arrays.asList(stringArray);
        System.out.println(stringList);

        stringArray[2] = "XXX";
        System.out.println(stringList);

        for (int i = 0; i < stringArray.length; i++ ) {
            System.out.println(stringArray[i]);
        }

        System.out.println();
        for (String i: stringArray) {
            System.out.println(i);
        }


        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }
    }
}
