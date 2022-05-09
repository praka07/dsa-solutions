package com.dsa.solution.anonymous;

import java.util.Arrays;

public class DutchNationalFlagAlgorithmTwoColors {
    public static void main(String[] args) {
        int[] input = {-11, 0, -2, 1, -9};
        int low = 0, high = input.length - 1;
        while (low <= high) {
            if (input[low] <= 0) {
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
