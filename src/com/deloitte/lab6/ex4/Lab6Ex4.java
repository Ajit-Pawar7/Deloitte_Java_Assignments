package com.deloitte.lab6.ex4;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex4 {

    public static Map<Integer, String> getStudents(Map<Integer, Integer> studentMarks) {
        Map<Integer, String> medalMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
            int regNo = entry.getKey(); // Student registration number
            int marks = entry.getValue(); // Student marks

            if (marks >= 90) {
                medalMap.put(regNo, "Gold");
            } else if (marks >= 80 && marks < 90) {
                medalMap.put(regNo, "Silver");
            } else if (marks >= 70 && marks < 80) {
                medalMap.put(regNo, "Bronze");
            }
        }

        return medalMap;
    }

    public static void main(String[] args) {
        // Sample HashMap containing student registration numbers and their marks
        Map<Integer, Integer> studentMarks = new HashMap<>();
        studentMarks.put(101, 95); 
        studentMarks.put(102, 85); 
        studentMarks.put(103, 75); 
        studentMarks.put(104, 65); 

        Map<Integer, String> result = getStudents(studentMarks);

        // Print the result
        System.out.println("Students eligible for medals: " + result);
    }
}
