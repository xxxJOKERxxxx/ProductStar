package com.productstar.step1.block1.lesson0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Считывайте вес каждой паллеты: ");
        while (true) {
            int weight = scanner.nextInt();
            if (weight == 0) {
                break;
            }
            count++;

            sum+=weight;
        }
        double avg = (double) sum / count;
        System.out.println("Средний вес палет равен: " + avg);
    }

}
