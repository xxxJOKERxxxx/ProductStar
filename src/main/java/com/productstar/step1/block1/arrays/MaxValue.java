package com.productstar.step1.block1.arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] nums = {3, 8, 1, 9, 2};
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
    }
}
