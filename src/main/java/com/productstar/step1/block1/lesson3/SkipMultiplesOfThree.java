package com.productstar.step1.block1.lesson3;

import java.util.Scanner;

public class SkipMultiplesOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }

    }
}
