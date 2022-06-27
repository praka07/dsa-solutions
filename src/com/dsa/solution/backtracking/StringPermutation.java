package com.dsa.solution.backtracking;

public class StringPermutation {
    public static void main(String[] args) {
        String input = "ab";
        findPermutation(input, 0, input.length() - 1);
    }

    public static void findPermutation(String str, int left, int right) {

        if (left == right) {
            System.out.println(str);
            return;
        }

        for (int i = left; i <= right; i++) {
            // do
            int h = i;
            str = swap(str, left, i);
            //recur
            findPermutation(str, left + 1, right);
            //undo
            str = swap(str, left, i);
        }
    }

    private static String swap(String str, int left, int right) {

        char[] array = str.toCharArray();
        char c = array[left];
        array[left] = array[right];
        array[right] = c;

        return new String(array);
    }
}
