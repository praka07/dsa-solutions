package com.dsa.solution.array;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        SortArrayByParity obj = new SortArrayByParity();
        System.out.println(Arrays.toString(obj.sortArrayByParity(new int[]{0, 1, 2})));
        System.out.println(Arrays.toString(obj.sortArrayByParityOptimal(new int[]{0, 1, 2})));
    }

    public int[] sortArrayByParity(int[] nums) {

        int totalEvenNumber = 0;
        int totalOddNumber = 0;
        int even = 0;
        int odd = 0;
        int[] result = new int[nums.length];

        if (nums.length == 0)
            return nums;


        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                totalEvenNumber++;
            } else {
                totalOddNumber++;
            }

        }
        int[] oddValue = new int[totalOddNumber];
        int[] evenValue = new int[totalEvenNumber];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenValue[even] = nums[i];
                even++;
            } else {
                oddValue[odd] = nums[i];
                odd++;
            }
        }
        int k = 0;
        for (; k < evenValue.length; k++) {

            result[k] = evenValue[k];
        }
        for (int j = 0; j < oddValue.length; j++) {
            result[k] = oddValue[j];
            k++;
        }

        return result;
    }

    public int[] sortArrayByParityOptimal(int[] nums) {
        int left = 0, right = nums.length-1;
        while (left < right) {
            while (left < right && (nums[left] % 2 == 0)) left++;
            while (left < right && (nums[right] % 2 == 1)) right--;
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}
