package com.productstar.step1.block1.methodsArray;

import java.util.Scanner;

public class Task27_MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;          // ← объявили, но не инициализировали
        int b;          // ← пока без значения
        int c;          // ← пока без значения

        System.out.println("Введите 3 числа: ");
        a = scanner.nextInt();   // ← присвоили значение
        b = scanner.nextInt();
        c = scanner.nextInt();

        int result = findMax(a, b, c);   // ← передали числа в метод
        System.out.println("максимальное из трех: " + result);
    }

    public static int findMax(int a, int b, int c) {
        int max = a;              // ← начальное значение
        if (b > max) {            // ← если b больше
            max = b;              // ← обновляем максимум
        }
        if (c > max) {            // ← если c больше
            max = c;              // ← обновляем максимум
        }
        return max;               // ← возвращаем результат
    }
}
