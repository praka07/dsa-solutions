package com.dsa.solution.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/generate-parentheses/
public class GenerateParentheses {
    List<String> lst = new ArrayList<>();

    public static void main(String[] args) {
        GenerateParentheses obj = new GenerateParentheses();

        obj.generateParenthesis("", 0, 2);
        System.out.println(Arrays.asList(obj.lst));

    }

    public void generateParenthesis(String curr, int score, int n) {

        if (score < 0) {
            return;
        }

        if (curr.length() > (2 * n)) {
            return;

        }
        if (curr.length() == (2 * n) && score == 0) {
            lst.add(curr);
            return;
        }

        generateParenthesis(curr + "(", score + 1, n);

        generateParenthesis(curr + ")", score - 1, n);

        return;
    }
}
