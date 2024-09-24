package com.deloitte.lab4.ex2.com.cg.eis.service;

import java.util.Scanner;
import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    // Method to get employee details from the user
    @Override
    public Employee getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        
        System.out.print("Enter Employee Name: ");
        String name = sc.next();
        
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter Employee Designation: ");
        String designation = sc.next();

        // Create and return a new Employee object
        return new Employee(id, name, salary, designation);
    }

    // find the insurance
    @Override
    public String findInsuranceScheme(Employee employee) {
        double salary = employee.getSalary();
        String designation = employee.getDesignation();

        if (salary > 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate")) {
            return "Scheme C";
        } else if (salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        } else if (salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        } else if (salary < 5000 && designation.equalsIgnoreCase("Clerk")) {
            return "No Scheme";
        } else {
            return "No Scheme";
        }
    }

    //Showempl
    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println(employee.toString());
    }
}
