package com.dsa.solution.mcafee;

import java.util.stream.*;
import java.util.*;

public class TestResults {
    public static class Student {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public String getName() {
            return name;
        }
    }

    class CustomComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getScore() - o1.getScore();
        }
    }

    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        List<Student> studentPass = students.filter(obj -> obj.getScore() >= passingScore).collect(Collectors.toList());
        Collections.sort(studentPass, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore() - o1.getScore();
            }
        });
        List<String> result = new ArrayList<>();
        for (Student student : studentPass) {
            result.add(student.getName());

        }


        return result;

    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Mike", 80));
        students.add(new Student("James", 57));
        students.add(new Student("Alan", 21));

        studentsThatPass(students.stream(), 50).forEach(System.out::println);
    }
}