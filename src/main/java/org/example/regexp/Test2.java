package org.example.regexp;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String s = "Hello.there.hey";

        String [] array = s.split("\\.");
        System.out.println(Arrays.toString(array));

        System.out.println(s.replaceAll("\\.", " "));
        System.out.println(s.replaceFirst("\\.", " "));
    }
}
