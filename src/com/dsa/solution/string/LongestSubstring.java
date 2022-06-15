package com.dsa.solution.string;

import java.util.HashSet;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstring {
    public static void main(String[] args) {
        // iterative way
        // System.out.println(longestSubstringIterative("abcbbcab"));
        SlidingWindowApproach("praa");
    }

    private static int longestSubstringIterative(String input) {
        int maxLength = 0;
        for (int i = 0; i < input.length(); i = i + 1) {
            for (int j = i; j < input.length(); j = j + 1) {
                if (areUnique(input, i, j) == true) {
                    maxLength = Math.max(maxLength, j - i);
                }
            }
        }

        return maxLength;
    }

    private static boolean areUnique(String input, int i, int j) {
        boolean[] visited = new boolean[256];
        for (int k = i; k < j; k = k + 1) {
            // System.out.println(input.charAt(k)+0);
            if (visited[input.charAt(k)] == true) {
                return false;
            }
            visited[input.charAt(k)] = true;

        }

        return true;
    }

    public static void SlidingWindowApproach(String s) {
        int maxLength = 0;
        int i = 0;
        int j;

        while (i < s.length()) {
            boolean[] visited = new boolean[256];
            j = i;
            while (j < s.length() && visited[s.charAt(j)] == false) {
                maxLength = Math.max(maxLength, j - i + 1);
                visited[s.charAt(j)] = true;
                j = j + 1;

            }
            visited[s.charAt(i)] = false;
            i = i + 1;
        }
        System.out.println(" result --" + maxLength);
    }
}
