package com.sapiens.SpringDemo.DeclarativeTM.config;

import com.sapiens.SpringDemo.DeclarativeTM.model.Employee;
import com.sapiens.SpringDemo.DeclarativeTM.model.EmployeeDetails;
import com.sapiens.SpringDemo.DeclarativeTM.model.EmployeeInfo;
import com.sapiens.SpringDemo.DeclarativeTM.service.EmployeeService;
import com.sapiens.SpringDemo.DeclarativeTM.serviceImpl.EmployeeServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        EmployeeService employeeService = context.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
//        employeeService.addEmployee(createEmployee());
        employeeService.getEmployee(230);
        context.registerShutdownHook();
    }

    private static Employee createEmployee() {
        Employee employee = new Employee();
        EmployeeDetails employeeDetails = new EmployeeDetails();
        EmployeeInfo employeeInfo = new EmployeeInfo();

        employee.setEmp_id(230);
        employee.setName("Dana");
        employee.setAge(27);
        employee.setSalary(11000);

        employeeDetails.setDetails_id(employee.getEmp_id());
        employeeDetails.setDeptname("development");
        employeeDetails.setDesignation("Java dev");
        employeeDetails.setQualification("demo");
        employee.setEmployeeDetails(employeeDetails);

        employeeInfo.setInfo_id(employee.getEmp_id());
        employeeInfo.setAddress("SD street");
        employeeInfo.setContact("03-2223");
        employeeInfo.setEmailID("demo@example.com");
        employee.setEmployeeInfo(employeeInfo);

        return employee;
    }
}
