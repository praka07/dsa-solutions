package com.dsa.solution.interview.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>(Arrays.asList(
                new User("John", 33),
                new User("Robert", 26),
                new User("Mark", 26),
                new User("Brandon", 42)));

        List<User> sortedList = userList.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
        userList.stream().filter(obj -> obj.getAge() > 30).skip(1).forEach(System.out::println);
        System.out.println("====+++++==");

        List<User> simple = userList.stream().sorted((o1, o2) -> {
            return o1.getAge() - o2.getAge();
        }).collect(Collectors.toList());
        simple.forEach(System.out::println);
        System.out.println("=====================");
        sortedList.forEach(System.out::println);
    }
}
