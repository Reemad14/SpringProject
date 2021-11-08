package com.sapiens.SpringDemo.DeclarativeTM.service;

import com.sapiens.SpringDemo.DeclarativeTM.model.Employee;

public interface EmployeeService {
    public Employee getEmployee(int empId);
    public void addEmployee(Employee emp);
}
