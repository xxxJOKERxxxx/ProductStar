package com.productstar.step1.block1.arrays;

import java.util.Scanner;

public class ReverseOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] weight = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Введите вес " + (i + 1) + " -й палеты: ");

            weight[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print("В обратном порядке: ");
        for (int i = 4; i >=0; i--) {
            System.out.print(weight[i] + " ");
        }
    }
}
