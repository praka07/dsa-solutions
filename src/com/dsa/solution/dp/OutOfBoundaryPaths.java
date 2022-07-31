package com.dsa.solution.dp;

import java.util.Arrays;

//https://leetcode.com/problems/out-of-boundary-paths/
public class OutOfBoundaryPaths {
    public static void main(String[] args) {
        OutOfBoundaryPaths obj = new OutOfBoundaryPaths();
        System.out.println(obj.findPaths(8,
                50,
                23,
                5,
                26));

    }

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        // declare grid

        Long[][][] dp = null;
        dp = new Long[m+1][n+1][maxMove+1];

        return (int) dfs(m, n, maxMove, startRow, startColumn, dp);


    }

    public long dfs(int m, int n, int maxMove, int r, int c, Long[][][] dp) {
        if (maxMove < 0) {
            return 0;
        }
        if (r == m || c == n || r < 0 || c < 0) {
            return 1;
        }

        if (dp[r][c][maxMove] != null) {
            return dp[r][c][maxMove];
        }
        long up = dfs(m, n, maxMove - 1, r - 1, c, dp);
        long down = dfs(m, n, maxMove - 1, r + 1, c, dp);
        long left = dfs(m, n, maxMove - 1, r, c - 1, dp);
        long right = dfs(m, n, maxMove - 1, r, c + 1, dp);

        long result = ((left + right + up + down) % 1000000007);
        dp[r][c][maxMove] = result;
        return dp[r][c][maxMove];


    }
}
