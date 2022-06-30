package com.dsa.solution.anonymous;

import java.util.Arrays;

public class DutchNationalFlagAlgorithmTwoNumbers {
    public static void main(String[] args) {
        int[] input = {0, 1, 1, 0, 0, 1, 1, 0};
        int low = 0, high = input.length - 1;
        while (low <= high) {
            if (input[low] == 1) {
                low++;
            } else {
                int temp = input[low];
                input[low] = input[high];
                input[high] = temp;
                high--;

            }
        }

        System.out.println("result " + Arrays.toString(input));
    }
}
