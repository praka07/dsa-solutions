package com.dsa.solution.recursion;

public class StringSubSeq {
    public static void main(String[] args) {

        printSubSeq("", "abc");
    }

    private static void printSubSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        printSubSeq(p + ch, up.substring(1));
        printSubSeq(p, up.substring(1));
    }
}
