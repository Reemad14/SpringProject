package com.sapiens.SpringDemo.DAO.dao;

import com.sapiens.SpringDemo.DAO.model.EmployeeDTO;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public EmployeeDTO createNewEmployee() {
        EmployeeDTO e = new EmployeeDTO();
        e.setId(4);
        e.setName("Steve");
        e.setAge(30);
        e.setGender("Male");
        e.setDesignation("Developer");
        e.setQualification("Master");
        return e;

    }
}
