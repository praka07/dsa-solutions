package com.dsa.solution.anonymous;

public class FizzBuzz {
    public static void main(String[] args) {

        fizzBuzz(15);

    }
    public static void fizzBuzz(int n) {
        // Write your code here

        for(int i=0;i<n;i++){
            if(i%15==0){
                System.out.println("FizzBUzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

    }
}
