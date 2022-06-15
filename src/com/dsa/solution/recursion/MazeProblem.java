package com.dsa.solution.recursion;

public class MazeProblem {
    public static void main(String[] args) {
        MazeProblem obj = new MazeProblem();
        int starRow = 0;
        int startColumn = 0;
        int endColumn = 2;
        int endRow = 2;

        System.out.println(findTotalPath(starRow, startColumn, endRow, endColumn));
    }

    private static int findTotalPath(int starRow, int startColumn, int endRow, int endColumn) {
        //System.out.println("( "+starRow +","+startColumn+" )");

        if (starRow == endRow || startColumn == endColumn) {
            return 1;
        }
        int left = findTotalPath(starRow + 1, startColumn, endRow, endColumn);
        int right = findTotalPath(starRow, startColumn + 1, endRow, endColumn);
        return left + right;
    }

}
