package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class TestUnionSets {

    public static void main(String[] args) {

        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();

        hashSet1.add(0);
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);

        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(6);
        hashSet2.add(7);

        //union (объединение)
        Set<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);

        //intersection (пересечение)
        Set<Integer> intersection = new HashSet<>(hashSet1);
        intersection.retainAll(hashSet2);
        System.out.println(intersection);

        //difference (разность)
        Set<Integer> difference = new HashSet<>(hashSet1);
        difference.removeAll(hashSet2);
        System.out.println(difference);

    }

}
