package com.sapiens.SpringDemo.DAO.dao;

import com.sapiens.SpringDemo.DAO.model.StudentDTO;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDAOImpl implements StudentDAO{
    @Override
    public StudentDTO createNewStudent() {

        StudentDTO e = new StudentDTO();
        e.setRollno(12);
        e.setName("Susy");
        e.setGrade((float) 91.2);
        e.setPercentage((float) 89.01);
        return e;
    }
}
