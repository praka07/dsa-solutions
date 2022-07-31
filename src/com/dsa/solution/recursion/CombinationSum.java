package com.dsa.solution.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        CombinationSum obj = new CombinationSum();
        obj.combinationSum(new int[]{2,3,6,7}, 7);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();

        getCombinationLst(res, candidates, 0, new ArrayList<Integer>(), target);
        return res;

    }

    private void getCombinationLst(List<List<Integer>> res, int[] candidates, int index, ArrayList<Integer> subsets, int target) {

        if (candidates.length == index) {
            if (target == 0) {
                res.add(new ArrayList<>(subsets));
            }
            return ;
        }


        if (candidates[index] <= target) {
            subsets.add(candidates[index]);
            getCombinationLst(res, candidates, index, subsets,  target-candidates[index]);
            subsets.remove(subsets.size() - 1);
        }

        getCombinationLst(res, candidates, index + 1, subsets, target);
    }
}
