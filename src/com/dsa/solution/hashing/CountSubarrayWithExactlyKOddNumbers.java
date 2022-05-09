package com.dsa.solution.hashing;

import java.util.HashMap;

public class CountSubarrayWithExactlyKOddNumbers {
    public static void main(String[] args) {
        CountSubarrayWithExactlyKOddNumbers obj = new CountSubarrayWithExactlyKOddNumbers();
         obj.countSubarray(new int[]{2, 4, 1, 3, 8}, 2 );
        obj.countSubarrayOptimal(new int[]{2, 4, 1, 3, 8}, 2);
    }

    // Brute force solution
    public int countSubarray(int[] input, int k) {
        int count = 0;
        for (int sp = 0; sp < input.length; sp++) {
            for (int ep = sp; ep < input.length; ep++) {
                int tempCount = 0;
                for (int p = sp; p <= ep; p++) {
                    if ((input[p] % 2) != 0) {
                        tempCount++;
                    }
                }
                if (tempCount == k)
                    count++;
            }
        }

        System.out.println("total count BF " + count);
        return count;

    }

    // optimal solution
    public int countSubarrayOptimal(int[] inputs, int k) {
        int ans = 0;

        int[] inputVersion = new int[inputs.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        // place odd number as 1 and even number as 0
        for (int i = 0; i < inputs.length; i++) {
            if ((inputs[i] % 2) != 0) {
                inputVersion[i] = 1;

            }

        }
        int[] ps = new int[inputVersion.length + 1];
        ps[0] = 0;
        for (int i = 1; i <= inputVersion.length; i++) {
            ps[i] = ps[i - 1] + inputVersion[i - 1];

        }
        for (int j = 0; j < ps.length; j++) {
            if (map.containsKey(ps[j] - k)) {
                ans = ans + map.get(ps[j] - k);
            }
            map.put(ps[j], map.getOrDefault(ps[j], 0) + 1);
        }

        System.out.println("total count " + ans);
        return ans;
    }
}
