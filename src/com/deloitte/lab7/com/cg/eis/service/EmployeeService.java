package com.deloitte.lab7.com.cg.eis.service;

import com.deloitte.lab7.com.cg.eis.bean.Employee;

public interface EmployeeService {
    void addEmployee(Employee emp);
    String findInsuranceScheme(double salary, String designation);
    void displayEmployeesByScheme(String scheme);
    void deleteEmployee(int id);
}
