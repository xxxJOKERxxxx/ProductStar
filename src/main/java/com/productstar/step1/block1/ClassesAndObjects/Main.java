package com.productstar.step1.block1.ClassesAndObjects;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(9);
        cat.color = Color.BLACK;
        System.out.println(cat.color);
        Walkable dog = new Dog("Hi! i'm The Dog!");

        takeMyToThePark(cat);
        takeMyToThePark(dog);
        fight((Fightable) cat);
    }
    public static void takeMyToThePark(Walkable walkable) {
        walkable.walk();
    }
    public static void fight(Fightable fightable) {
        fightable.bite();
    }

}
