package com.dsa.solution.dp;

import java.util.Arrays;

public class FibonacciNumber {
    public static void main(String[] args) {

    }

    int[] dp;
    public int fib(int n) {

        dp=new int[n+1];
        Arrays.fill(dp,-1);

        return fibCal(n,dp);


    }

    public int fibCal(int n, int[] dp){


        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n] = fibCal(n-1,dp)+fibCal(n-2,dp);
        return dp[n];

    }
}
