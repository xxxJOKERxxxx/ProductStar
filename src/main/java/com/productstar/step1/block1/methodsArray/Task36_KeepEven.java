package com.productstar.step1.block1.methodsArray;

import java.util.Scanner;

public class Task36_KeepEven {

    public static void main(String[] args) {

        // 1. Scanner
        Scanner scanner = new Scanner(System.in);

        // 2. Размер массива
        System.out.print("Введите массив: ");
        int size = scanner.nextInt();

        // 3. Создать и заполнить массив
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("введите " + (i + 1) + " число ");
            numbers[i] = scanner.nextInt();
        }

        // 4. Вызвать метод keepEven
        int[] even = keepEven(numbers);

        // 5. Вывести исходный и новый массивы
        System.out.print("исходный массив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("новый массив, только четные числа больше 10: ");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
    }

    public static int[] keepEven(int[] numbers) {
        // 1. Считаем чётные (count)
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] > 10 ) {
                count++;
            }
        }
        // 2. Создаём новый массив
        int j = 0;

        int[] even = new int[count];
        // 3. Заполняем его чётными (j)
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] > 10) {
                even[j] = numbers[i];
                j++;
            }
        }
        // 4. Возвращаем
        return even;
    }
}