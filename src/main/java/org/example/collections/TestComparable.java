package org.example.collections;

import java.util.*;

public class TestComparable {
    public static void main(String[] args) {
        List<PersonForComparable> peopleList = new ArrayList<>();
        Set<PersonForComparable> peopleSet = new TreeSet<>();

        addElement(peopleList);
        addElement(peopleSet);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    private static void addElement(Collection collection){
        collection.add(new PersonForComparable(4, "Bob"));
        collection.add(new PersonForComparable(2, "Jac"));
        collection.add(new PersonForComparable(5, "Helga"));
        collection.add(new PersonForComparable(1, "Egor"));
        collection.add(new PersonForComparable(3, "George"));
    }
}

class PersonForComparable implements Comparable<PersonForComparable>{

    private int id;
    private String name;

    public PersonForComparable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonForComparable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonForComparable that = (PersonForComparable) o;

        if (id != that.id) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(PersonForComparable o) {
        //return Integer.compare(this.id, o.id);
        return Integer.compare(this.name.length(), o.name.length());
    }
}
