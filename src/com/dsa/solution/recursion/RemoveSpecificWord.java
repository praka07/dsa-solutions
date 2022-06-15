package com.dsa.solution.recursion;

// write a program to remove specific word
public class RemoveSpecificWord {
    public static void main(String[] args) {

        System.out.println(removeWord("helloprakash"));

    }

    private static String removeWord(String input) {

        if (input.isEmpty()) {
            return "";
        }
        if (input.startsWith("prakash")) {
            return input.substring(7);
        }
        return input.charAt(0) + removeWord(input.substring(1));
    }

}
