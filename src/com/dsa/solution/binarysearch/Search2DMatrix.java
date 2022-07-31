package com.dsa.solution.binarysearch;

public class Search2DMatrix {
    public static void main(String[] args) {
        Search2DMatrix obj = new Search2DMatrix();
        int[][] input = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 20;
        System.out.println(obj.searchMatrix(input, target));
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        // loop through by row wise
        int row = matrix.length;
        int col = matrix[0].length-1;
        for (int i = 0; i < row; i++) {
            if ((checkTarget(i, 0, col, matrix, target))) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTarget(int row, int low, int high, int[][] array, int target) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[row][mid] < target) {
                low = mid + 1;
            } else if (array[row][mid] == target) {
                return true;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
