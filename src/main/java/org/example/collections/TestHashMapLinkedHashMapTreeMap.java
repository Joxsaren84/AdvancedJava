package org.example.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestHashMapLinkedHashMapTreeMap {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>(); //не гарантируется никакого порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //гарантируется порядок добавления
        Map<Integer, String> treeMap = new TreeMap<>(); //гарантирует пара ключ-значение будет отсортировано по ключу

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map){

        map.put(56, "Egor");
        map.put(12, "Inga");
        map.put(5, "Denis");
        map.put(45, "Tasia");
        map.put(6, "George");
        map.put(24, "Helga");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("--------------------------------------------------");

    }
}
