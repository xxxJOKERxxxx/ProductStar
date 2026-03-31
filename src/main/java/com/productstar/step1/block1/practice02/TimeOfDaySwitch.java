package com.productstar.step1.block1.practice02;

import java.util.Scanner;

public class TimeOfDaySwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите час (0-23): ");
        int hour = scanner.nextInt();

        // Проверка корректности ввода
        if (hour < 0 || hour > 23) {
            System.out.println("Ошибка: час должен быть в диапазоне от 0 до 23");
        } else {
            // Определение времени суток через switch
            switch (hour) {
                case 6: case 7: case 8: case 9: case 10: case 11:
                    System.out.println("Сейчас утро.");
                    break;
                case 12: case 13: case 14: case 15: case 16: case 17:
                    System.out.println("Сейчас день.");
                    break;
                case 18: case 19: case 20: case 21:
                    System.out.println("Сейчас вечер.");
                    break;
                default:
                    System.out.println("Сейчас ночь.");
                    break;
            }
        }

        scanner.close();
    }
}
