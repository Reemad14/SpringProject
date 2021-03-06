package com.sapiens.SpringSecurity.employeeManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String dob;
    private String desig;
    private String dept;
    private int yearsOfEx;
    private int salary;

    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName, String dob, String desig, String dept, int yearsOfEx, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.desig = desig;
        this.dept = dept;
        this.yearsOfEx = yearsOfEx;
        this.salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getYearsOfEx() {
        return yearsOfEx;
    }

    public void setYearsOfEx(int yearsOfEx) {
        this.yearsOfEx = yearsOfEx;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", desig='" + desig + '\'' +
                ", dept='" + dept + '\'' +
                ", yearsOfEx=" + yearsOfEx +
                ", salary=" + salary +
                '}';
    }
}
