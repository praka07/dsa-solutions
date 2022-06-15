package com.dsa.solution.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        LetterCombinationPhoneNumber obj = new LetterCombinationPhoneNumber();
        System.out.println(obj.letterCombinations("", digits));

    }

    public List<String> letterCombinations(String p, String up) {

        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }


        int digit = up.charAt(0) - '0';
        List<String> res = new ArrayList<>();
        for (int i = (digit - 2) * 3; i < digit+1; i++) {
            char ch = (char) ('a' + i);
            res.addAll(letterCombinations(p + ch, up.substring(1)));
        }
        return res;
    }

}
