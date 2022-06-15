package com.dsa.solution.recursion;

public class Dice {
    public static void main(String[] args) {
        dice("", 2);
        System.out.println();


    }

    private static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <=6 && i<=target; i++) {
            System.out.println("-- executed -- ");
            dice(p + i, target - i);

        }
    }

}
