package com.dsa.solution.recursion;

public class ArraySubset {
    public static void main(String[] args) {
        ArraySubset obj = new ArraySubset();
        System.out.println(obj.subsetXORSum(new int[]{1, 3}));

    }

    public int subsetXORSum(int[] nums) {

        return calculateSubsetXORSum(0, nums);

    }

    private int calculateSubsetXORSum(int p, int[] nums) {


        int firstElement = nums[0];
        //calculateSubsetXORSum(p+firstElement,nums[0]);
        return 0;
    }
}
