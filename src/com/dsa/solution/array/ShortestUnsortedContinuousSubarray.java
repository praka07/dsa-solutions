package com.dsa.solution.array;


import java.util.Arrays;

/*Given an integer array nums, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order.
Return the shortest such subarray and output its length.*/
/*Input: nums = [2,6,4,8,10,9,15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.*/
public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {

        ShortestUnsortedContinuousSubarray obj = new ShortestUnsortedContinuousSubarray();
        System.out.println("result " + obj.findUnsortedSubarrayBFApproach(new int[]{2, 6, 4, 8, 10, 9, 15}));
        System.out.println("result - optimal-  " + obj.findUnsortedSubarrayOptimalApproach(new int[]{2, 6, 4, 8, 10, 9, 15}));

    }

    private int findUnsortedSubarrayOptimalApproach(int[] nums) {
        //https://www.youtube.com/watch?v=hi9Z7EdsEfw&ab_channel=AlgorithmsMadeEasy
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                min = Math.min(min, nums[i]);
            }
        }

        return 0;
    }

    public int findUnsortedSubarrayBFApproach(int[] nums) {
        int[] arr = new int[nums.length];

        // copy input array to another array
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];

        }

        // sort another array
        Arrays.sort(arr);
        int start = 0, end = nums.length - 1;
        //find start index
        for (; start < nums.length; start++) {
            if (arr[start] != nums[start]) {
                break;
            }
        }
        if (start >= nums.length - 1) {
            return 0;
        }
        for (; end >= 0; end--) {
            if (arr[end] != nums[end]) {
                break;
            }
        }
        return end - start + 1;

    }
}
