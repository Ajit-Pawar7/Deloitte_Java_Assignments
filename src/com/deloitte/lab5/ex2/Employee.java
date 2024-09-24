package com.deloitte.lab5.ex2;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void validateName() throws NameBlankException {
        if (firstName == null || firstName.isEmpty()) {
            throw new NameBlankException("First name is blank");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new NameBlankException("Last name is blank");
        }
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
