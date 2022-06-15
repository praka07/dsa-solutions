package com.dsa.solution.string;

public class RabinKarpAlgorithm {
    public static void main(String[] args) {

        String text = "abcdefg";
        String pattern = "fg";
        // calculate hash code
        int n = text.length();
        int m = pattern.length();
        int p = 0;
        int t = 0;
        int index;
        int j;
        int d = 26;
        int q = 5381;
        int h = 1;
        for (index = 0; index < m - 1; index++) {
            h = (h * d) % q;
        }
        for ( index = 0; index < m; index++) {
            p = (d * p + pattern.charAt(index)) % q;
            t = (d * t + text.charAt(index)) % q;
        }

        for (index = 0; index <= n - m; index++) {

            if (p == t) {
                // found pattern match but check each character
                for (j = 0; j < m; j++) {
                    if (text.charAt(index + j) != pattern.charAt(j)) {
                        break;
                    }
                }
                if (j == m) {
                    System.out.println("found matching index ::: " + (index + 1));

                }
            }

            if (index < n - m) {
                // calculate hashcode by rolling hash
                t = (d * (t - text.charAt(index) * h) + text.charAt(index + m)) % q;
                if (t < 0)
                    t = (t + q);

            }


        }

    }

}
