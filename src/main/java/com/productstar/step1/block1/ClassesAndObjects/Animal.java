package com.productstar.step1.block1.ClassesAndObjects;

public abstract class Animal {
    private int age;
    String color;
    boolean gender;
    private String name;

    public void jump() {
        System.out.println("JUMP!!!");
    }

    public abstract void makeSound();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age is negstive!");
        }
        this.age = Math.max(0, age);
    }

    public String getName() {
        if (name == null) {
           return  "Unnamed";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
