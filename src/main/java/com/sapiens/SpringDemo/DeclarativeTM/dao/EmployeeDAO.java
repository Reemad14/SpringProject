package com.sapiens.SpringDemo.DeclarativeTM.dao;

import com.sapiens.SpringDemo.DeclarativeTM.model.Employee;

public interface EmployeeDAO {
    public Employee findEmployee(int empId);
    public void insertEmployee(Employee emp);
}
