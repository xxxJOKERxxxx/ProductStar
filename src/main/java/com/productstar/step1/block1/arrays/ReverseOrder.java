package com.productstar.step1.block1.arrays;

import java.util.Scanner;

public class ReverseOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] weight = new int[5];

        double sum = 0;

        double averageWeight = 0;

        int count = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Введите вес " + (i + 1) + " -й палеты: ");

            weight[i] = scanner.nextInt();
            sum += weight[i];

        }
        System.out.println("Сумма 5 палет: " + sum + " кг");

        System.out.println();

        averageWeight = (double) sum / 5;

        System.out.print("Средний вес равен: " + averageWeight + " кг");
        System.out.println();

        // === ЗАДАЧА: вывести палеты тяжелее среднего через запятую ===

// ШАГ 1. Флаг — "это первая палета в списке?"
// Почему флаг? Потому что перед первой элемент запятую не ставим,
// а перед всеми остальными — ставим.
// true = "да, первая", false = "нет, уже были до этого"
        boolean first = true;

// ШАГ 2. Начинаем вывод. print, не println — чтобы не переносить строку
// Потом будем дописывать палеты в ту же строку
        System.out.print("Тяжелее среднего: ");

// ШАГ 3. Перебираем массив — стандартный паттерн
// i = 0, 1, 2, 3, 4 — индексы элементов массива
        for (int i = 0; i < 5; i++) {

            // ШАГ 4. Проверяем условие: эта палета тяжелее среднего?
            // averageWeight — посчитали раньше в другом цикле
            if (weight[i] > averageWeight) {

                // ШАГ 5. Первая ли это палета в списке?
                // Если НЕ первая (first == false), ставим запятую с пробелом
                // Если первая — ничего не ставим
                if (!first) {
                    System.out.print(", ");
                }

                // ШАГ 6. Выводим информацию о палете
                // (i + 1) — потому что для человека палета №1, а для массива индекс 0
                // weight[i] — вес этой палеты из массива
                System.out.print("палета №" + (i + 1) + " (" + weight[i] + " кг)");

                // ШАГ 7. Сбрасываем флаг: теперь первая палета уже была
                // Следующая (если есть) получит запятую перед собой
                first = false;
            }
        }

// ШАГ 8. Перенос строки — чтобы следующий вывод не слипся с нашим
        System.out.println();

    }
}
