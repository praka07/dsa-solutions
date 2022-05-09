package com.dsa.solution.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        k %= nums.length;
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums,k, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverseArray(int[] input, int start, int end) {
        int i, j;
        for (i = start, j = end; i < j; i++, j--) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
    }
}
