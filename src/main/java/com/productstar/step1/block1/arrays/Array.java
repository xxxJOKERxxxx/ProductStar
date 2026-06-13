package com.productstar.step1.block1.arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = {3, 8, 1, 9, 2};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + sum;
        }
        System.out.println("сумма всех элементов массива равна : " + sum);

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Максимальное значение элемента в массиве равно: " + max);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] reversed = new int[arr.length];

        System.out.print("Перевернутый иассив: ");

        for (int i = 0; i < arr.length; i++) {

            reversed[i] = arr[arr.length - 1 - i];

            System.out.print(reversed[i] + " ");
        }
        ;

    }
}
