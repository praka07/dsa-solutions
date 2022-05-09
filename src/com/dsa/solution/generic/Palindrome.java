package com.dsa.solution.generic;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome("madam"));
    }

    private boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
