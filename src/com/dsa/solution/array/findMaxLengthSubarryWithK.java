package com.dsa.solution.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findMaxLengthSubarryWithK {
    public static void main(String[] args) {
        findMaxLengthSubarryWithK obj = new findMaxLengthSubarryWithK();
        System.out.println(" max Length ::: " + obj.findMaxLengthSubarry(new int[]{9, 0, 2, -2, 1}));

    }

    public int findMaxLengthSubarry(int[] input) {

        int maxLength = Integer.MIN_VALUE;

       /* int[] prefixSum = new int[input.length + 1];
        prefixSum[0] = 0;
        for (int inputIndex = 1; inputIndex <= input.length; inputIndex++) {
            prefixSum[inputIndex] = prefixSum[inputIndex - 1] + input[inputIndex - 1];
        }*/

        List<Integer> psum = new ArrayList<>();
        psum.add(0);

        for (int num : input) {
            psum.add(psum.get(psum.size() - 1) + num);
        }

        int[] prefixSum = new int[psum.size()];
        int k = 0;
        for (int num : psum) {
            prefixSum[k++] = num;
        }
        //[0, 9, 9,11,9,10]
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int pIndex = 0; pIndex < prefixSum.length; pIndex++) {

            if (map.containsKey(prefixSum[pIndex] - 0)) {
                //
                int length = pIndex - map.get(prefixSum[pIndex]);
                maxLength = Math.max(maxLength, length);
            } else {
                map.put(prefixSum[pIndex], pIndex);
            }


        }

        return maxLength;
    }
}
