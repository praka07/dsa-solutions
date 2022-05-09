package com.dsa.solution.mockinterview;

public class LargestPalindrome {
    public static void main(String[] args) {
        LargestPalindrome object = new LargestPalindrome();
        System.out.println("max Length " + object.solve("abcaa"));

    }

    /**
     *
     * @param A
     * @return
     *
     * aaa
     *
     */
    public int solve(String A) {
        // varibale decalartion
        int maxLength = Integer.MIN_VALUE;
        // check largest palindrome
        // 0 -> N
        for (int i = 0; i < A.length(); i++) {
            // 0 -> N
            for (int j = 0; j < A.length(); j++) {
                // collect sub string
                StringBuilder sb = new StringBuilder();
                // 0 -> N
                for (int k = i; k <= j; k++) {
                    sb.append(A.charAt(k));
                }
                // O(N)
                if (isPalindrome(sb.toString())) {
                    maxLength = Math.max(maxLength, sb.toString().length());
                }
            }

        }
        return maxLength;
    }

    // method to check either string is palindrome or not
    public boolean isPalindrome(String input) {
        /**
         *
         *
         */
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

        //     // reverse string
        //     char[] ch=input.toCharArray();
        //     int chLength=ch.length;
        //     for(int i=0;i<ch.length/2;i++){
        //         char tempCh= ch[i];
        //         ch[i]=ch[chLength-i-1];
        //         ch[chLength-i-1]=tempCh;

        //     }
        //     String reverseString= new String(ch);
        //     // compare the string
        //     if(reverseString.equalsIgnoreCase(input)){
        //         return true;
        //     }

        //   return false;

    }
}
