package com.dsa.solution.recursion;

public class ShiftArray {
    public static void main(String[] args) {
        int[] a = {9, 12, 17, 2, 4, 5};
        System.out.println(search(a, 2, 0, a.length - 1));
    }

    private static int search(int[] a, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (a[mid] == target) {
            return mid;
        }
        if (a[start] <= a[mid]) {
            if (target >= a[start] && target <= a[mid]) {
                return search(a, target, start, mid - 1);
            } else {
                return search(a, target, mid + 1, end);
            }
        }
        if (target >= mid && target <= a[end]) {
            return search(a, target, mid + 1, end);
        }else {

            return search(a, target, start, mid - 1);
        }
    }

}
