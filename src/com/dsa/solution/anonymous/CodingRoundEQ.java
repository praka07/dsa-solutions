package com.dsa.solution.anonymous;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String studentName;
    private int rollNumber;
    private int mark;
    private String standard;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", rollNumber=" + rollNumber +
                ", mark=" + mark +
                ", standard='" + standard + '\'' +
                '}';
    }

    Student(String name, int rno, int m, String std) {
        this.studentName = name;
        this.rollNumber = rno;
        this.mark = m;
        this.standard = std;


    }
}

public class CodingRoundEQ {
    public static void main(String[] args) {
        List<Student> lstStudent = new ArrayList<>();
        lstStudent.add(new Student("A", 1, 90, "b"));
        lstStudent.add(new Student("B", 2, 95, "b"));
        lstStudent.add(new Student("C", 3, 80, "b"));
        lstStudent.add(new Student("D", 1, 60, "b"));
        lstStudent.add(new Student("E", 2, 55, "b"));
        lstStudent.add(new Student("F", 3, 76, "b"));

        List<Student> ListDescStudents = lstStudent.stream().sorted(Comparator.comparing(Student::getMark).reversed()).collect(Collectors.toList());
        ListDescStudents.forEach(obj -> {
            if (obj.getMark() > 75) {
                System.out.println(Arrays.asList(obj));
            }

        });

    }

}
