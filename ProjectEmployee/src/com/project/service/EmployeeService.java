package com.project.service;

import com.project.bean.Employee;
import com.project.bean.Project;

public interface EmployeeService {
	
	Employee[] getAllEmployees();
	Employee search(int empid);
	boolean allocateProject(Employee emp, Project prj);
	boolean reallocateProject(Employee emp, Project prj1, Project prj2);
	Employee[] getEmployeebyProject(Project prj);
}
