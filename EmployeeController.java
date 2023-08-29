package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	private final EmployeeDAO employeeDAO;

	@Autowired
	public EmployeeController(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@RequestMapping("/list")
	public String listEmployees(Model model) {
		System.out.print("satish");
		List<Employee> employees = employeeDAO.getAllEmployees();

		model.addAttribute("employees", employees);
		return "employee-list"; // Return the name of the JSP view file
	}

	@RequestMapping("/first")
	public String getfirst(Model model) {
		System.out.print("satish");
		List<Employee> employees = employeeDAO.getfirst();

		model.addAttribute("employees", employees);
		return "employee-list"; // Return the name of the JSP view file
	}

}
