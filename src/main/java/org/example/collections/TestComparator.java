package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        animals.add("frog");
        animals.add("cat");
        animals.add("bird");
        animals.add("crocodile");

        Collections.sort(animals, new StringComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(5);
        numbers.add(568);
        numbers.add(4);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 < o2 ? 1 : o1 == o2 ? 0 : -1;
            }
        });
        System.out.println(numbers);

        PersonForComparator person0 = new PersonForComparator(12, "Egor");
        PersonForComparator person1 = new PersonForComparator(4, "Alex");
        PersonForComparator person2 = new PersonForComparator(100, "Helen");
        PersonForComparator person3 = new PersonForComparator(3, "Lola");

        List<PersonForComparator> personForComparatorList = new ArrayList<>();
        personForComparatorList.add(person0);
        personForComparatorList.add(person1);
        personForComparatorList.add(person2);
        personForComparatorList.add(person3);

        Collections.sort(personForComparatorList);
        System.out.println(personForComparatorList);




    }

}
