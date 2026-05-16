package com.productstar.step1.block1.ClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        Dog Sharik = new Dog();
        Cat Murka = new Cat();
        Hamster hamster = new Hamster();

        pet(Sharik);
        pet(Murka);
        pet(hamster);
    }

    public static void pet(Animal animal) {
        animal.makeSound();
    }
}
