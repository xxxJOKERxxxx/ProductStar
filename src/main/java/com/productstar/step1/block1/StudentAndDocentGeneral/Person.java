package com.productstar.step1.block1.StudentAndDocentGeneral;

abstract public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void ShowInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    abstract void introduce();
}
