package org.example.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.println("Time for linkedList: ");
        measureTime(list1);
        System.out.println("Time for arrayList: ");
        measureTime(list2);

    }

    private static void measureTime(List <Integer> list){

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            list.add(0, i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
