package com.sapiens.SpringMVC.Employee.controller;

import com.sapiens.SpringMVC.Employee.model.CompanyDetails;
import com.sapiens.SpringMVC.Employee.model.Contact;
import com.sapiens.SpringMVC.Employee.model.Employee;
import com.sapiens.SpringMVC.Employee.service.CompanyDetailsService;
import com.sapiens.SpringMVC.Employee.service.ContactService;
import com.sapiens.SpringMVC.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CompanyDetailsService companyDetailsService;
    @Autowired
    private ContactService contactService;

    @GetMapping(value="/employee",produces = "application/json")
    public List<Employee> getEmployee(){
        List<Employee> employees = employeeService.findAll();
        return employees;
    }

    @PostMapping(path = "/employees", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
        Integer id = employeeService.findAll().size() + 1;

        employee.setId(id);

        employeeService.addEmployee(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    @GetMapping(value="/contact")
    public List<Contact> getContact(){
        List<Contact> contacts = contactService.findAll();
        return contacts;
    }

    @GetMapping(value="/company")
    public List<CompanyDetails> getCompany(){
        List<CompanyDetails> companies = companyDetailsService.findAll();
        return companies;
    }
}
