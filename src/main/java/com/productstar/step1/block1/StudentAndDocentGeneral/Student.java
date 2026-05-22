package com.productstar.step1.block1.StudentAndDocentGeneral;

public class Student extends Person {
    String group;
    double averageScore;

    Student(String name, int age, String group, double averageScore) {
        super(name, age);
        this.group = group;
        this.averageScore = averageScore;
    }

    @Override
    void introduce() {
        System.out.println("Здравствуйте, я – студент " + name + "!");
    }
}
