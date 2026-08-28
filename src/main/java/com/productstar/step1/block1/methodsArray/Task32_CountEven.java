package com.productstar.step1.block1.methodsArray;   // ← пакет

import java.util.Scanner;                             // ← импорт Scanner

public class Task32_CountEven {                       // ← класс

    public static void main(String[] args) {          // ← main (точка входа)
        Scanner scanner = new Scanner(System.in);     // ← инструмент для ввода

        System.out.println("Введите масив чисел: ");  // ← запрос размера
        int size = scanner.nextInt();                 // ← читаем размер
        int[] number = new int[size];                 // ← создаём массив

        System.out.println("Введите " + size + " чисел ");
        for (int i = 0; i < number.length; i++) {
            System.out.println("число " + (i + 1 + ":"));  // ← подсказка
            number[i] = scanner.nextInt();                 // ← заполняем массив
        }

        int result = countEven(number);                // ← вызываем метод
        System.out.println("колличество чётных чисел: " + result); // ← вывод
    }

    public static int countEven(int[] number) {        // ← метод
        int count = 0;                                 // ← счётчик
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {                  // ← проверка на чётность
                count++;                               // ← увеличиваем
            }
        }
        return count;                                  // ← возвращаем результат
    }
}
