package com.productstar.step1.block1.StudentAndDocentGeneral;

class Student extends Person {
    String group;   // 🔹 своё поле: группа
    double gpa;     // 🔹 своё поле: средний балл

    Student(String name, int age, String group, double gpa) {
        super(name, age);  // сначала заполняем общие поля (из Person)
        this.group = group;  // потом — свои поля
        this.gpa = gpa;
    }

    @Override
    void introduce() {
        System.out.println("Здравствуйте, я – студент " + name + "!");
    }
}
