package com.sapiens.SpringMVC.Employee.service;

import com.sapiens.SpringMVC.Employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    ArrayList<Employee> employees = new ArrayList<Employee>();
    @Override
    public List<Employee> findAll() {


        employees.add(new Employee(1,"Reema",25,"Java Developer", "Demo"));
        employees.add(new Employee(2,"Akaber",29,"C++ Developer", "Demo"));
        employees.add(new Employee(3,"Salma",24,"HR", "kjcv"));
        employees.add(new Employee(4,"Luzan",21,"Java Developer", "Demo123"));
        employees.add(new Employee(5,"Steve",32,"CEO", "Demo15"));

        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
