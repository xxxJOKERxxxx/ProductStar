package com.productstar.step1.block1.arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] weight = new int[5];

        int maxWeight = 0;
        int maxIndex = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Введите вес " + (i + 1) + " -й палеты: ");

            weight[i] = scanner.nextInt();

            if (weight[i] > maxWeight) {
                maxWeight = weight[i];
                maxIndex = i;
            }
        }
        System.out.println("Самая тяжжёлая палета №: " + (maxIndex + 1) + ", " + "вес " + maxWeight + " кг");


    }
}
