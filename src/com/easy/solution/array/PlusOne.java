package com.easy.solution.array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        PlusOne obj = new PlusOne();
        System.out.println(Arrays.toString(obj.plusOne(new int[]{9,9,9})));

    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        // edge case 999
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
