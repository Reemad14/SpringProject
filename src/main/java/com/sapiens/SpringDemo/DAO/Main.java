package com.sapiens.SpringDemo.DAO;

import com.sapiens.SpringDemo.DAO.manager.EmployeeManagerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        EmployeeManagerImpl manager = context.getBean(EmployeeManagerImpl.class);
        System.out.println(manager.createNewEmployee());
    }
}