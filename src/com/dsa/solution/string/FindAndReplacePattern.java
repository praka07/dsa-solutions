package com.dsa.solution.string;

import java.util.*;

// leet code 890
public class FindAndReplacePattern {
    public static void main(String[] args) {

        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abbcd";
        FindAndReplacePattern obj = new FindAndReplacePattern();
        System.out.println(Arrays.asList(obj.findAndReplacePattern(words, pattern)));

    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        String p = normalizePattern(pattern);

        for (String word : words) {
           if( p.equals(normalizePattern(word))) {
               ans.add(word);
           }
        }

        return ans;

    }

    private String normalizePattern(String pattern) {
        HashMap<Character, Integer> map = new HashMap<>();
        String ans = "";

        int len = pattern.length();
        for (int index = 0; index < len; index++) {
            map.putIfAbsent(pattern.charAt(index), map.size());
            ans += map.get(pattern.charAt(index));

        }


        return ans;
    }
}
