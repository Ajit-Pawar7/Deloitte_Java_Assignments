package com.deloitte.lab2.ex2;
import java.util.Arrays;

public class Lab2Ex2 {

    public static String[] sortStrings(String[] arr) {
        Arrays.sort(arr);
        // Calculate the mid-point based on whether the length is odd or even
        int n = arr.length;
        int mid = (n % 2 == 0) ? n / 2 : (n / 2) + 1;

        // Convert the first half (or first mid elements) to uppercase
        for (int i = 0; i < mid; i++) {
            arr[i] = arr[i].toUpperCase();
        }

        // Convert the second half to lowercase
        for (int i = mid; i < n; i++) {
            arr[i] = arr[i].toLowerCase();
        }

        // Return the modified array
        return arr;
    }

    public static void main(String[] args) {
        // Test the method
        String[] testArray = {"banana", "apple", "kiwi", "orange", "grape"};
        String[] result = sortStrings(testArray);

        // Print the resulting array
        System.out.println("Modified array: " + Arrays.toString(result));
    }
}
