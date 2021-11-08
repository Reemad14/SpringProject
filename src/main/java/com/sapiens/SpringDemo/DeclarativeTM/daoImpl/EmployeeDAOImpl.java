package com.sapiens.SpringDemo.DeclarativeTM.daoImpl;

import com.sapiens.SpringDemo.DeclarativeTM.dao.EmployeeDAO;
import com.sapiens.SpringDemo.DeclarativeTM.model.Employee;
import com.sapiens.SpringDemo.DeclarativeTM.model.EmployeeDetails;
import com.sapiens.SpringDemo.DeclarativeTM.model.EmployeeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Employee findEmployee(int empId) {
        final String SELECT_BY_ID_QUERY = "select emp.emp_id, name, age, salary, deptname, designation, qualification, address, contact, emailID" +
                                            " from employee emp, employee_details det, personal_info info"+
                                            " where emp.emp_id = det.details_id and emp.emp_id = info.info_id and info.info_id = ?";
        return this.jdbcTemplate.queryForObject(SELECT_BY_ID_QUERY,new EmployeeMapper(), empId);
    }

    private static final class EmployeeMapper implements RowMapper<Employee> {

        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

            Employee emp = new Employee();
            EmployeeDetails det = new EmployeeDetails();
            EmployeeInfo info = new EmployeeInfo();

            emp.setEmp_id(rs.getInt("emp_id"));
            emp.setName(rs.getString("name"));
            emp.setAge(rs.getInt("age"));
            emp.setSalary(rs.getInt("salary"));

            det.setDeptname(rs.getString("deptname"));
            det.setDesignation(rs.getString("designation"));
            det.setQualification(rs.getString("qualification"));
            emp.setEmployeeDetails(det);

            info.setAddress(rs.getString("address"));
            info.setContact(rs.getString("contact"));
            info.setEmailID(rs.getString("emailID"));
            emp.setEmployeeInfo(info);

            return emp;
        }
    }

    @Override
    public void insertEmployee(Employee emp) {
        final String INSERT_EMP_QUERY = "insert into employee(emp_id, name, age,salary)values (?,?,?,?)";
        final String INSERT_DET_QUERY = "insert into employee_details(details_id, deptname, designation, qualification) values (?,?,?,?)";
        final String INSERT_INFO_QUERY = "insert into personal_info(info_id, address, contact, emailID) values (?,?,?,?)";

        jdbcTemplate.update(INSERT_EMP_QUERY, emp.getEmp_id(), emp.getName(), emp.getAge(), emp.getSalary());
        System.out.println("Employee inserted Successfully");

        jdbcTemplate.update(INSERT_DET_QUERY,emp.getEmp_id(), emp.getEmployeeDetails().getDeptname(), emp.getEmployeeDetails().getDesignation(), emp.getEmployeeDetails().getQualification());
        System.out.println("Address inserted successfully");

        jdbcTemplate.update(INSERT_INFO_QUERY,emp.getEmp_id(), emp.getEmployeeInfo().getAddress(), emp.getEmployeeInfo().getContact(), emp.getEmployeeInfo().getEmailID());
        System.out.println("Address inserted successfully");
    }
}
