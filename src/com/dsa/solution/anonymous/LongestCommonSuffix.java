package com.dsa.solution.anonymous;


//Given a program to find longest common suffix from an array of strings. E.g. Input: [“Monday”, “Tuesday”, “Wednesday”]. Output: “day”
//create a data structure that will add, remove, and get random element in constant time




public class LongestCommonSuffix {
    public static void main(String[] args) {
        String a = "Monday";
        String b = "Tuesday";

        System.out.println(returnCommonSuffix(a, b));

    }

    public static String returnCommonSuffix(String a, String b) {
        int[] common = new int[256];
        StringBuilder sb = new StringBuilder();
        char[] chFirstDay = new char[a.length()];
        char[] chSecondDay = new char[b.length()];

        for (int index = chFirstDay.length - 1; index >= 0; index--) {
            int ascii = chFirstDay[index] - '0';
            common[ascii]++;
        }

        for (int secondIndex = chSecondDay.length - 1; secondIndex >= 0; secondIndex--) {
            common[chSecondDay[secondIndex] - '0']--;

        }
        for (int i = 0; i < common.length; i++) {
            if (common[i] == 0) {
                sb.append(common[i]);
            }
        }

        return sb.toString();


    }
}
