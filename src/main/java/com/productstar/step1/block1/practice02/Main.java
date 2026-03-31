package com.productstar.step1.block1.practice02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите час (0-23): ");
        int hour = sc.nextInt();
        if (hour < 0 || hour > 23) {
            System.out.println("Ошибка: час должен быть в диапазоне от 0 до 23!");
        }
        else {
            //определение времени суток
            if (hour>=6 && hour <= 11) {
                System.out.println("это утро!");

            }else if (hour>=12 && hour <= 17) {
                System.out.println("Это день!");

            } else if (hour>=18 && hour <= 21) {
            System.out.println("это вечер");

        } else if (hour>=22 && hour <= 5) {
            System.out.println("это ночь");
        }
            sc.close();
    }
}
}
