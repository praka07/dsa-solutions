package com.dsa.solution.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1679. Max Number of K-Sum Pairs
 * <p>
 * You are given an integer array nums and an integer k.
 * <p>
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * <p>
 * Return the maximum number of operations you can perform on the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4], k = 5
 * Output: 2
 * Explanation: Starting with nums = [1,2,3,4]:
 * - Remove numbers 1 and 4, then nums = [2,3]
 * - Remove numbers 2 and 3, then nums = []
 * There are no more pairs that sum up to 5, hence a total of 2 operations.
 */

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        int k = 5;
        MaxNumberOfKSumPairs obj = new MaxNumberOfKSumPairs();
        System.out.println("-- naive --" +obj.naiveApproach(input, k));
        System.out.println("-- optimal --- "+obj.maxOperations(input, k));

    }

    public int maxOperations(int[] nums, int k) {
        int maximumNumberOfOperation = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int target = k - nums[i];
            if (map.getOrDefault(target, 0) > 0) {
                map.put(target, map.get(target) - 1);
                maximumNumberOfOperation += 1;
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return maximumNumberOfOperation;
    }

    public int naiveApproach(int[] nums, int k) {
        Arrays.sort(nums);
        int maxOperations = 0;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int target = nums[left] + nums[right];
            if (target == k) {
                left++;
                right--;
                maxOperations++;

            } else if (target > k) {
                right--;
            } else {
                left++;
            }
        }

        return maxOperations;
    }
}
