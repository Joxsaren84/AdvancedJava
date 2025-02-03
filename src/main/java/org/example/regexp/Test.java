package org.example.regexp;

public class Test {
    public static void main(String[] args) {

        /*
        \\d - одна цифра
        \\w - одна буква
        + - один или более
        * - ноль или более
        ? - 0 или 1 символов до
        (|) - или
        [A-z] - набор символов
        [abc] - (a|b|c)
        [0-9] - \\d
        [^abc] - не (a|b|c)

        . - любой символ

        {2} - два символа до
        {2,} - от двух символов (два или более)
        {2,4} - от 2х до 4х символов
        */


        String s = "j+1";
        System.out.println(s.matches("[A-z](-|\\+)?\\d*"));
        String a = "hello";
        System.out.println(a.matches("[^abc]+"));

        String url = "https://www.sinara.ru";
        System.out.println(url.matches("https://www\\..+\\.(com|ru)"));

        String b = "1234abc";
        System.out.println(b.matches("\\d{4,}\\w{1,3}"));
    }
}
