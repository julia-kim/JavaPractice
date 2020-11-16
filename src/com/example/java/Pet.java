package com.example.java;

public class Pet {
    // instance variables
    private String name;
    private int age;
    private String location;
    private String type;

    // constructors (cannot return a value)
    public Pet() {

    }

    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
