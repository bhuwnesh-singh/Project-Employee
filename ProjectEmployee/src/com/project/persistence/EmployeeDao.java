package com.project.persistence;

import com.project.bean.Employee;
import com.project.bean.Project;

public interface EmployeeDao {
	
	Employee searchRecord(int empId);
	Employee[] getAllRecords();
	boolean allocate(Employee emp, Project prj);
	boolean reallocate(Employee emp, Project prevPrj,Project newPrj);
	Employee[] getRecordsbyProject(Project prj);
}
