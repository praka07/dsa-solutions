package com.dsa.solution.generic;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {10, 4, 16, 20};
        int n = arr.length;
        int prefixSum[] = new int[n];
        prefixSum[0] = arr[0];
        // Adding present element with previous element
        for (int i = 1; i < n; ++i)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        System.out.println("prefix sum array " + Arrays.toString(prefixSum));
    }

}
