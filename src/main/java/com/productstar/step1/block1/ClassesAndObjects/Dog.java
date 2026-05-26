package com.productstar.step1.block1.ClassesAndObjects;

import java.sql.SQLOutput;

public class Dog extends Animal implements Walkable {

    public Dog(String say) {
        System.out.println(say);
    }

    public void bark() {
        System.out.println("bark!");
    }

    public void makeSound() {
        System.out.println("BBBAAARKKK!!!!");
    }

    @Override
    public void walk() {
        System.out.println("Walk the Dog!");
    }
}
