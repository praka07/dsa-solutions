package com.dsa.solution.recursion;

public class Power {
    public static void main(String[] args) {
        Power obj = new Power();
        int base = 2;
        int p = 3;
        System.out.println(obj.calculate(base, p));
    }

    private int calculate(int base, int p) {
        if (p == 0) {
            return 1;
        }
        System.out.println(calculate(base, p - 1) * base);
        return calculate(base, p - 1) * base;
    }
}
