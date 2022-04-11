package com.easy.solution.array;

/**
 * find how many subsequence of string "ag" are present in given string
 * eg : abcgag => answer is 3
 * subsequence can be derived after deleting some elements but order remain the same
 */
public class SpecialSubsequence {
    public static void main(String[] args) {
        String input = "abcgag";
        //brute force
        int count = 0;
        int ans=0;
        int countOfSubsequence=0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                for (int j = i+1; j < input.length(); j++) {
                    if (input.charAt(j) == 'g') {
                        count++;
                    }
                }
            }
        }
        System.out.println("BF answer "+count);

        // optimal solution
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)=='g'){
                countOfSubsequence++;
            }
            if(input.charAt(i)=='a'){
                ans=ans+countOfSubsequence;
            }
        }
        System.out.println("Optimal solution answer "+ans);
    }



}
