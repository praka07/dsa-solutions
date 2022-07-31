package com.dsa.solution.dp;


import java.util.Scanner;

//print from 1 to N by i-1 not i+1
public class VeryBasic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value");
        int n = sc.nextInt();
        printName(1,n);
    }

    private static void printName(int i, int n) {

        if(i<1){
            return;
        }
        // keep this in mind, important line
        printName(i-1,n);
        System.out.println("prakash");
    }
}
