package com.easy.solution.generic;

public class PrimeNumber {
    static boolean isPrime(int n){
        //since 0 and 1 is not prime return false.
        if(n==1||n==0)return false;

        //Run a loop from 2 to square root of n
        for(int i=2; i*i<=n; i++){
            // if the number is divisible by i, then n is not a prime number.
            if(n%i==0)return false;
        }
        //otherwise, n is prime number.
        return true;
    }


    // Driver code
    public static void main (String[] args)
    {
        int N = 100;
        //check for every number from 1 to N
        for(int i=1; i<=N; i++){
            //check if current number is prime
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
