package com.productstar.step1.block1.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Перевернутый массив: ");
        int[] reversed = new int[arr.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
            System.out.print(reversed[i] + " ");
        }
    }
}
