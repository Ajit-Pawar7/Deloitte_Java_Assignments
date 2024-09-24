package com.deloitte.lab5.ex2;
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("", "Smith");

        try {
            employee.validateName();
        } catch (NameBlankException e) {
            // Handling
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
