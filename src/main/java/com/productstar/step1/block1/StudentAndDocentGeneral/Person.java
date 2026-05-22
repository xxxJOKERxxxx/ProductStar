package com.productstar.step1.block1.StudentAndDocentGeneral;

abstract class Person {
    // 🔹 ПОЛЯ КЛАССА: хранят данные КАЖДОГО конкретного человека
    String name;  // имя человека (например, "Алексей")
    int age;      // возраст человека (например, 19)

    // Конструктор: заполняет поля при создании объекта
    Person(String name, int age) {
        this.name = name;  // "это поле name" = "переданное значение name"
        this.age = age;    // то же для возраста
    }

    void showInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    abstract void introduce();  // каждый потомок напишет свою версию
}
