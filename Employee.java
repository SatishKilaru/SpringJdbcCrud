package com.example;

public class Employee {
	private Integer empNo;
	private String eName;
	private String job;
	private Double salary;

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Employee(Integer empNo, String eName, String job, Double salary) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.salary = salary;
	}

	public Employee() {
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	// Constructors, getters, setters
}