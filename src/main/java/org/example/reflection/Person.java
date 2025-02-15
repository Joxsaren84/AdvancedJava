package org.example.reflection;

@Author(name = "Me", dateOfCreation = 2025)
public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
        this.id = -1;
        this.name = "No name";
    }

    public void sayHello(){
        System.out.println("Person with id: " + id + " and name: " + name + " say hello!");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
