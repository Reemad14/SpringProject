package com.sapiens.SpringDemo.ioc;

public class Contact {
    String primaryMobileNo;
    String secondaryMobileNo;
    String emergencyContactNo;
    String emailId;
    String OfficialMailId;

    public String getPrimaryMobileNo() {
        return primaryMobileNo;
    }

    public void setPrimaryMobileNo(String primaryMobileNo) {
        this.primaryMobileNo = primaryMobileNo;
    }

    public String getSecondaryMobileNo() {
        return secondaryMobileNo;
    }

    public void setSecondaryMobileNo(String secondaryMobileNo) {
        this.secondaryMobileNo = secondaryMobileNo;
    }

    public String getEmergencyContactNo() {
        return emergencyContactNo;
    }

    public void setEmergencyContactNo(String emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getOfficialMailId() {
        return OfficialMailId;
    }

    public void setOfficialMailId(String officialMailId) {
        OfficialMailId = officialMailId;
    }
}
