package com.dsa.solution.mockinterview;

public class AgodaQ1 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 1, 2, 1, 1};

        findGoodTuple(arr);

    }

    public static int findGoodTuple(int[] arr) {

        int goodTuple = 0;
        int left = 0, mid = 0, right = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            // System.out.println(arr[i]);
            left = arr[i];
            mid = arr[i + 1];
            right = arr[i + 2];
            System.out.println(left + " " + mid + " " + right + " ");
            if (left == mid && left != right) {
                goodTuple++;
            } else if (left != mid && left == right) {
                goodTuple++;
            }else if (left != mid && mid == right) {
                goodTuple++;
            }
        }
        System.out.println(goodTuple);
        return goodTuple;
    }
}
