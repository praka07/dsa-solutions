package com.dsa.solution.recursion;

// number = 12345, result = 15
public class SumOfIntegerNumber {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(" result " + sum(n));
    }

    private static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        int reminder = n % 10;
        n = n / 10;
        return reminder + sum(n);
    }

}
