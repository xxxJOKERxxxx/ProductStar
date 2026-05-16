package com.productstar.step1.block1.ClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        Dog Sharik = new Dog();
        Sharik.age = 5;
        System.out.println("Sharik is " + Sharik.age + " years");
        Sharik.bark();
        Sharik.jump();

        Cat Murka = new Cat();
        Murka.age = 3;
        System.out.println("Murka is " + Murka.age + " years");
        Murka.mew();
        Murka.jump();



    }
}
