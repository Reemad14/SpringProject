package com.sapiens.SpringDemo.ioc;

import java.math.BigDecimal;

public class Address {
    String city;
    String state;
    String country;
    String pincode;
    BigDecimal PoBoxNumber;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public BigDecimal getPoBoxNumber() {
        return PoBoxNumber;
    }

    public void setPoBoxNumber(BigDecimal poBoxNumber) {
        PoBoxNumber = poBoxNumber;
    }
}
