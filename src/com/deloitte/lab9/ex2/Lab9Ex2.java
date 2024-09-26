package com.deloitte.lab9.ex2;

import java.util.Scanner;

public class Lab9Ex2 {

    public static void main(String[] args) {
        StringFormatter formatter = str -> String.join(" ", str.split(""));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = formatter.format(input);

        System.out.println("Formatted string: " + result);

        scanner.close(); 
    }

    interface StringFormatter {
        String format(String str);
    }
}
