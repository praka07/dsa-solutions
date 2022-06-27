package com.dsa.solution.dp;

import java.util.Arrays;

public class ClimbingStairs {
    int[] distinctWay;

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(" total way " + climbingStairs.climbStairs(10));
    }

    public int climbStairs(int n) {

        distinctWay = new int[n+1];
        Arrays.fill(distinctWay, -1);

        return totalWay(n);


    }

    private int totalWay(int step) {

        if (step == 1) {

            return 1;
        }
        if (step == 2) {
            return 2;
        }
        if (distinctWay[step] != -1) {
            return distinctWay[step];
        }
        distinctWay[step] = totalWay(step - 1) + totalWay(step - 2);

        return distinctWay[step];

    }
}
