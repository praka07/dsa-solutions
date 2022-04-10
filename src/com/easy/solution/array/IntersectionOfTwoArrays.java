package com.easy.solution.array;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        HashMap<Integer, Integer> f1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> f2 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            f1.put(nums1[i], f1.getOrDefault(nums1[1], 0) + 1);
        }
        for (int j = 0; j < nums2.length; j++) {
            f2.put(nums2[j], f2.getOrDefault(nums2[j], 0) + 1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (HashMap.Entry<Integer, Integer> pair : f1.entrySet()) {
            if (f2.containsKey(pair.getKey())) {
                int len = Math.min(f1.get(pair.getKey()), f2.get(pair.getKey()));
                while (len-- > 0) {
                    res.add(pair.getKey());
                }

            }

        }
        int[] result = new int[res.size()];
        int index = 0;
        for (int k : res) {
            result[index++]=k;

        }

    }
}
