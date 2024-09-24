package com.deloitte.lab3.ex8;
public class Lab3Ex8 {

    public static boolean isPositiveString(String input) {
        input = input.toUpperCase();
        
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) <= input.charAt(i - 1)) {
                return false;
            }
        } 

        return true;
    }

    public static void main(String[] args) {
        String input = "ANT"; 
                boolean result = isPositiveString(input);
        System.out.println("Is positive string: " + result);
    }
}
