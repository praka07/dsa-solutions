package com.dsa.solution.sap.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class SAPInterview {
    public static void main(String[] args) {
        int[] input1 = {4, 15, 8, 16, 2, 5};
        int[] input2 = {1, 7, 6, 9, 12, 13, 18, 20};
        ArrayList<Integer> res = new ArrayList<>();

        Arrays.sort(input1);
        Arrays.sort(input2);
        res.add(input1[0]);

    }

    public int binarySearcht(int[] array, int ele) {
        int low = 0, high = array.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] > ele) {

            }

        }
return 0;
    }
}
