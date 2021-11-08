package com.sapiens.SpringDemo.DeclarativeTM.serviceImpl;

import com.sapiens.SpringDemo.DeclarativeTM.dao.EmployeeDAO;
import com.sapiens.SpringDemo.DeclarativeTM.model.Employee;
import com.sapiens.SpringDemo.DeclarativeTM.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public Employee getEmployee(int empId) {
        return employeeDAO.findEmployee(empId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    public void addEmployee(Employee emp) {
        employeeDAO.insertEmployee(emp);
    }
}
