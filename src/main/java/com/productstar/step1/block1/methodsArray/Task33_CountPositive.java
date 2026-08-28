package com.productstar.step1.block1.methodsArray;   // ← пакет (папка)

import java.util.Scanner;                             // ← инструмент для ввода

public class Task33_CountPositive {                   // ← класс

    public static void main(String[] args) {          // ← точка входа
        Scanner scanner = new Scanner(System.in);     // ← создаём Scanner

        System.out.print("Введите размер массива: "); // ← запрос
        int size = scanner.nextInt();                 // ← читаем размер
        int[] numbers = new int[size];                // ← создаём массив

        for (int i = 0; i < numbers.length; i++) {    // ← цикл заполнения
            System.out.print("число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();           // ← заполняем ячейку
        }

        int result = countPositive(numbers);          // ← ВЫЗОВ МЕТОДА (аргумент numbers)
        System.out.println("количество положительных чисел: " + result);
    }

    public static int countPositive(int[] numbers) {  // ← МЕТОД (параметр numbers)
        int count = 0;                                // ← счётчик
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {                     // ← проверка на положительное
                count++;                              // ← увеличиваем счётчик
            }
        }
        return count;                                 // ← возвращаем результат
    }
}
