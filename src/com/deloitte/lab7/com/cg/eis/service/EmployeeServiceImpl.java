package com.deloitte.lab7.com.cg.eis.service;

import com.deloitte.lab7.com.cg.eis.bean.Employee;
import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public void addEmployee(Employee emp) {
        employeeMap.put(emp.getId(), emp);
    }

    @Override
    public String findInsuranceScheme(double salary, String designation) {
        if (salary > 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate")) {
            return "Scheme C";
        } else if (salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        } else if (salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        } else if (salary < 5000 && designation.equalsIgnoreCase("Clerk")) {
            return "No Scheme";
        }
        return "No Scheme";
    }

    @Override
    public void displayEmployeesByScheme(String scheme) {
        employeeMap.values().stream()
            .filter(emp -> emp.getInsuranceScheme().equalsIgnoreCase(scheme))
            .forEach(System.out::println);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeMap.remove(id);
    }
}
