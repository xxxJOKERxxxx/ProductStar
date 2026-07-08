package com.productstar.step1.block1.lesson0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        if (sc % 2 == 0){
            System.out.println("чётное");
        } else {
            System.out.println("не чётное");
        }

    }


}
