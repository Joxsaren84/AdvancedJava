package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            list.add(i);
        }

        System.out.println(list);
        System.out.println("Size of list: " + list.size());
        System.out.println("First element: " + list.get(0));
        System.out.println("Last element: " + list.get(list.size() - 1));

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        list.remove(5);
        list.set(0, 1);

        for (Integer i : list){
            System.out.println(i);
        }

    }
}
