package com.dsa.solution.mockinterview;

public class longestContinuousSequence {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1};
        int[] B = {1, 1, 1, 0, 1};
        int[] C = {1, 1, 1, 1, 1};
        System.out.println(longestContinuousSequence(A));
        System.out.println(longestContinuousSequence(B));
        System.out.println(longestContinuousSequence(C));
    }
    private static int longestContinuousSequence(int[] a) {
        int max_zero_index = 0;
        int max_one_streak = 0;
        int streak = 0;
        int first_zero_index = 0;
        int zero_index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                first_zero_index = i;
                break;
            }
        }

        for (int i = first_zero_index; i < a.length; i++) {
            if (a[i] == 0) {
                zero_index = i;
                streak = 0;
            } else {
                streak++;
            }

            if (streak > max_one_streak) {
                max_one_streak = streak;
                max_zero_index = zero_index;
            }
        }

        return max_zero_index;
    }
}
