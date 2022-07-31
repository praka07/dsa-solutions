package com.dsa.solution.recursion;

import java.util.HashSet;

public class ScalerFailureProblem {
    public static void main(String[] args) {
        String i="gk";
        HashSet<String> set= new HashSet<>();
       count("",i,set);
    }

    private static void count(String p, String up,HashSet<String> set) {
        if(up.isEmpty()){
            System.out.println(p);
            if(!p.isEmpty()){
                set.add(p);

            }
           return;
        }

        char ch= up.charAt(0);
        count(p+ch,up.substring(1),set);
        count(p,up.substring(1),set);

    }
}
