package com.productstar.step1.block1.arrays;

import java.util.Scanner;

public class EvenPallets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] weight = new int[5];

        int sum = 0;

        System.out.println("введите вес палеты: ");

        for (int i = 0; i < 5; i++) {
            weight[i] = scanner.nextInt();
            if (i % 2 != 0) {
                sum += weight[i];
            }
        }
        System.out.println("сумма весов только чётных палет: " + sum);
    }
}
