package com.dsa.solution.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllSubsets {

    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        PrintAllSubsets obj = new PrintAllSubsets();
        System.out.println(obj.subsets(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        allSubsets(nums, 0, subset);
        return res;

    }

    public static void allSubsets(int[] A, int index, List<Integer> subset) {

        if (index == A.length) {
            System.out.println("subset -- " + Arrays.asList(subset));
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(A[index]); //take
        allSubsets(A, index + 1, subset);
        subset.remove(subset.size() - 1); //remove
        allSubsets(A, index + 1, subset);






    }
}
