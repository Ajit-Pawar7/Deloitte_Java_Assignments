package com.deloitte.lab1.ex8;

public class Lab1Ex8 {

    public static boolean checkNumber(int n) {
        if (n <= 0) {
            return false;
        }
        
        while (n % 2 == 0) {
            n /= 2;
        }
        
        return n == 1;
    }
    
    public static void main(String[] args) {
        int number = 8; // Example number
        
        boolean result = checkNumber(number);
        System.out.println("Is the number " + number + " a power of two? " + result);
    }
}
