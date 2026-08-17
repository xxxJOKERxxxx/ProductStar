package com.productstar.step1.block1.arrays;

import java.util.Scanner;

public class HeavyWeightCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] weight = new int[5];
        int count = 0;
        System.out.println("Введите вес палеты: ");
        for (int i = 0; i < 5; i++) {
            weight[i] = scanner.nextInt();
            if (weight[i] > 50) {
                count++;
            }
        }
        System.out.println("Тяжелых палет: " + count);
    }
}