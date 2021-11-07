package com.sapiens.SpringDemo.DAO.controller;

import com.sapiens.SpringDemo.DAO.manager.StudentManager;
import com.sapiens.SpringDemo.DAO.model.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("studentController")
public class StudentController {
    @Autowired
    StudentManager manager;

    public StudentDTO createNewStudent(){
        return manager.createNewStudent();
    }
}
