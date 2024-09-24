package com.deloitte.lab6.ex5;
import java.util.*;

public class lab5Ex5 {
    
    public int getSecondSmallest(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num); 
        }
        
        Collections.sort(list);
        
        return list.get(1); 
    }
    
    public static void main(String[] args) {
        lab5Ex5 exercise = new lab5Ex5();
        
        // Test input
        int[] numbers = {7, 2, 9, 4, 5};
        
        int secondSmallest = exercise.getSecondSmallest(numbers);
        
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}
