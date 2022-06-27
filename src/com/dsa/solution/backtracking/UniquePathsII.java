package com.dsa.solution.backtracking;

public class UniquePathsII {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0, 0}, {0, 1}};
        UniquePathsII obj = new UniquePathsII();
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        int uniquePath = obj.findTotalPath(obstacleGrid, 0, 0, dp);
        int mod = 2 * 1000000009;
        System.out.println(uniquePath % mod);
    }

    public int findTotalPath(int[][] grid, int row, int col, int dp[][]) {

        if (row == grid.length || col == grid[0].length) {
            return 0;

        }
        if (grid[row][col] == 1) {
            return 0;
        }
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return 1;

        }

        if (dp[row][col] != 0) {
            return dp[row][col];
        }
        int down = findTotalPath(grid, row + 1, col, dp);
        int right = findTotalPath(grid, row, col + 1, dp);
        dp[row][col] = right + down;
        return dp[row][col];

    }
}
