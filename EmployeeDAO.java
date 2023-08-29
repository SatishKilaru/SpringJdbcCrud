package com.example;

import java.util.List;

public interface EmployeeDAO {
	List<Employee> getAllEmployees();

	List<Employee> getfirst();

	Employee getEmployeeByEmpNo(Integer empNo);

	void createEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(Integer empNo);
}
