package com.productstar.step1.block1.arrays;

import java.util.Scanner;

public class ReverseOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] weight = new int[5];

        double sum = 0;

        double averageWeight = 0;

        int count = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Введите вес " + (i + 1) + " -й палеты: ");

            weight[i] = scanner.nextInt();
            sum += weight[i];

        }
        System.out.println("Сумма 5 палет: " + sum + " кг");

        System.out.println();

        averageWeight = (double) sum / 5;

        System.out.print("Средний вес равен: " + averageWeight + " кг");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            if (weight[i] > averageWeight) {
                count++;

                System.out.println("Тяжелее среднего веса: палета № " + (i + 1) + " " + "(" +  (weight[i])+ " кг)");
            }

        }
        System.out.println("Всего выше среднего: " + count + " палеты");

    }
}
