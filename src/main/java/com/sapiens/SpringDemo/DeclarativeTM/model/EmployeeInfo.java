package com.sapiens.SpringDemo.DeclarativeTM.model;

public class EmployeeInfo {
    private int info_id;
    private String address;
    private String contact;
    private String emailID;

    public int getInfo_id() {
        return info_id;
    }

    public void setInfo_id(int info_id) {
        this.info_id = info_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "info_id=" + info_id +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", emailID='" + emailID + '\'' +
                '}';
    }
}
