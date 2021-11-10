package com.sapiens.SpringMVC.Employee.service;

import com.sapiens.SpringMVC.Employee.model.CompanyDetails;

import java.util.List;

public interface CompanyDetailsService {
    List<CompanyDetails> findAll();
}
