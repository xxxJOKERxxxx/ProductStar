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
        System.out.println();

        int[][] table = new int[3][3];
        System.out.println("Двумерный массив: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = i * j;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        int[] data = new int[4];
        data[0] = 5;
        data[data.length - 1] = 8;
        System.out.println("число из первой ячейки: " + data[0]);

        int[][] board = new int[2][3];
        board[0][0] = 10;
        board[1][2] = 20;
        System.out.println(" оба числа двумерного массива: " + "\n" + board[0][0] + " " + board[1][2]);

        int[][] table1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table1[i][j] = j;
            }
        }
        System.out.println("Массив из номеров столбца:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table1[i][j] + " ");
            }
            System.out.println();
        }

        int[] ages = {15, 20, 25, 30};
        System.out.println("каждый элемент с новой строки: ");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i] + " ");
        }

        System.out.println("Одномерный массив: ");
        int[] scores = {10,20,30,40};
        System.out.println("каждый элемент в 2 раза больше: ");
        int[] doubleScores = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
                doubleScores[i] = scores[i] * 2;
        }
        for (int i = 0; i < doubleScores.length; i++) {
            System.out.print(doubleScores[i] + " ");
        }


        System.out.println("Двумерный массив: ");
        int[][] twoDArray = {
                {1, 2},
                {3, 4}
        };
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
