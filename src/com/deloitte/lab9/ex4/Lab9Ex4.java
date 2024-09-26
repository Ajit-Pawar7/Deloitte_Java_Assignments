package com.deloitte.lab9.ex4;

public class Lab9Ex4 {

    public static void main(String[] args) {
        PersonFactory personFactory = Person::new;

        Person person = personFactory.create("John", 30);
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());
    }

    interface PersonFactory {
        Person create(String name, int age);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
