package org.example.collections;

import javax.xml.namespace.QName;

public class PersonForComparator implements Comparable<PersonForComparator>{

    private int id;
    private String name;

    public PersonForComparator(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PersonForComparator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(PersonForComparator p) {
        return Integer.compare(this.id, p.getId());
    }
}
