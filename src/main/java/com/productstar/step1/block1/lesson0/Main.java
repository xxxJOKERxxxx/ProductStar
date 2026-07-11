package com.productstar.step1.block1.lesson0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вес палеты: ");

        while (true){
            int weight = scanner.nextInt();
            if (weight > 100)
                break;
            count++;
        }
        System.out.println("Палет до перегруза более 100кг: " + count);


    }
}
