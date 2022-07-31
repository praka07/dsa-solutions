package com.dsa.solution.recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        ReverseArray obj = new ReverseArray();
        System.out.println(Arrays.toString(obj.reverseArray(a, 0)));
    }

    private int[] reverseArray(int[] a, int i) {

        if (i >= a.length / 2) {
            return a;
        }

        swap(i, a.length - i - 1, a);
        return reverseArray(a, i + 1);

    }

    private void swap(int i, int i1, int[] a) {
        int temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;

    }
}
