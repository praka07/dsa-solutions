package com.dsa.solution.recursion;

import java.util.Arrays;

public class SumDigit {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(addUp(arr, 0, 1, arr.length)[0]);
    }

    private static int[] addUp(int[] arr, int s, int e, int length) {
        if (length == e) {
            s = 0;
            e = 1;
            length = length - 1;
        }
        if (length == 1) {
            return arr;
        }
        arr[s] = arr[s] + arr[e];
        s = e;
        e = e + 1;
        return addUp(arr, s, e, length);
    }
}
