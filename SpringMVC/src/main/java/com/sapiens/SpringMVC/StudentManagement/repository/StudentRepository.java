package com.sapiens.SpringMVC.StudentManagement.repository;

import com.sapiens.SpringMVC.StudentManagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
