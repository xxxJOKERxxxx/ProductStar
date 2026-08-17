package com.productstar.step1.block1.methodsArray;

import java.util.Scanner;

public class SumMethodArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес палеты: ");
        int[] weight = new int[5];
        for (int i = 0; i < 5; i++) {
            weight[i] = scanner.nextInt();
        }
        int result = calculateSum(weight);
        System.out.println("сумма: " + result);
    }
    public static int calculateSum(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
