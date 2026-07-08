package com.productstar.step1.block1.lesson0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sum = 0;

        System.out.println("Введите рандомно 5 чисел: ");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int sc = scanner.nextInt();
            sum += sc;
        }
        scanner.close();
        System.out.println("Cумма ваших 5 чисел равна: " + sum);
    }


}
