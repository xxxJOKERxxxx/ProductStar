package com.productstar.step1.block1.ClassesAndObjects;

public abstract class Animal {
    int age;
    String color;
    boolean gender;

    public void jump() {
        System.out.println("JUMP!!!");
    }

    public abstract void makeSound();
}
