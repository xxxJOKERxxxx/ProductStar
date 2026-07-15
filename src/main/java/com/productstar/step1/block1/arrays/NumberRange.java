package com.productstar.step1.block1.arrays;

import java.util.Scanner;

public class NumberRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] weight = new int[5];

        int count = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Введите вес " + (i + 1) + " -й палеты: ");

            weight[i] = scanner.nextInt();

            if (weight[i] >= 30 && weight[i] <= 50) {
                count++;
            }

        }
        System.out.println("Палет с весом от 30 до 50 включительно: " + count);

    }

}


