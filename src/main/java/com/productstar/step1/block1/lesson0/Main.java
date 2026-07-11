package com.productstar.step1.block1.lesson0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вес палеты: ");
        while (true) {

            int weight = scanner.nextInt();

            if (weight <= 0) {
                System.out.println("ОШИБКА ВВОДА!");
                break;
            } else if (weight < 10) {
                System.out.println("Зона А: мелкий товар");
            } else if (weight <= 30) {
                System.out.println("Зона В: стандарт");
            }  else if ( weight <= 50) {
                System.out.println("Зона С:тяжелый");
            }else if (weight <= 100) {
                System.out.println("Зона D:крупногабарит");
            }else
                System.out.println("Перегруз! Не принимаем!");
            break;

        }

    }
}
