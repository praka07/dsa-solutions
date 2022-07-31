package com.dsa.solution.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//916. Word Subsets
public class WordSubsets {
    public static void main(String[] args) {
        WordSubsets obj = new WordSubsets();
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"l", "e"};
        System.out.println(Arrays.asList(obj.wordSubsets(words1, words2)));

    }

    public List<String> wordSubsets(String[] words1, String[] words2) {

        List<String> ans = new ArrayList<String>();

        HashMap<Character, Integer> freq;

        for (String word1 : words1) {
            freq = new HashMap<Character, Integer>();
            for (char ch : word1.toCharArray()) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
            if (checkOcurrance(freq, words2)) {
                ans.add(word1);
            }
        }
        return ans;
    }

    public boolean checkOcurrance(HashMap<Character, Integer> freq, String[] words2) {

        for (String word2 : words2) {
            int len = 0;
            for (char w2 : word2.toCharArray()) {
                if (freq.containsKey(w2)) {
                    len++;
                }

            }
            if (word2.length() == len) {
                return true;
            }
        }

        return false;
    }
}
