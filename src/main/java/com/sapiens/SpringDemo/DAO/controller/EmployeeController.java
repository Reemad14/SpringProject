package com.sapiens.SpringDemo.DAO.controller;

import com.sapiens.SpringDemo.DAO.manager.EmployeeManager;
import com.sapiens.SpringDemo.DAO.model.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("employeeController")
public class EmployeeController {
    @Autowired
    EmployeeManager manager;

    public EmployeeDTO createNewEmployee(){
        return manager.createNewEmployee();
    }
}
