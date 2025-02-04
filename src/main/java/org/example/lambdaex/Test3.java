package org.example.lambdaex;

import java.util.*;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        int [] array = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArr(array);
        fillList(list);

        show(list, array);

        for (int i = 0; i < 10; i++){
            list.set(i, list.get(i) * 2);
            array[i] = array[i] * 2;
        }

        show(list, array);

        //map
        array = Arrays.stream(array).map(i -> i / 2).toArray();
        list = list.stream().map(i -> i / 2).collect(Collectors.toList());

        show(list, array);

        //filter
        int [] array2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(array2);
        fillList(list2);

        array2 = Arrays.stream(array).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        show(list2, array2);

        //foreach
        Arrays.stream(array2).forEach(System.out::println);
        list2.forEach(System.out::println);

        //reduce
        int [] array3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(array3);
        fillList(list3);

        int reduce = Arrays.stream(array3).reduce((acc, i) -> acc + i).getAsInt();
        System.out.println(reduce);
        int reduce2 = list3.stream().reduce((acc, i) -> acc * i).get();
        System.out.println(reduce2);

        //multimethod
        array = Arrays.stream(array).map(i -> i * 100).filter(i -> i > 300).toArray();
        System.out.println(Arrays.toString(array));

        //with set
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(12);
        set.add(20);

        System.out.println(set);
        set = set.stream().map(i -> i * 100).collect(Collectors.toSet());
        System.out.println(set);

    }

    private static void fillArr(int [] arr){
        for (int i = 0; i < 10; i++){
            arr[i] = i + 1;
        }
    }

    private static void fillList(List<Integer> list){

        for (int i = 0; i < 10; i++){
            list.add(i + 1);
        }
    }

    private static void show(List<Integer> list, int [] array){
        System.out.println(Arrays.toString(array));
        System.out.println(list);
    }
}
