package com.deloitte.lab5.ex3.com.cg.eis.exception;

class Employee {
 private String name;
 private double salary;

 public Employee(String name) {
     this.name = name;
 }

 public void setSalary(double salary) throws EmployeeException {
     if (salary < 3000) {
         throw new EmployeeException("Salary cannot be less than 3000.");
     }
     this.salary = salary;
 }

 public double getSalary() {
     return salary;
 }

 public String getName() {
     return name;
 }
}

public class Lab5Ex3 {
 public static void main(String[] args) {
     Employee emp = new Employee("John Doe");

     try {
         emp.setSalary(2500); //throwsexception
     } catch (EmployeeException e) {
         System.out.println("Caught Exception: " + e.getMessage());
     }
 }
}
