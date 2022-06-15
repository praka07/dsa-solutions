package com.dsa.solution.string;

public class RemoveVowelsFromAString {
    public static void main(String[] args) {
        RemoveVowelsFromAString obj = new RemoveVowelsFromAString();
        System.out.println(obj.removeVowels("leetcodeisacommunityforcoders"));

    }

    public String removeVowels(String s) {

        StringBuilder sb = new StringBuilder();
        s.replace("o","p");

        for (char c : s.toCharArray()) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                sb.append(c);
            }
        }
        return new String(sb);
    }
}
