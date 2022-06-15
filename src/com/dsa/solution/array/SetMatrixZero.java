package com.dsa.solution.array;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] input = {{1, 0, 1}, {1, 1, 1}, {1, 0, 1}};
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i][j] == 0) {

                    for (int row = 0; row < input.length; row++) {
                        if (input[i][row] != 0) {
                            input[i][row] = -1;
                        }
                    }
                    for (int col = 0; col < input.length; col++) {
                        if (input[col][j] != 0) {
                            input[col][j] = -1;
                        }
                    }
                }
            }
        }
        for (int row = 0; row < input.length; row++) {
            for (int col = 0; col < input.length; col++) {
                if (input[row][col] == -1) {
                    input[row][col] = 0;
                }
            }

        }
    }
}
