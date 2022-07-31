package com.dsa.solution.recursion;

import java.util.ArrayList;
import java.util.List;

// print all subset sum
public class SubsetSum {
    public static void main(String[] args) {

        getAllsubsetSum(0, new int[]{3, 1, 2}, new ArrayList<Integer>(), 0);
        System.out.println();

    }

    private static void getAllsubsetSum(int index, int[] inputs, ArrayList<Integer> subsets, int sum) {
        if (index == inputs.length) {
            System.out.println(sum);
            return;
        }
        getAllsubsetSum(index + 1, inputs, subsets, inputs[index] + sum);
        getAllsubsetSum(index + 1, inputs, subsets, sum);

    }
}
