package com.productstar.step1.block1.methodsArray;

import java.util.Scanner;

public class Task31_FindAverage {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        System.out.println("введите размер массива : ");

        int size = scaner.nextInt();

        int[] number = new int[size];

        System.out.println("Введите " + size + " чмсел: ");
        for (int i = 0; i < number.length; i++) {
            System.out.println("чмсло " + (i + 1) + "; ");
            number[i] = scaner.nextInt();
        }

        double average = findAverage(number);
        System.out.println("Среднее арифмитическоеЖ " + average);
    }

    public static double findAverage(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum+=number[i];

        }
        return (double) sum / number.length;
    }

}
