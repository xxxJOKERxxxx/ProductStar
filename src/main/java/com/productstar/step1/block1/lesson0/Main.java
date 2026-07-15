package com.productstar.step1.block1.lesson0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ночная ли смена? : ");

        boolean isNight = scanner.nextBoolean();  // ждёт ввод true или false

        System.out.println("введите кол-во отработанных часов: ");

        int hours = scanner.nextInt();

        int rate = isNight ? 1050 : 700;

        int salary = hours * rate;


        System.out.println("Зарплата: " + salary);


    }
}
