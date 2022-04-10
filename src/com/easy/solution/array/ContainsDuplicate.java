package com.easy.solution.array;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] i={1,2,3,1};
        ContainsDuplicate obj= new ContainsDuplicate();
        System.out.println(obj.containsDuplicate(i));
    }
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int j = (nums[i] ^ nums[i+1]);
            if ((nums[i] ^ nums[i+1]) != 0) {
                return false;
            }
        }
        return true;
    }
}
