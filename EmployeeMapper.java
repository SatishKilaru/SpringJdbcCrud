package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpNo(rs.getInt("empno"));
		employee.seteName(rs.getString("ename"));
		employee.setJob(rs.getString("job"));
		employee.setSalary(rs.getDouble("sal"));
		return employee;
	}
}
