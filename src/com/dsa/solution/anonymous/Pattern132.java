package com.dsa.solution.anonymous;

import java.util.Stack;

public class Pattern132 {
    public static void main(String[] args) {
        Pattern132 obj = new Pattern132();
        System.out.println(obj.find132pattern(new int[]{99,1,2,3,4,5,4,6}));
    }

    public boolean find132pattern(int[] nums) {

        if (nums.length < 3) {
            return false;
        }

        int min[] = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min[i] = Math.min(min[i - 1], nums[i]);
        }
        Stack<Integer> stack = new Stack<>();

        for (int j = nums.length - 1; j > 0; j--) {
            if (nums[j] > min[j]) {
                while (!stack.isEmpty() && stack.peek() <= min[j]) {
                    System.out.println("pop");
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() < nums[j])
                    return true;
                stack.push(nums[j]);
            }
        }

        return false;

    }
}
