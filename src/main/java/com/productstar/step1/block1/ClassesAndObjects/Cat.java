package com.productstar.step1.block1.ClassesAndObjects;

public class Cat extends Animal{

    public Cat() {
        super();
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


}
