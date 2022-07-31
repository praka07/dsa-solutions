package com.dsa.solution.anonymous;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class PascalTriangle {

    public static void main(String args[]) {
        PascalTriangle obj = new PascalTriangle();
        obj.generate(5);


    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultSet = new ArrayList<>();

        if (numRows == 0) {
            return resultSet;

        }
        resultSet.add(Arrays.asList(1));
        List<Integer> pt;
        for (int i = 1; i < numRows; i++) {

            pt = new ArrayList<>();

            pt.add(1);

            List<Integer> prevRow = resultSet.get(i - 1);

            for (int j = 1; j < i; j++) {

                pt.add(prevRow.get(j - 1) + prevRow.get(j));

            }

            pt.add(1);
            resultSet.add(pt);

        }


        return resultSet;
    }
}