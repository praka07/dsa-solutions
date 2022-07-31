package com.dsa.solution.array;

import java.util.HashMap;

public class TargetSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int ts = 5;
        int pairCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < a.length; index++) {
            if (map.containsKey(ts - a[index])) {
                pairCount++;

            }
            map.put(a[index], index);


        }
        System.out.println(pairCount);
    }
}
