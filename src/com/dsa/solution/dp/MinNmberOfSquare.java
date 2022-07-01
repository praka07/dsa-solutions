package com.dsa.solution.dp;

public class MinNmberOfSquare {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int k = 1; k * k <= i; k++) {
                dp[i] = Math.min(dp[i], dp[i - k * k] + 1);

            }
        }
        System.out.println(dp[n]);
    }

}
