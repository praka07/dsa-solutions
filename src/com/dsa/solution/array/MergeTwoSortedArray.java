package com.dsa.solution.array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        MergeTwoSortedArray obj = new MergeTwoSortedArray();
        int[] first = {5, 10, 15, 40};
        int[] second = {2, 3, 20};
        System.out.println(Arrays.toString(obj.mergeArray(first, second)));
    }

    private int[] mergeArray(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                result[k++] = first[i];
                i++;
            } else {
                result[k++] = second[j];
                j++;
            }
        }
        while (i < first.length) {

            result[k++] = first[i];
            i++;

        }
        while (j < second.length) {
            result[k++] = second[j];
            j++;
        }

        return result;
    }
}
