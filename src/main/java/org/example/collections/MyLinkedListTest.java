package org.example.collections;

public class MyLinkedListTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(5);
        myLinkedList.add(12);
        myLinkedList.add(2);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(2));

        myLinkedList.remove(1);
        System.out.println(myLinkedList);

        myLinkedList.remove(0);
        System.out.println(myLinkedList);

        myLinkedList.remove(0);
        System.out.println(myLinkedList);

    }
}
