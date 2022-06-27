package com.dsa.solution.recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        SumOfArray obj = new SumOfArray();
        System.out.println(obj.sum(a, a.length));
    }

    private int sum(int[] a, int len) {

        if (len <= 0) {
            return 0;
        }


        return sum(a, len - 1) + a[len - 1];
    }
}
