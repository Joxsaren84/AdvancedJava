package org.example.collections;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println(map);

        map.put(3, "another count");
        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.get(10));

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


}
