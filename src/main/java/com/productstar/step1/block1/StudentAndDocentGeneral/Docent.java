package com.productstar.step1.block1.StudentAndDocentGeneral;

public class Docent extends Person {

    String departament;
    int expriance;

    public Docent(String name, int age, String departament, int expriance) {
        super(name, age);
        this.departament = departament;
        this.expriance = expriance;
    }

    @Override
    void introduce() {
        System.out.println("Привет, я – доцент " + name + "!");
    }
}
