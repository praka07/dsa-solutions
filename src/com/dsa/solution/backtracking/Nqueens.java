package com.dsa.solution.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nqueens {

    List<List<String>> res = new ArrayList<>();

    public static void main(String[] args) {
        Nqueens obj = new Nqueens();
        List<List<Boolean>> board = new ArrayList<>();
        int n = 4;
        for (int i = 0; i < n; i++) {
            List<Boolean> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(false);
            }
            board.add(temp);
        }

        System.out.println(Arrays.asList(obj.solveNQueens(board, 0)));
    }


    public List<List<String>> solveNQueens(List<List<Boolean>> board, int row) {
        if (row == board.size()) {

            res.addAll(displayBoard(board));
           // System.out.println();

                return res;
        }
        List<List<String>> ans = new ArrayList<>();
        for (int col = 0; col < board.size(); col++) {

            if (isSafe(board, row, col)) {

                board.get(row).set(col, true);
                ans.addAll(solveNQueens(board, row + 1));
                board.get(row).set(col, false);

            }
        }


        return ans;
    }

    private List<List<String>> displayBoard(List<List<Boolean>> board) {

        List<List<String>> fullBoard = new ArrayList<>();
        List<String> rowArrangment = new ArrayList<>();

        for (List<Boolean> list : board) {
            rowArrangment = new ArrayList<>();
            for (Boolean item : list) {
                if (item) {
                 //   System.out.print("Q ");
                    rowArrangment.add("Q");

                } else {
                    rowArrangment.add(".");
                  //  System.out.print("X ");
                }

            }
           // System.out.println("--" + Arrays.asList(rowArrangment));
            fullBoard.add(new ArrayList<>(rowArrangment));
          //  System.out.println();
        }

        return fullBoard;
    }

    public static boolean isSafe(List<List<Boolean>> board, int row, int col) {
        // check vertical check

        for (int i = 0; i < row; i++) {
            if (board.get(i).get(col)) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int k = 1; k <= maxLeft; k++) {
            if (board.get(row - k).get(col - k)) {
                return false;
            }

        }

        // right
        int maxRight = Math.min(row, board.size() - col - 1);
        for (int l = 1; l <= maxRight; l++) {
            if (board.get(row - l).get(col + l)) {
                return false;
            }
        }


        return true;

    }

}