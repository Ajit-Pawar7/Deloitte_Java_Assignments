package com.deloitte.lab1.ex7;

public class Lab1Ex7 {
    public static boolean checkNumber(int number) {
        String numStr = Integer.toString(number);
        
        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 134468; //For ex no.
        boolean result = checkNumber(number);
        System.out.println("Is the number " + number + " an increasing number? " + result);
    }
}
