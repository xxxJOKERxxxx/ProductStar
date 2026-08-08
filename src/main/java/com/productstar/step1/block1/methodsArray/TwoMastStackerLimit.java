package com.productstar.step1.block1.methodsArray;

import java.util.Scanner;

public class TwoMastStackerLimit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите высоту яруса в метрах: ");
        int height = scanner.nextInt();

        System.out.println("Введите вес палеты в кг: ");
        int weight = scanner.nextInt();

        if (height <= 6 && weight <= 1500) {
            boolean can = true;
        } else if (height > 6 && weight <= 500) {
            boolean can = true;
        } else {
            boolean can = false;
        }
        System.out.println("Можно поднять: ");


    }


}
