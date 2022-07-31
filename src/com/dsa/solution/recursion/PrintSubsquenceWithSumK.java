package com.dsa.solution.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintSubsquenceWithSumK {
    public static void main(String[] args) {
        int a[] = {1, 2, 1};
        int k = 2;
        printSubSequenceWithSumk(0, a, new ArrayList<Integer>(), 0, k);
    }

    private static void printSubSequenceWithSumk(int index, int[] a, ArrayList<Integer> subSequence, int sum, int k) {


        if (index >= a.length) {
            if (sum == k) {
                System.out.println("list -- " + Arrays.asList(subSequence));
            }
            return;
        }

        subSequence.add(a[index]);
        sum=sum + a[index];
        printSubSequenceWithSumk(index + 1, a, subSequence,sum, 2);
        subSequence.remove(subSequence.size() - 1);
        sum = sum - a[index];
        printSubSequenceWithSumk(index + 1, a, subSequence, sum, 2);

    }
}
