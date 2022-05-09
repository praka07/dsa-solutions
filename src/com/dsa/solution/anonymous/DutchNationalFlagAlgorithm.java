package com.dsa.solution.anonymous;

import java.util.Arrays;

public class DutchNationalFlagAlgorithm {
    public static void main(String[] args) {
        int[] input = {1,0,2,1,0};
        int low = 0, mid = 0, high = input.length - 1;
        while (mid <= high) {
            if (input[mid] == 2) {
                int temp = input[low];
                input[low] = input[mid];
                input[mid] = temp;
                mid++;
                low++;

            }
            else if (input[mid] == 0) {
                mid++;
            }
            else if (input[mid] == 1) {
                int temp = input[mid];
                input[mid] = input[high];
                input[high] = temp;
                high--;
            }
        }
        System.out.println("result " + Arrays.toString(input));
    }


}
