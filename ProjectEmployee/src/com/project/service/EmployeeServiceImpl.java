package com.project.service;

import com.project.bean.Employee;
import com.project.bean.Project;
import com.project.persistence.EmployeeDao;
import com.project.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao = new EmployeeDaoImpl();
	
	@Override
	public Employee[] getAllEmployees() {
		return employeeDao.getAllRecords();
	}
	
	@Override
	public Employee search(int empid) {
		// TODO Auto-generated method stub
		return employeeDao.searchRecord(empid);
	}
	
	@Override
	public boolean allocateProject(Employee emp, Project prj) {
		// TODO Auto-generated method stub
		return employeeDao.allocate(emp, prj);
	}
	
	@Override
	public boolean reallocateProject(Employee emp, Project prj1, Project prj2) {
		// TODO Auto-generated method stub
		return employeeDao.reallocate(emp, prj1, prj2);
	}

	@Override
	public Employee[] getEmployeebyProject(Project prj) {
		// TODO Auto-generated method stub
		return employeeDao.getRecordsbyProject(prj);
	}

	
}
