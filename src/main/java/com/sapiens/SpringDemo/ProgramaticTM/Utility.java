package com.sapiens.SpringDemo.ProgramaticTM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

public class Utility {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\SpringProject\\SpringProject\\src\\main\\resources\\Beans.xml");
        EmployeeDAO employeeDAO = context.getBean("EmployeeDAOBean", EmployeeDAO.class );

        //Create a table
        System.out.println("Create a table");
        employeeDAO.createTable();

        //Adding data to the table
        System.out.println("Adding data to the table");
        employeeDAO.addEmployee(1,"Reema",25,"developer",11000,"0354263");
        employeeDAO.addEmployee(2,"Sarah",22,"HR",9000,"0359863");
        employeeDAO.addEmployee(3,"John",28,"Java developer",11000,"0312263");
        employeeDAO.addEmployee(4,"Ruba",29,"C++ developer",12000,"0359065");
        employeeDAO.addEmployee(5,"Steve",35,"CEO",25000,"0350098");
        employeeDAO.addEmployee(6,"Sam",30,"Dev Director",17000,"0359235");
        employeeDAO.addEmployee(7,"Malak",22,"HR",12000,"0312065");

        //Extracting the data
        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees = employeeDAO.getAllEmployee();
        for(EmployeeAccount employeeAccount: allEmployees){
            System.out.println("Employee's ID: " + employeeAccount.getId());
            System.out.println("Employee's Name: "+ employeeAccount.getName());
            System.out.println("Employee's age: "+ employeeAccount.getAge());
            System.out.println("Employee's desig: "+ employeeAccount.getDesig());
            System.out.println("Employee's salary: "+ employeeAccount.getSalary());
            System.out.println("Employee's contact: "+ employeeAccount.getContact());
        }

        //For employee id 3 update the salary with 20k, and for emp 6 update the salary with 7k.
        System.out.println("Updating the salary of emp with id = 3 and id = 6");
        employeeDAO.updateSalary(3,20000);
        employeeDAO.updateSalary(6,7000);

        //Extracting the data
        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees1 = employeeDAO.getAllEmployee();
        for(EmployeeAccount employeeAccount: allEmployees1){
            System.out.println("Employee's ID: " + employeeAccount.getId());
            System.out.println("Employee's Name: "+ employeeAccount.getName());
            System.out.println("Employee's age: "+ employeeAccount.getAge());
            System.out.println("Employee's desig: "+ employeeAccount.getDesig());
            System.out.println("Employee's salary: "+ employeeAccount.getSalary());
            System.out.println("Employee's contact: "+ employeeAccount.getContact());
        }


        //For Employee 4, 7 update their contact numbers
        System.out.println("Updating the contact number of emp with id = 4 and id = 7");
        employeeDAO.updateContact(4,"0345362");
        employeeDAO.updateContact(7,"0300000");

        //Extracting the data
        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees2 = employeeDAO.getAllEmployee();
        for(EmployeeAccount employeeAccount: allEmployees2){
            System.out.println("Employee's ID: " + employeeAccount.getId());
            System.out.println("Employee's Name: "+ employeeAccount.getName());
            System.out.println("Employee's age: "+ employeeAccount.getAge());
            System.out.println("Employee's desig: "+ employeeAccount.getDesig());
            System.out.println("Employee's salary: "+ employeeAccount.getSalary());
            System.out.println("Employee's contact: "+ employeeAccount.getContact());
        }

        //For Employee 2, 5 update their age
        System.out.println("Updating the age of emp with id = 2 and id = 5");
        employeeDAO.updateAge(2,30);
        employeeDAO.updateAge(5,38);

        //Extracting the data
        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees3 = employeeDAO.getAllEmployee();
        for(EmployeeAccount employeeAccount: allEmployees3){
            System.out.println("Employee's ID: " + employeeAccount.getId());
            System.out.println("Employee's Name: "+ employeeAccount.getName());
            System.out.println("Employee's age: "+ employeeAccount.getAge());
            System.out.println("Employee's desig: "+ employeeAccount.getDesig());
            System.out.println("Employee's salary: "+ employeeAccount.getSalary());
            System.out.println("Employee's contact: "+ employeeAccount.getContact());
        }
        //Count employees before dropping the 1st emp
        System.out.println("Count of Employees before dropping the 1st emp: "+ employeeDAO.countEmployee());

        //Drop the employee id 1, as he/ she has resigned the job
        System.out.println("Drop the employee id 1, as he/ she has resigned the job");
        employeeDAO.deleteEmployee(1);

        //Count employees after dropping the 1st emp
        System.out.println("Count of Employees after dropping the 1st emp: "+ employeeDAO.countEmployee());

        //Extracting the data
        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees4 = employeeDAO.getAllEmployee();
        for(EmployeeAccount employeeAccount: allEmployees4){
            System.out.println("Employee's ID: " + employeeAccount.getId());
            System.out.println("Employee's Name: "+ employeeAccount.getName());
            System.out.println("Employee's age: "+ employeeAccount.getAge());
            System.out.println("Employee's desig: "+ employeeAccount.getDesig());
            System.out.println("Employee's salary: "+ employeeAccount.getSalary());
            System.out.println("Employee's contact: "+ employeeAccount.getContact());
        }
    }
}
