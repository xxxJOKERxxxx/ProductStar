package com.productstar.step1.block1.lesson0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вес палеты: ");

        int weight = scanner.nextInt();

        double baseCost;

        if (weight <= 0) {
            System.out.println("Ошибка: вес должен быть положительным!");
            return;
        } else if (weight > 500) {
            System.out.println("Ошибка: слишком тяжёлая палета, максимум 500кг");
            return;
        }


        System.out.println("Ночная ли смена?: ");
        boolean isNight = scanner.nextBoolean();



            if (weight < 50) {
                baseCost = 100;
            } else if (weight < 100) {
                baseCost = 200;
            } else {
                baseCost = 500;
            }

        double cost = baseCost * (isNight ? 0.8 : 1.0);
        System.out.println("Стоимость: " + cost);


    }
}
