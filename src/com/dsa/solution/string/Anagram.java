package com.dsa.solution.string;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("praka", "kapra"));

    }

    public static boolean isAnagram(String one, String two) {
        int[] count = new int[26];

        if (one.length() != two.length()) {
            return false;
        }

        for (int i = 0; i < one.length(); i++) {
            count[one.charAt(i) - 'a']++;
            count[two.charAt(i) - 'a']--;
        }

        for (int j = 0; j < 26; j++) {
            if (count[j] != 0) {
                return false;
            }
        }
        return true;
    }
}
