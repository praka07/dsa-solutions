package com.dsa.solution.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllSubsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<Integer> lst = new ArrayList<>();
        PrintAllSubsets obj = new PrintAllSubsets();
        obj.printAllSubset(0, nums, lst);
    }

    private void printAllSubset(int index, int[] nums, List<Integer> lst) {

        if (index == nums.length) {
            System.out.println(Arrays.asList(lst));
            return;
        }
        // include
        lst.add(nums[index]);
        printAllSubset(index + 1, nums, lst);
        //exclude
        lst.remove(lst.size() - 1);
        printAllSubset(index+1, nums, lst);
    }
}
