package com.dsa.solution.recursion;

import java.util.Arrays;

public class RobotuniquePaths {
    public static void main(String[] args) {
        RobotuniquePaths obj = new RobotuniquePaths();
        System.out.println(obj.uniquePaths(51, 9));

    }

    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        int[][] dp = new int[m][n];
        for (int i = 0; i < grid.length; i++) {
            Arrays.fill(grid[i], 1);
        }

        int uniquePath = uniquePathCount(grid, 0, 0, dp);
        int mod = 2 * 1000000009;
        return uniquePath % mod;

    }

    public static int uniquePathCount(int[][] grid, int r, int c, int[][] dp) {

        if (r == grid.length - 1 || c == grid[0].length - 1) {
            return grid[r][c];
        }
        if (dp[r][c] != 0) {
            return dp[r][c];
        }


        int right = uniquePathCount(grid, r, c + 1, dp);
        int down = uniquePathCount(grid, r + 1, c, dp);
        dp[r][c] = right + down;
        return dp[r][c];
    }
}
