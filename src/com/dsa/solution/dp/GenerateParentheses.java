package com.dsa.solution.dp;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    List<String> lst = new ArrayList<String>();

    public List<String> generateParenthesis(int n) {

        ok("", 0, n);
        return lst;

    }

    public void ok(String curr, int score, int n) {

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


        ok(curr + "(", score + 1, n);
        ok(curr + ")", score - 1, n);
        return;
    }
}
