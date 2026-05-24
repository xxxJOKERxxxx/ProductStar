package com.productstar.step1.block1.ClassesAndObjects;

public class Cat extends Animal{

    private int lives;

    public Cat() {
        this.lives = 9;
    }

    public Cat(int lives) {
        this.lives = lives;
    }

    public void mew() {
        System.out.println("Mewwww!!!");
    }

    public void makeSound() {
        System.out.println("Meeewwww!!!!");
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
