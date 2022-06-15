package com.dsa.solution.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        Triangle obj = new Triangle();
        System.out.println(obj.minimumTotal(triangle));

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int rowSize = triangle.size();
        Integer[][] dp = new Integer[triangle.size()][triangle.size()];
        return findMinTotal(triangle, rowSize, 0, 0, dp);
    }

    private int findMinTotal(List<List<Integer>> triangle, int rowSize, int r, int c, Integer[][] dp) {

        if (r + 1 >= rowSize) {
            System.out.println(" leaf --> " + triangle.get(r).get(c));
            return triangle.get(r).get(c);
        }
        if (dp[r][c] != null) return dp[r][c];
        System.out.println(triangle.get(r).get(c));
        int choice1 = triangle.get(r).get(c) + findMinTotal(triangle, rowSize, r + 1, c, dp);
        System.out.println(" c1 --> " + choice1);
        int choice2 = triangle.get(r).get(c) + findMinTotal(triangle, rowSize, r + 1, c + 1, dp);
        System.out.println(" c2 --> " + choice2);
        System.out.println("min --> " + Math.min(choice1, choice2));
        dp[r][c] = Math.min(choice1, choice2);
        return dp[r][c];

    }
}
