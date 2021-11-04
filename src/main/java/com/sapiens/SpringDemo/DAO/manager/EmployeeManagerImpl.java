package com.sapiens.SpringDemo.DAO.manager;

import com.sapiens.SpringDemo.DAO.dao.EmployeeDAO;
import com.sapiens.SpringDemo.DAO.model.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager{
    @Autowired
    EmployeeDAO dao;
    @Override
    public EmployeeDTO createNewEmployee() {
        return dao.createNewEmployee();
    }
}
