package com.deloitte.lab6.ex2;


import java.util.HashMap;
import java.util.Map;

public class Lab6Ex2 {

    // Method to count occurrences of characters in the array
    public static Map<Character, Integer> countChars(char[] arr) {
        // Create a HashMap to store the character count
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character in the array
        for (char ch : arr) {
            // If the character is already in the map, increment the count
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // If the character is not in the map, add it with count 1
                charCountMap.put(ch, 1);
            }
        }
        return charCountMap;
    }

    // Main method to test the countChars function
    public static void main(String[] args) {
        // Sample character array
        char[] inputArray = { 'a', 'b', 'c', 'a', 'b', 'a', 'd', 'e' };

        // Call the method and store the result
        Map<Character, Integer> result = countChars(inputArray);

        // Print the result
        System.out.println("Character counts: " + result);
    }
}
