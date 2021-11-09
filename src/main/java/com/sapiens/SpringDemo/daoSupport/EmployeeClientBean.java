package com.sapiens.SpringDemo.daoSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeClientBean {
    @Autowired
    EmployeeService employeeService;

    public void run(){
        System.out.println("Persisting employee");

        Employee employee = Employee.create("Sarah",25,"Java Dev", 11000);
        employeeService.saveEmployee(employee);

        employee = Employee.create("Steve",27,"C++ Dev", 10000);
        employeeService.saveEmployee(employee);

        List<Employee> allEmployees = employeeService.getAllEmployees();
        System.out.println("Persons Loaded: "+allEmployees);

        employee = employeeService.getEmployeeById(62);
        System.out.println("Employee Loaded by id: "+ employee);

        System.out.println("Update the Employee with id 62 ");
        employee.setSalary(13000);
        employeeService.updateEmployee(employee);

        System.out.println("Deleting the Employee");
        employeeService.deleteEmployee(62);

        allEmployees = employeeService.getAllEmployees();
        System.out.println("Employees Loaded: "+allEmployees);
    }
}
