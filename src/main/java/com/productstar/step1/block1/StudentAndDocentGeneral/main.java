package com.productstar.step1.block1.StudentAndDocentGeneral;

public class main {

    static void greet(Person person) {
        person.introduce();
    }

    public static void main(String[] args) {

        Student student1 = new Student("Алексей", 19, "ИТ-101", 4.7);
        Docent docent1 = new Docent("Мария Ивановна", 42, "Программирования", 12);

        student1.ShowInfo();
        greet(student1);

        docent1.ShowInfo();
        greet(docent1);

    }

}
