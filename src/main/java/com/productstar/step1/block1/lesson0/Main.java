package com.productstar.step1.block1.lesson0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int minWeight = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вес палеты: ");

        while (true) {

            int weight = scanner.nextInt();
            if (weight == 0)
                break;
            if (weight < minWeight) {
               minWeight = weight;
            }
        }
        System.out.println("минимальный вес палеты: " + minWeight);


    }
}
