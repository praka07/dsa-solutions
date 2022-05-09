package com.dsa.solution.array;
//Given an array arr[] of size n. Given Q queries and in each query given L and R, print sum of array elements from index L to R.
public class QueryPrefixSum {
    public static void main(String[] args) {
        int n = 6;
        int[] a = {3, 6, 2, 8, 9, 2};
        int[] pf = new int[n + 2];
        pf[0] = 0;
        for (int i = 0; i < n; i++) {
            pf[i + 1] = pf[i] + a[i];
        }

        int[][] q
                = {{2, 3}, {4, 6}, {1, 5}, {3, 6}};
        for (int i = 0; i < q.length; i++) {
            int l = q[i][0];
            int r = q[i][1];

            System.out.print(pf[r] - pf[l - 1] + "\n");
        }
    }
}
