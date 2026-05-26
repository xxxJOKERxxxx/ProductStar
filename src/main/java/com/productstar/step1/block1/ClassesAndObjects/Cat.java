package com.productstar.step1.block1.ClassesAndObjects;

public class Cat extends Animal implements Walkable, Fightable {

    public Cat(int lives) {
        super(lives);
        System.out.println("Cat constructor called ");
        this.lives = 9;
        System.out.println("Animal has " + this.lives + " lives");
    }

    public void mew() {
        System.out.println("Mewwww!!!");
    }

    public void makeSound() {
        System.out.println("Meeewwww!!!!");
    }

    @Override
    public void scratch() {
        System.out.println("Scratch!");
    }

    @Override
    public void walk() {
        System.out.println("Walk the cat!");

    }

    @Override
    public void bite() {
        System.out.println("Fight!!! Biteee!!");

    }
}
