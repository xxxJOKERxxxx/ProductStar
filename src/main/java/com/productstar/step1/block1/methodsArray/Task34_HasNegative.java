package com.productstar.step1.block1.methodsArray;

import java.util.Scanner;

public class Task34_HasNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("число " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        boolean result = hasNegative(numbers);

        System.out.println("есть отрицательное число в массиве: " + result);


    }
    public static boolean hasNegative(int[] numbers){

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                return true;
            }

        }
        return false;
    }

}
