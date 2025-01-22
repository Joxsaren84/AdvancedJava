package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterable {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Iterator<Integer> iterator = arrayList.listIterator();

        int indx = 0;

        while (iterator.hasNext()){
            System.out.println(iterator.next());

            if(indx == 1){
                iterator.remove();
            }

            indx++;
        }


        for (int i : arrayList){
            System.out.println(i);
        }
    }
}
