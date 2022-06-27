package com.dsa.solution.mcafee;

import java.util.List;
import java.util.Arrays;

public class WeightedAverage
{
    public static double mean(List<Integer> numbers, List<Integer> weights)
    {

        if(numbers==null || weights==null){
            throw new IllegalArgumentException();
        }

        if(numbers.size() !=weights.size()){
            throw new IllegalArgumentException();
        }

        int total = 0;
        int totalWeights = 0;
        for (int i = 0; i < numbers.size(); i++)
        {

            totalWeights=totalWeights+numbers.get(i) *weights.get(i);
            total += weights.get(i);
          //  totalWeights += weights.get(i);
        }


        return totalWeights / total;
    }

    public static void main(String[] args)
    {
        List<Integer> a = Arrays.asList(new Integer[] { 3, 6 });
        List<Integer> b = Arrays.asList(new Integer[] { 4, 2 });

        System.out.println(WeightedAverage.mean(a, b));
    }
}