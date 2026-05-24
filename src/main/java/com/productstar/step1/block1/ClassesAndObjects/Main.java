package com.productstar.step1.block1.ClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        Dog Sharik = new Dog("Bark. Bark!!!");
        Cat Murka = new Cat();
        Hamster hamster = new Hamster();
        Dog seymour = new Dog("Bark. Bark!!!");
        System.out.println("Name is: " + seymour.getName());
        Cat Cat = new Cat();
        System.out.println("Cat has " + Cat.getLives() + " lives");

        Cat superCat = new Cat(10);
        System.out.println("SuperCat has " + superCat.getLives() + " lives");

        Dog dog = new Dog("Bark. Bark!!!");

        pet(Sharik);
        pet(Murka);
        pet(hamster);
    }

    public static void pet(Animal animal) {
        animal.makeSound();
    }
}
