package com.dsa.solution.recursion;

public class StringPermutations {
    public static void main(String[] args) {
        String a = "abc";
        printPermutation("", a);
    }

    private static void printPermutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            String processed = f + ch + s;
            printPermutation(processed, up.substring(1));

        }

    }
}
