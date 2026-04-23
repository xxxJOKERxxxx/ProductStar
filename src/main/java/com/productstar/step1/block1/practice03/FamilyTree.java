package com.productstar.step1.block1.practice03;

import java.util.*;

public class FamilyTree {

    // Класс для одного человека в дереве
    static class Person {
        String name;                    // имя человека
        List<Person> children;         // список детей
        Person parent;                 // кто родитель (один)

        // Конструктор - создаём человека с именем
        public Person(String name) {
            this.name = name;
            this.children = new ArrayList<>();  // пока нет детей
            this.parent = null;                 // пока нет родителя
        }

        // Добавить ребёнка
        public void addChild(Person child) {
            this.children.add(child);   // добавляем в список детей
            child.parent = this;        // говорим ребёнку, кто его родитель
        }
    }

    public static void main(String[] args) {

        // ========== СТРОИМ СЕМЕЙНОЕ ДЕРЕВО ==========

        // Создаём людей
        Person grandpa = new Person("Дед");
        Person grandma = new Person("Бабушка");
        Person dad = new Person("Папа");
        Person mom = new Person("Мама");
        Person son = new Person("Сын");
        Person daughter = new Person("Дочь");

        // Связываем их
        grandpa.addChild(dad);    // Дед → Папа
        grandma.addChild(mom);    // Бабушка → Мама
        dad.addChild(son);        // Папа → Сын
        dad.addChild(daughter);   // Папа → Дочь

        // ========== ПОИСК ПОТОМКОВ (descendants) ==========
        System.out.println("=== ПОТОМКИ ===");
        System.out.println("Потомки Деда: " + getAllDescendants(grandpa));
        System.out.println("Потомки Папы: " + getAllDescendants(dad));

        // ========== ПОИСК ПРЕДКОВ (ancestors) ==========
        System.out.println("\n=== ПРЕДКИ ===");
        System.out.println("Предки Сына: " + getAllAncestors(son));
        System.out.println("Предки Дочери: " + getAllAncestors(daughter));
    }

    // ========== МЕТОД 1: Найти всех потомков (descendants) ==========
    // Потомки - это все дети, внуки, правнуки и так далее
    public static List<String> getAllDescendants(Person person) {

        List<String> result = new ArrayList<>();  // список для хранения имён потомков

        // Проходим по всем детям
        for (Person child : person.children) {
            result.add(child.name);               // добавляем имя ребёнка

            // РЕКУРСИЯ: добавляем потомков ребёнка (его детей)
            result.addAll(getAllDescendants(child));
        }

        return result;
    }

    // ========== МЕТОД 2: Найти всех предков (ancestors) ==========
    // Предки - это родители, дедушки, бабушки и так далее
    public static List<String> getAllAncestors(Person person) {

        List<String> result = new ArrayList<>();  // список для хранения имён предков

        Person current = person.parent;           // начинаем с родителя

        // Идём вверх по дереву, пока есть родитель
        while (current != null) {
            result.add(current.name);             // добавляем имя родителя
            current = current.parent;             // переходим к его родителю
        }

        return result;
    }
}
