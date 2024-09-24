package com.deloitte.lab1.ex1;
public class Lab1Ex1 {

    public static int sumOfCubes(int number) {
        int sum = 0;
        
        number = Math.abs(number);
        
        while (number > 0) {
            int digit = number % 10; 
            sum += Math.pow(digit, 3); 
            number /= 10; 
        }
        
        return sum;
    }

    public static void main(String[] args) {
        
        int number = 123;
        
        
        int result = sumOfCubes(number);
        System.out.println("The sum of the cubes of the digits of " + number + " is: " + result);
    }
}
