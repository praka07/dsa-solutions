package com.dsa.solution.dp;

public class Recursive {
    int[] fib_cache = new int[31];

    public int fib(int N) {
        if (N <= 1)
            return N;
        else if (fib_cache[N] != 0)
            return fib_cache[N];
        else
            fib_cache[N] = fib(N - 1) + fib(N - 2);
        System.out.println(fib_cache[N]);
        return fib_cache[N];

    }

    public static void main(String[] args) {
        Recursive obj = new Recursive();
        System.out.println(" ans " + obj.fib(5));
    }
}
