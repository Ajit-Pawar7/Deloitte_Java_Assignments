package com.deloitte.lab3.ex1;
import java.util.Scanner;

public class Lab3Ex1{

    public static void processInput(String input) {
        String[] tokens = input.split("\\s+");  
        int sum = 0;
        
        for (String token : tokens) {
            try {
                int number = Integer.parseInt(token);  // Convert token to int
                System.out.println("Integer: " + number);
                sum += number;  
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer: " + token);
            }
        }
                System.out.println("Sum of all integers: " + sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a line of integers separated by spaces:");
        String input = scanner.nextLine();
                processInput(input);
        
        scanner.close();
    }
}
