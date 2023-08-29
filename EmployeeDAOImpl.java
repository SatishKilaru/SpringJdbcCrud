package com.example;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public EmployeeDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public EmployeeDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Employee> getAllEmployees() {
		String sql = "SELECT * FROM emp24";
		return jdbcTemplate.query(sql, new EmployeeMapper());
	}

	public List<Employee> getfirst() {
		String sql = "SELECT * FROM emp24 Limit 1";
		return jdbcTemplate.query(sql, new EmployeeMapper());
	}

	public Employee getEmployeeByEmpNo(Integer empNo) {
		String sql = "SELECT * FROM emp24 WHERE empno = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { empNo }, new EmployeeMapper());
	}

	public void createEmployee(Employee employee) {
		String sql = "INSERT INTO emp24 (deptno, ename, job, sal) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, employee.getEmpNo(), employee.geteName(), employee.getJob(), employee.getSalary());
	}

	public void updateEmployee(Employee employee) {
		String sql = "UPDATE emp24 SET deptno = ?, ename = ?, job = ?, sal = ? WHERE empno = ?";
		jdbcTemplate.update(sql, employee.getEmpNo(), employee.geteName(), employee.getJob(), employee.getSalary(),
				employee.getEmpNo());
	}

	public void deleteEmployee(Integer empNo) {
		String sql = "DELETE FROM emp24 WHERE empno = ?";
		jdbcTemplate.update(sql, empNo);
	}
}
