package com.dsa.solution.array;

//https://www.pramp.com/question/N5LYMbYzyOtbpovQoYPX
public class ShiftArrayWithoutOffset {
    public static void main(String[] args) {
        ShiftArrayWithoutOffset obj = new ShiftArrayWithoutOffset();
        System.out.println("index " + obj.shiftedArrSearch(new int[]{2}, 2));

    }

    public int shiftedArrSearch(int[] shiftArr, int num) {
        // 1. find pivot point
        int pivotPoint = findPivotPoint(shiftArr);
   /*     Once we have found the pivot point and split the array, we can apply binary
        search only on the relevant sub-array and ignore the other
        sub-array. The relevant sub-array would satisfy: subArr[0] ≤ num ≤ subArr[n-1].*/
        if (pivotPoint == 0 || num < shiftArr[0]) {
            return binarySearch(shiftArr, pivotPoint, shiftArr.length - 1, num);
        }


        return binarySearch(shiftArr, 0, pivotPoint - 1, num);
    }

    private int binarySearch(int[] shiftArr, int low, int high, int num) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (shiftArr[mid] < num) {
                low = mid + 1;
            } else if (shiftArr[mid] == num) {
                return mid;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private int findPivotPoint(int[] shiftArr) {

        int low = 0;
        int high = shiftArr.length - 1;
        while (low <= high) {
            int mid = low + (int) Math.floor((high - low) / 2);
            if (mid == 0 || shiftArr[mid - 1] > shiftArr[mid]) {
                return mid;
            } else if (shiftArr[mid] > shiftArr[0]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }


        return 0;
    }
}
