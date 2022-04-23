package com.easy.solution.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    /*Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]*/
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character,Integer>,  ArrayList<String>> map= new HashMap<>();
        List<List<String>> result= new ArrayList<>();

        for(String str:strs){

            HashMap<Character,Integer> frequencyMap= new HashMap<>();
            for(int i=0;i<str.length();i++){
                frequencyMap.put(str.charAt(i),frequencyMap.getOrDefault(str.charAt(i),0)+1);
            }

            if(map.containsKey(frequencyMap)){
                map.get(frequencyMap).add(str);
            }else{
                ArrayList<String> temp= new ArrayList<String>();
                temp.add(str);
                map.put(frequencyMap,temp);

            }

        }

        for(HashMap<Character,Integer> res:map.keySet()){
            result.add(map.get(res));

        }
        return result;
    }
}
