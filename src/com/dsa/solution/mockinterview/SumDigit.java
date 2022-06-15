package com.dsa.solution.mockinterview;

public class SumDigit {
    public static void main(String[] args) {
        int n=29;
        int sum=0;
        while(n>0){
            int remainder=n%10;
            sum=sum+remainder;
            n /=10;
        }
        System.out.println(sum);
    }
}
