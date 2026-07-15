package com.productstar.step1.block1.lesson0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес палеты: ");
        int weight = scanner.nextInt();
        System.out.println("Ночная ли смена?: ");
        boolean isNight = scanner.nextBoolean();

        double baseCost = 0;
        if (weight<50) {
              baseCost = 100;
        } else if (weight<100) {
            baseCost = 200;
        }else  if (weight>100) {
            baseCost = 500;
        }
        double cost = baseCost * (isNight? 0.8 : 1.0);
        System.out.println(" Стоимость: " + cost);


    }
}
