package com.deloitte.lab9.ex3;

import java.util.Scanner;

public class Lab9Ex3 {

    public static void main(String[] args) {
        Authentication auth = (username, password) -> {
            String validUsername = "admin";
            String validPassword = "password123";
            return username.equals(validUsername) && password.equals(validPassword);
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = auth.login(username, password);

        if (isAuthenticated) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }

    interface Authentication {
        boolean login(String username, String password);
    }
}
