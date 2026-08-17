package com.productstar.step1.block1.methodsArray;

import java.util.Scanner;

public class Task26_IsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        boolean result = isEven(number);
            if (result) {
                System.out.println("число четное!");
            } else {
                System.out.println("число нечетное!");
            }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
