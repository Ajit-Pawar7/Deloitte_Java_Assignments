package com.deloitte.lab6.ex7;

import java.util.*;

public class Lab6Ex7 {
    
    public int[] getSorted(int[] arr) {
        List<Integer> reversedList = new ArrayList<>();
        
        for (int num : arr) {
            StringBuilder str = new StringBuilder(String.valueOf(num)); // Convert to StringExercise
            int reversedNum = Integer.parseInt(str.reverse().toString()); // Reverse and convert back to int
            reversedList.add(reversedNum); // Add reversed number to the list
        }
        
        Collections.sort(reversedList);
                int[] sortedArr = new int[reversedList.size()];
        for (int i = 0; i < reversedList.size(); i++) {
            sortedArr[i] = reversedList.get(i);
        }
        return sortedArr;
    }
    public static void main(String[] args) {
        Lab6Ex7 exercise = new Lab6Ex7();
        
        int[] numbers = {432, 789, 123, 456};
        
        int[] sortedArray = exercise.getSorted(numbers);
        
        // Display the result
        System.out.println("Sorted array after reversing numbers: " + Arrays.toString(sortedArray));
    }
}
