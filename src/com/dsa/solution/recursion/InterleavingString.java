package com.dsa.solution.recursion;

public class InterleavingString {
    public static void main(String[] args) {

        InterleavingString obj = new InterleavingString();
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        System.out.println(obj.isInterleave(s1, s2, s3));

    }

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() == 0 || s2.length() == 0 || s3.length() == 0) {
            return true;
        }

        if (s3.length() == 0) {
            return false;
        }
        return ((s3.charAt(0) == s1.charAt(0)) && isInterleave(s1.substring(1), s2, s3.substring(1)))
                || ((s3.charAt(0) == s2.charAt(0)) && isInterleave(s1, s2.substring(1), s3.substring(1)));

    }
}
