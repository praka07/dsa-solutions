package com.dsa.solution.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermutaions {
    public static void main(String[] args) {
        ArrayPermutaions obj = new ArrayPermutaions();
        List<List<Integer>> listOfList = obj.permute(new int[]{1, 2, 3});
        System.out.println();
    }

    public List<List<Integer>> permute(int[] nums) {

        return permutations(nums, 0, nums.length - 1);

    }

    public static List<List<Integer>> permutations(int[] nums, int left, int right) {

        if (left == right) {
            List<List<Integer>> ans1 = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            //System.out.println(Arrays.toString(nums));
            for (int value : nums) {
                temp.add(value);
            }
            ans1.add(new ArrayList<>(temp));
            return ans1;

        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {

            nums = swap(nums, left, i);
            ans.addAll(permutations(nums, left + 1, right));
            nums = swap(nums, left, i);
        }

        return ans;
    }

    public static int[] swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        return nums;
    }
}
