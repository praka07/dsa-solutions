package com.dsa.solution.array;
//1658. Minimum Operations to Reduce X to Zero
//https://www.youtube.com/watch?v=3p2fBvxrVQA&ab_channel=AlgorithmsMadeEasy
public class ReduceXtoZero {
    public static void main(String[] args) {
        ReduceXtoZero obj= new ReduceXtoZero();
        System.out.println(obj.minOperations(new int[]{1,1,4,2,3},5));

    }

    public int minOperations(int[] nums, int x) {

        int target=-x;
        for(int index=0;index<nums.length;index++){
            target+=nums[index];
        }

        if(target==0){
            return nums.length;
        }
        if(target<0){
            return -1;
        }

        int res=-1,sum=0,left=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>target){
                sum -=nums[left++];
            }
            if(target==sum){
                res= Math.max(res,right-left+1);
            }
        }

        return res ==-1 ? -1 :nums.length-res;
    }
}
