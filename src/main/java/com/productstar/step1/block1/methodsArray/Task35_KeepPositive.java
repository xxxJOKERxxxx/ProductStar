package com.productstar.step1.block1.methodsArray;

import java.util.Scanner;

public class Task35_KeepPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int[]positive = keepPositive(numbers);

        System.out.println("исходный массив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("Новый массив, только положительные числа: ");
        for (int i = 0; i < positive.length; i++) {
            System.out.print(positive[i] + " ");

        }

    }
    public static int[] keepPositive(int[] numbers) {
        // 1. Считаем положительные числа
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                count++;
            }
        }

        // 2. Создаём новый массив нужного размера
        int[] positive = new int[count];

        // 3. Заполняем новый массив положительными числами
        int j = 0;   // ← отдельный счётчик для нового массива
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positive[j] = numbers[i];   // ← кладём число в новый массив
                j++;                         // ← переходим к следующей ячейке
            }
        }

        // 4. Возвращаем новый массив
        return positive;
    }
}
