package com.deloitte.lab9.ex5;

import java.util.Scanner;

public class Lab9Ex5 {

    public static void main(String[] args) {
        MathOperation mathOperation = Lab9Ex5::calculateFactorial;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        int result = mathOperation.operate(number);

        System.out.println("Factorial of " + number + " is: " + result);

        scanner.close(); 
    }

    public static int calculateFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact; }

    interface MathOperation {
        int operate(int num);
    }
}
