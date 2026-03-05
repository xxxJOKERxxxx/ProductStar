package com.productstar.step1.block1.lesson1;

import java.util.Arrays;

public class WorkShop {
    public static void main(String[] args) {
        Friend[] friends = new Friend[3];
        friends[0] = new Friend("Вася", 18);
        friends[1] = new Friend("Катя", 19);
        friends[2] = new Friend("Дима", 20);

        System.out.println("Мои друзья: " + Arrays.toString(friends));

    }
}

class Friend{

    private String name;
    private int age;

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
