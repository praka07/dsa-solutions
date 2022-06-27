package com.dsa.solution.zenda.interview;

import java.util.HashMap;
import java.util.Map;

public class FindOutUniqueNumber {
    public static void main(String[] args) {
        int[] input = {10, 1, 5, 1, 10, 4, 4};
        FindOutUniqueNumber obj= new FindOutUniqueNumber();
        obj.optimalSolution(input);
    }

    public void bruteForceApproach(int[] input) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int index = 0; index < input.length; index++) {

            if (!frequencyMap.containsKey(input[index])) {
                frequencyMap.put(input[index], 1);

            } else {
                frequencyMap.put(input[index], frequencyMap.get(input[index]) + 1);
            }
            // frequencyMap.put(frequencyMap.getOrDefault(input[index],frequencyMap.get(input[index]))+1);

        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }

    public void optimalSolution(int[] input) {

        int uniqueNumber=input[0];
        for (int i = 1; i < input.length; i++) {

            uniqueNumber ^= input[i];

        }

        System.out.println(uniqueNumber);
    }

}
