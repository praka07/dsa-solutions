package com.easy.solution.array;

public class LongestValidParentheses {
    public static void main(String[] args) {

    }

    public int longestValidParentheses(String A) {
        int[] dp = new int[A.length()];
        int maxAns = 0;
        for (int character = 0; character < A.length(); character++) {
            if (A.charAt(character) == ')') {
                if (A.charAt(character - 1) == '(') {
                    dp[character] = dp[character - 2] + 2;
                } else if (character - dp[character - 1] > 0 && A.charAt(character - dp[character - 1] - 1) == '(') {
                    dp[character] = dp[character - 1] + ((character - dp[character - 1]) >= 2 ? dp[character - dp[character - 1] - 2] : 0) + 2;
                }
                maxAns = Math.max(maxAns, dp[character]);

            }
        }

        return maxAns;
    }
}
