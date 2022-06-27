package com.dsa.solution.dp;

public class LongestPlaindromicSubstring {
    public static void main(String[] args) {
        String s = "a";
        LongestPlaindromicSubstring obj = new LongestPlaindromicSubstring();
        System.out.println(" - " + obj.longestPalindrome(s));

    }

    public String longestPalindrome(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        int start = 0;
        int maxLength = 1;
        // All substrings of length 1 are palindromes
        for (int i = 0; i < len; ++i) {
            dp[i][i] = 1;
        }
        // check for sub-string of length 2.

        for (int i = 0; i < len - 1; ++i) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                start = i;
                maxLength = 2;
            }
        }

        for (int k = 3; k <= len; ++k) {
            for (int i = 0; i < len - k + 1; ++i) {
                int j = i + k - 1;
                if ((dp[i + 1][j - 1] == 1) && (s.charAt(i) == s.charAt(j))) {
                    dp[i][j] = 1;
                    if(k>maxLength){
                        start=i;
                        maxLength=k;
                    }
                }

            }


        }

        return s.substring(start,start + maxLength);
    }


    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
