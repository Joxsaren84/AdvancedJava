package org.example.collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {

    public static void main(String[] args) {

        PersonForQueue person1 = new PersonForQueue(1);
        PersonForQueue person2 = new PersonForQueue(2);
        PersonForQueue person3 = new PersonForQueue(3);
        PersonForQueue person4 = new PersonForQueue(4);

        Queue<PersonForQueue> people = new ArrayBlockingQueue<>(4);
        people.add(person2);
        people.add(person3);
        people.add(person1);
        people.add(person4);

        for(PersonForQueue p : people){
            System.out.println(p);
        }

        System.out.println("---------------------");

        System.out.println(people.remove());
        System.out.println(people);
        System.out.println(people.peek());
        System.out.println(people);

        people.add(person1);
        //people.add(person1);

        System.out.println(people.offer(person1));
    }
}

class PersonForQueue{

    private int id;

    public PersonForQueue(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonForQueue{" +
                "id=" + id +
                '}';
    }
}
