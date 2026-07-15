package com.productstar.step1.block1.lesson0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] weight = new int[5];
        int total = 0;
        double average;
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите вес " + (i + 1) + " - й палеты: ");
            weight[i] = scanner.nextInt();
            total += weight[i];
        }
        average = (double) total / 5;
        System.out.println("Общий вес 5 палет: " + total);
        System.out.println("Средний вес 5 палет: " + average);

    }
}
