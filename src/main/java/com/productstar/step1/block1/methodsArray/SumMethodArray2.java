package com.productstar.step1.block1.methodsArray;

import java.util.Scanner;

public class SumMethodArray2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int result = calculateSum(numbers);
        System.out.println("сумма: " + result);
    }
    public static int calculateSum(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }



}
