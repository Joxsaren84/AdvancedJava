package org.example.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestHashSetLinkedSetTreeSet {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>(); //порядок не гарантируется
        Set<String> linkedSet = new LinkedHashSet<>(); //сохраняется порядок ввода
        Set<String> treeSet = new TreeSet<>(); //происходит натуральная сортировка

        testSet(hashSet);
        testSet(linkedSet);
        testSet(treeSet);
    }

    public static void testSet(Set<String> set){
        set.add("Egor");
        set.add("Nusha");
        set.add("Roman");
        set.add("Georg");
        set.add("Lola");
        set.add("Lola");
        set.add("Lola");

        for (String s : set){
            System.out.println(s);
        }

        //Методы:
        System.out.println();
        System.out.println(set.contains("Nusha"));
        System.out.println(set.contains("Tim"));
        System.out.println();

        System.out.println(set.isEmpty());
        System.out.println();

        System.out.println("______________");
    }

}
