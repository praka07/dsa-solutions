package com.dsa.solution.generic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CalculateFrequencyByMap {
    public static void main(String[] args) {
        String s = "ssaabbcde";
        // hash map approach
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);

        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // another approach
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        System.out.println(" another method ::" + Arrays.toString(count));
    }
}
