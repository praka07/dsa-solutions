package com.easy.solution.array;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        mz.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int left = 0, right = 0;
        if (length == 0 || length == 1) {
            return;
        }
        while (right < length) {
            if (nums[right] == 0) {
                right++;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right++;
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
