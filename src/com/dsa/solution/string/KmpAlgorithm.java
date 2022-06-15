package com.dsa.solution.string;

public class KmpAlgorithm {
    public static void main(String[] args) {
        String input = "abcdefgh";
        String pattern = "meg";
        int[] lps = calculateLpsTable(pattern);
        int lenString = input.length();
        int lenPattern = pattern.length();
        int indexString = 0;
        int indexPattern = 0;
        while (indexString < lenString) {
            if (input.charAt(indexString) == pattern.charAt(indexPattern)) {
                indexString++;
                indexPattern++;
            }
            if (indexPattern == lenPattern) {
                System.out.println(indexString - indexPattern);
                indexPattern = lps[indexPattern - 1];

            } else if (indexString < lenString && input.charAt(indexString) != pattern.charAt(indexPattern)) {
                if (indexPattern != 0) {
                    indexPattern = lps[indexPattern - 1];
                } else {
                    indexString++;
                }

            }

        }
        System.out.println(-1);
    }

    // understand by abcabc, abcabd

    private static int[] calculateLpsTable(String pattern) {
        int lps[] = new int[pattern.length()];
        int i = 0, j = 1;
        while (j < pattern.length()) {
            if (pattern.charAt(j) == pattern.charAt(i)) {
                lps[j] = i + 1;
                i++;
                j++;
            } else {
                if (i == 0) {
                    lps[j] = 0;
                    j++;
                } else {
                    i = lps[i - 1];
                }
            }
        }
        return lps;
    }
}




