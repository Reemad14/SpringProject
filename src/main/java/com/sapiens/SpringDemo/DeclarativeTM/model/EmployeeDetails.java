package com.sapiens.SpringDemo.DeclarativeTM.model;

public class EmployeeDetails {
    private int details_id;
    private String deptname;
    private String designation;
    private String  qualification;

    public int getDetails_id() {
        return details_id;
    }

    public void setDetails_id(int details_id) {
        this.details_id = details_id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "details_id=" + details_id +
                ", deptname='" + deptname + '\'' +
                ", designation='" + designation + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
