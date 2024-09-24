package com.deloitte.lab7.com.cg.eis.pl;

import com.deloitte.lab7.com.cg.eis.bean.Employee;
import com.deloitte.lab7.com.cg.eis.service.EmployeeService;
import com.deloitte.lab7.com.cg.eis.service.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeInsuranceSystem {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Display Employees by Insurance Scheme");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    System.out.print("Enter Designation: ");
                    String designation = sc.next();

                    String insuranceScheme = service.findInsuranceScheme(salary, designation);
                    Employee employee = new Employee(id, name, salary, designation, insuranceScheme);
                    service.addEmployee(employee);
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Insurance Scheme: ");
                    String scheme = sc.next();
                    service.displayEmployeesByScheme(scheme);
                    break;

                case 3:
                    System.out.print("Enter Employee ID to delete: ");
                    int empId = sc.nextInt();
                    service.deleteEmployee(empId);
                    System.out.println("Employee deleted successfully!");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
}
