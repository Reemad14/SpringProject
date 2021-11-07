package com.sapiens.SpringDemo.DAO.manager;


import com.sapiens.SpringDemo.DAO.dao.StudentDAO;
import com.sapiens.SpringDemo.DAO.model.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentManager")
public class StudentManagerImpl implements StudentManager{
    @Autowired
    StudentDAO dao;
    @Override
    public StudentDTO createNewStudent() {
        return dao.createNewStudent();
    }
}
