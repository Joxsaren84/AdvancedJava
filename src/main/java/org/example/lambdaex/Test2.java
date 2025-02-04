package org.example.lambdaex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Good bye");
        list.add("Hi");
        list.add("Bye");



        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length())
                return -1;
                else if (o1.length() > o2.length())
                    return 1;
                else return 0;
            }
        });

        for (String s : list){
            System.out.println(s);
        }

        list.sort(((o1, o2) -> o1.length() > o2.length() ? -1 : o1.length() < o2.length() ? 1 : 0));

        for (String s : list){
            System.out.println(s);
        }
    }
}
