package com.dsa.solution.anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnderStandListOfList {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(i, new ArrayList<String>(Arrays.asList("")));
        }


        // insert specific postion
        list.get(0).set(0, "H");
        System.out.println(Arrays.asList(list.get(0)));
    }
}
