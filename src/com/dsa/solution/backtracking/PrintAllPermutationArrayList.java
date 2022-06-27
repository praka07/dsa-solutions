package com.dsa.solution.backtracking;


import java.util.ArrayList;
import java.util.Arrays;


public class PrintAllPermutationArrayList {
    public static void main(String[] args) {
        PrintAllPermutationArrayList obj = new PrintAllPermutationArrayList();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        obj.permute(input);

    }

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> result = printAllPermutations(A, 0, A.size() - 1);

        return result;


    }

    private ArrayList<ArrayList<Integer>> printAllPermutations(ArrayList<Integer> a, int left, int right) {

        if (left == right) {

            ArrayList<ArrayList<Integer>> res = new ArrayList<>();

            res.add(new ArrayList<>(a));

            //System.out.println(Arrays.asList(a));
            return res;

        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            a = swap(a, left, i);
            ans.addAll(printAllPermutations(a, left + 1, right));
            a = swap(a, left, i);

        }

        return ans;
    }

    private ArrayList<Integer> swap(ArrayList<Integer> a, int left, int right) {

        int temp = a.get(left);
        a.set(left, a.get(right));
        a.set(right, temp);
        return a;
    }

}
