package com.dsa.solution.dp;

public class LetUsParty {

    public static void main(String[] args) {
        int n = 3;
        System.out.println("-- " + totalNumberofWay(n));
    }

    private static int totalNumberofWay(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return totalNumberofWay(n - 1) + (n - 1) * totalNumberofWay(n - 2);
    }


}
