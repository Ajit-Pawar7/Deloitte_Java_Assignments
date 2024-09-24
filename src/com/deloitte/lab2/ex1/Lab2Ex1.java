package com.deloitte.lab2.ex1;
import java.util.Arrays;

public class Lab2Ex1 {

    public static int getSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
                Arrays.sort(arr);
        return arr[1];
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 5, 30, 40};
        System.out.println("Original array: " + Arrays.toString(array));

        try {
            int secondSmallest = getSecondSmallest(array);
            System.out.println("The second smallest element is: " + secondSmallest);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
