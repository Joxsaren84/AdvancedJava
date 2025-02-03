package org.example.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {

    public static void main(String[] args) {

        String text = "Hello, Guys! I send you my email joe@mail.com so we can\n" +
                "keep in tough. Thanks. Joe! That's cool/ I am sending you\n" +
                "my address: tim@yandex.ru. Let's stay in touch...";

        Pattern email = Pattern.compile("(\\w+)@(\\w+)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }
}
