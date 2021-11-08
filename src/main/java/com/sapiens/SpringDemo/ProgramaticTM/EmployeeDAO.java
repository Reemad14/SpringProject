package com.sapiens.SpringDemo.ProgramaticTM;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private JdbcTemplate jdbcTemplate;
    private TransactionTemplate transactionTemplate;

    //Setter and Getter for jdbcTemplate
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //Setter and Getter for transactionTemplate

    public TransactionTemplate getTransactionTemplate() {
        return transactionTemplate;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    //Create A Table
    public void createTable(){
        String query = "CREATE TABLE Employee_ACCOUNT(ID INT, NAME VARCHAR(20), AGE INT, DESIG VARCHAR(30), SALARY INT, CONTACT VARCHAR(30))";
        jdbcTemplate.execute(query);
    }

    //Adding An Employee
    public void addEmployee(int id, String name, int age, String desig, int salary, String contact){
        String query = "INSERT INTO Employee_ACCOUNT VALUES("+id+",'"+name+"',"+age+",'"+desig+"',"+salary+",'"+contact+"')";
        jdbcTemplate.execute(query);
    }

    //View the data of the table
    public List<EmployeeAccount> getAllEmployee(){
        String query = "select * from Employee_ACCOUNT";
        return jdbcTemplate.query(query, new ResultSetExtractor<List<EmployeeAccount>>(){
            @Override
            public List<EmployeeAccount> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<EmployeeAccount> employeeAccounts = new ArrayList<EmployeeAccount>();
                while (rs.next()){
                    EmployeeAccount employeeAccount = new EmployeeAccount();
                    employeeAccount.setId(rs.getInt("id"));
                    employeeAccount.setName(rs.getString("name"));
                    employeeAccount.setAge(rs.getInt("age"));
                    employeeAccount.setDesig(rs.getString("desig"));
                    employeeAccount.setSalary(rs.getInt("salary"));
                    employeeAccount.setContact(rs.getString("contact"));
                    employeeAccounts.add(employeeAccount);
                }
                return employeeAccounts;
            }
        });
    }

    //Update Salary
    public void updateSalary(int id, int salary){
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                try{
                    getJdbcTemplate().update("update Employee_ACCOUNT set salary =  ? where id =?", salary, id);
                }catch (Exception e){
                    status.isRollbackOnly();
                } return null;
            }
        });
    }

    //Update contact number
    public void updateContact(int id, String contact){
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                try{
                    getJdbcTemplate().update("update Employee_ACCOUNT set contact =  ? where id =?", contact, id);
                }catch (Exception e){
                    status.isRollbackOnly();
                } return null;
            }
        });
    }

    //Update age
    public void updateAge(int id, int age){
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                try{
                    getJdbcTemplate().update("update Employee_ACCOUNT set age =  ? where id =?", age, id);
                }catch (Exception e){
                    status.isRollbackOnly();
                } return null;
            }
        });
    }

    //count of data
    public int countEmployee(){
        String query = "select count(*) from Employee_ACCOUNT";
        return jdbcTemplate.queryForObject(query, Integer.class);
    }


    //delete employee
     public void deleteEmployee(int id){
        String query = "DELETE FROM Employee_ACCOUNT WHERE ID =" +id;
        jdbcTemplate.execute(query);
    }

}
