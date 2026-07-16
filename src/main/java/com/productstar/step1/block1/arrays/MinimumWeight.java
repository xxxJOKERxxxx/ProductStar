package com.productstar.step1.block1.arrays;

import java.util.Scanner;

public class MinimumWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] weight = new int[5];

// Ввод
        for (int i = 0; i < 5; i++) {
            System.out.print("Вес палеты " + (i + 1) + ": ");
            weight[i] = scanner.nextInt();
        }

// Поиск минимума — ПОСЛЕ ввода
        int min = weight[0];
        int minIndex = 0;

        for (int i = 1; i < 5; i++) {
            if (weight[i] < min) {
                min = weight[i];
                minIndex = i;
            }
        }

// Вывод: номер палеты = индекс + 1
        System.out.println("Минимальный вес: " + min + " кг, палета №" + (minIndex + 1));

    }
}
