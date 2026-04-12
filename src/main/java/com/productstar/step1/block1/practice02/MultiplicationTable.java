package com.productstar.step1.block1.practice02;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // 1. Создаём Scanner
        Scanner scanner = new Scanner(System.in);

        // 2. Просим ввести число
        System.out.print("Введите число от 1 до 9: ");
        int n = scanner.nextInt();

        // 3. Проверяем диапазон
        if (n >= 1 && n <= 9) {
            // 4. Выводим таблицу умножения
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " × " + i + " = " + (n * i));
            }
        } else {
            // 5. Если число вне диапазона — ошибка
            System.out.println("Число должно быть от 1 до 9");
        }

        // 6. Закрываем Scanner
        scanner.close();

    }
}

