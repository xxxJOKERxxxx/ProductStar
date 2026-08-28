package com.productstar.step1.block1.methodsArray;

import java.util.Scanner;

public class Task33_CountPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите " + size + " Чисел");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int result = countPozitive(numbers);
        System.out.println("количество положительных чисел; " + result);
    }

   public static int countPozitive(int[] numbers) {
        int count = 0;
       for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] > 0) {
               count++;
           }
       }
       return count;

   }

}
