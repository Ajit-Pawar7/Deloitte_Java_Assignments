package com.deloitte.lab1.ex5;
public class Lab1Ex5 {

    public static int calculateSum(int n) {
        int count = 0; 
        int sum = 0; 
        int number = 1; 

        while (count < n) {
            if (number % 3 == 0 || number % 5 == 0) {
                sum += number;
                count++;
            }
            number++;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10; 
        
        int result = calculateSum(n);
        System.out.println("The sum of the first " + n + " natural numbers divisible by 3 or 5 is: " + result);
    }
}
