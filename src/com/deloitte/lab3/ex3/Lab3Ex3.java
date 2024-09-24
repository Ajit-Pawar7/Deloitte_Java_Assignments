package com.deloitte.lab3.ex3;
public class Lab3Ex3 {

    public static String alterString(String input) {
        StringBuilder result = new StringBuilder();
        
        String vowels = "AEIOUaeiou";
                for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch) && !vowels.contains(String.valueOf(ch))) {
                if (ch == 'Z') {
                    result.append('A'); 
                } else if (ch == 'z') {
                    result.append('a'); 
                } else {
                    result.append((char) (ch + 1)); 
                }
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Ajit"; 
                String result = alterString(input);
        System.out.println("Output: " + result);
    }
}
