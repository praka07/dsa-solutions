package com.dsa.solution.string;

//https://www.educative.io/edpresso/how-to-reverse-the-order-of-words-in-a-sentence
public class ReverseString {
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.reverseString("you shall not pass  ");
    }

    public String solve(String A) {
        StringBuilder result = new StringBuilder();
        String array[] = A.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(reverseString(reverseString(array[i]))).append(" ");

        }

        return result.toString().trim();
    }

    public String reverseString(String input) {
        System.out.println(" first "+ input);
        char[] word = input.toCharArray();
        int len = word.length;
        for (int i = 0; i < len / 2; i++) {
            char ch = word[i];
            word[i] = word[len - i - 1];
            word[len - i - 1] = ch;
        }
        System.out.println(new String(word));
        return new String(word);
    }
}
