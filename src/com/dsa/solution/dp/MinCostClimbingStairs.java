package com.dsa.solution.dp;


import java.util.Arrays;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length + 1];

        Arrays.fill(dp, -1);

        return minWay(cost, cost.length, 0, dp);

    }

    public int minWay(int[] cost, int totalSteps, int total, int[] dp) {

        if (totalSteps == 0 || totalSteps == 1) {
            return total;
        }

        if (dp[totalSteps] != -1) {
            return dp[totalSteps];
        }

        int oneStep = minWay(cost, totalSteps - 1, cost[totalSteps - 1], dp);
        int twoStep = minWay(cost, totalSteps - 2, cost[totalSteps - 2], dp);
        dp[totalSteps] = total + Math.min(oneStep, twoStep);


        return dp[totalSteps];


    }

    public static void main(String[] args) {
        MinCostClimbingStairs obj = new MinCostClimbingStairs();
        System.out.println(obj.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
