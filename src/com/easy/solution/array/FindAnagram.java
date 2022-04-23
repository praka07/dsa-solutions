package com.easy.solution.array;

public class FindAnagram {
    public boolean isAnagram(String s, String t) {
        int[] count= new int[26];

        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int c=0;c<count.length;c++){
            if(count[c]!=0){
                return false;
            }
        }
        return true;
    }
}
