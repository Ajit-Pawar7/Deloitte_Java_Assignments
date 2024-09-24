package com.deloitte.lab1.ex6;

public class Lab1Ex6 {

    public static int calculateDifference(int n) {
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i; 
            sum += i; 
        }
        int squareOfSum = sum * sum;

        int difference = squareOfSum - sumOfSquares;

        return difference;
    }
 static void main(String[] args) {
        int n = 10; 

        int result =calculateDifference(n);
        System.out.println("difference between the sum of squares and the square of the sum of the first " + n + " natural numbers is: " + result);
    }
}
