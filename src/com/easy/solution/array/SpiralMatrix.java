package com.easy.solution.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        SpiralMatrix object = new SpiralMatrix();
        // System.out.println(Arrays.deepToString(object.generateMatrix(3)));
        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        object.spiralOrder(input);


    }

    public int[][] generateMatrix(int n) {
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int[][] result = new int[n][n];
        int val = 1;

        while (val <= n * n) {
            for (int i = left; i <= right; i++) {
                result[top][i] = val++;

            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = val++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                result[bottom][i] = val++;

            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                result[i][left] = val++;
            }
            left++;
        }
        return result;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int top = 0, left = 0, bottom = matrix.length - 1, right = matrix[0].length - 1;
        int dir = 0;
        while (left <= right && top <= bottom) {
            if (dir == 0) {
                for (int i = left; i <= right; i++)
                    result.add(matrix[top][i]);
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= bottom; i++)
                    result.add(matrix[i][right]);
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--)
                    result.add(matrix[bottom][i]);
                bottom--;
            } else if (dir == 3) {
                for (int i = bottom; i >= top; i--)
                    result.add(matrix[i][left]);
                left++;
            }
            dir = (dir + 1) % 4;
        }


        return result;
    }
}
