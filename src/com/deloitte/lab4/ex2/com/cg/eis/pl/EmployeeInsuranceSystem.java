package com.deloitte.lab4.ex2.com.cg.eis.pl;
import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;
import com.deloitte.lab4.ex2.com.cg.eis.service.EmployeeService;
import com.deloitte.lab4.ex2.com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeInsuranceSystem {

    public static void main(String[] args) {
        // instance of the EmployeeServiceImpl class
        EmployeeService employeeService = new EmployeeServiceImpl();

        Employee employee = employeeService.getEmployeeDetails();

        // insurance scheme for the employee
        String insuranceScheme = employeeService.findInsuranceScheme(employee);
        employee.setInsuranceScheme(insuranceScheme);
        employeeService.displayEmployeeDetails(employee);
    }
}
