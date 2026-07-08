package com.productstar.step1.block1.lesson0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        System.out.println("Введите коды палет (0 - СТОП): ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int code = scanner.nextInt();
            if (code==0) {
                break;
            }count++;

        }

        System.out.println("Всего палет выгружено: " + count);
    }


}
