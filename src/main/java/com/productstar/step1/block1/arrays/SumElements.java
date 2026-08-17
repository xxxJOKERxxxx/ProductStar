package com.productstar.step1.block1.arrays;

import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        int[] weight = new int[5];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите 5 чисел: ");
        for (int i = 0; i < weight.length; i++) {
            weight[i] =scanner.nextInt();
            sum = weight[i] + sum;
        }
        System.out.println("Сумма всех элементов: " + sum);
    }
}
