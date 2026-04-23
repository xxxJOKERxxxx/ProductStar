package com.productstar.step1.block1.lesson7;

import java.util.HashMap;  // импортируем HashMap

public class HashTableExample {
    public static void main(String[] args) {

        // ========== ЧАСТЬ 1: Создаём словарь ==========
        // <String, String> значит:
        //   ключ (имя) — тип String
        //   значение (номер телефона) — тип String
        HashMap<String, String> phoneBook = new HashMap<>();

        // ========== ЧАСТЬ 2: Добавляем пары ключ-значение ==========
        // Метод put(ключ, значение) — добавляет в словарь
        phoneBook.put("Анна", "89123456789");
        phoneBook.put("Борис", "89234567890");
        phoneBook.put("Виктор", "89345678901");
        phoneBook.put("Галина", "89456789012");

        // ========== ЧАСТЬ 3: Получаем значение по ключу ==========
        // Метод get(ключ) — возвращает значение
        String number = phoneBook.get("Борис");
        System.out.println("Номер Бориса: " + number);  // 89234567890

        // ========== ЧАСТЬ 4: Проверяем, есть ли ключ ==========
        // Метод containsKey(ключ) — проверяет наличие
        if (phoneBook.containsKey("Анна")) {
            System.out.println("Анна есть в книге");
        }

        // ========== ЧАСТЬ 5: Удаляем пару по ключу ==========
        phoneBook.remove("Галина");
        System.out.println("После удаления: " + phoneBook);

        // ========== ЧАСТЬ 6: Получаем все ключи ==========
        System.out.println("Все имена: " + phoneBook.keySet());

        // ========== ЧАСТЬ 7: Получаем все значения ==========
        System.out.println("Все номера: " + phoneBook.values());

        // ========== ЧАСТЬ 8: Размер словаря ==========
        System.out.println("Количество записей: " + phoneBook.size());
    }
}
