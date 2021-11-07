package com.sapiens.SpringDemo.DAO.model;

import org.springframework.stereotype.Component;

@Component
public class StudentDTO {
    private Integer rollno;
    private String name;
    private float grade;
    private float percentage;

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", percentage=" + percentage +
                '}';
    }
}
