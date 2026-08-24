package com.productstar.step1.block1.methodsArray;

import java.util.Scanner;

public class Task32_CountEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите масив чисел: ");
        int size = scanner.nextInt();
        int[] number = new int[size];
        System.out.println("Введите " + size + " чисел ");
        for (int i = 0; i < number.length; i++) {
            System.out.println("число " + (i + 1 + ":"));
            number[i] = scanner.nextInt();
        }
        int result = countEven(number);
        System.out.println("колличество чётных чисел: " + result);

    }
    public static int countEven (int[] number) {
        int count =0;
        for (int i = 0; i < number.length; i++) {

            if (number[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
