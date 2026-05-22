package com.productstar.step1.block1.StudentAndDocentGeneral;

class Docent extends Person {
    String department;
    int experience;

    Docent(String name, int age, String department, int experience) {
        super(name, age);
        this.department = department;
        this.experience = experience;
    }

    @Override
    void introduce() {
        System.out.println("Привет, я – доцент " + name + "!");
    }
}
