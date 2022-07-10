package com.project.bean;

public class Employee {

	private int empId;
	private String empName;
	private int pId;
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String empName, int pId) {
		super();
		this.setEmpId(empId);
		this.setEmpName(empName);
		this.setpId(pId);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}
	
}
