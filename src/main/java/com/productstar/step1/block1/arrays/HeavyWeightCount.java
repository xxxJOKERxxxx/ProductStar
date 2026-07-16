package com.productstar.step1.block1.arrays;

import java.util.Scanner;

public class HeavyWeightCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] weight = new int[5];
        boolean first = true;

        for (int i = 0; i < 5; i++) {
            weight[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(weight[i]);
            first = false;
        }
        System.out.println();
    }
}