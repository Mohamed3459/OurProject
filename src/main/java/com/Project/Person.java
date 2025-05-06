package com.Project;

public abstract class Person {
    protected String name;
    protected String gender;
    protected int age;
    protected int id;

    public Person(String name, String gender, int age, int id) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }
    public abstract void displayInfo(); //Will be ovverriden in Doctor and Patient
    
}
