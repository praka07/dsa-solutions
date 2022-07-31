package com.dsa.solution.generic;

import java.util.Arrays;
import java.util.List;

public class Infosys {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 4, 10, 12, 87, 33, 75);

        int[] sum = {0};

        numbers.forEach(obj -> {

            sum[0] += obj;


        });
        System.out.println(sum[0]);
    }

}
