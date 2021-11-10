package com.sapiens.SpringMVC.Employee.service;

import com.sapiens.SpringMVC.Employee.model.CompanyDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyDetailsServiceImpl implements CompanyDetailsService{
    @Override
    public List<CompanyDetails> findAll() {
        ArrayList<CompanyDetails> companies = new ArrayList<CompanyDetails>();

        companies.add(new CompanyDetails("Sapiens", "Insurance software solutions"));
        companies.add(new CompanyDetails("Migdal", "Insurance Company"));

        return companies;
    }
}
