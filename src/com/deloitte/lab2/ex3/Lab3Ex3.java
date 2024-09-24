package com.deloitte.lab2.ex3;
import java.util.Arrays;

public class Lab3Ex3 {
    public static int[] getSorted(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseNumber(arr[i]);
        }

        Arrays.sort(arr);

        return arr;
    }
    private static int reverseNumber(int num) {
        String str = Integer.toString(num);
        
        // Reverse string
        String reversedStr = new StringBuilder(str).reverse().toString();  
        return Integer.parseInt(reversedStr);
    }

    public static void main(String[] args) {
        int[] array = {123, 456, 789, 321, 654};
        System.out.println("Original array: " + Arrays.toString(array));

        int[] sortedArray = getSorted(array);
        System.out.println("Sorted reversed array: " + Arrays.toString(sortedArray));
    }
}
