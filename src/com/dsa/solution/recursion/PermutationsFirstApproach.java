package com.dsa.solution.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsFirstApproach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        PermutationsFirstApproach sol = new PermutationsFirstApproach();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        recurPermute(nums, ds, ans, freq);
        ans.forEach(obj -> {
            obj.forEach(value -> {
                System.out.print(value + " ");
            });
            System.out.println();
        });


    }

    private static void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {

        if (nums.length == ds.size()) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(" before executed --" + i);

            if (!freq[i]) {
                System.out.println(" executed --" + i);
                freq[i] = true;
                ds.add(nums[i]);
                System.out.println(Arrays.asList(ds));
                recurPermute(nums, ds, ans, freq);

                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}
