package com.productstar.step1.block1.arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = {3, 8, 1, 9, 2};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + sum;
        }
        System.out.println("сумма всех элементов равна : " + sum);

    }
}
