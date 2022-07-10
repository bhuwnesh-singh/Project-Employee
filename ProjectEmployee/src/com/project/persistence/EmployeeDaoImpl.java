package com.project.persistence;

import com.project.bean.Employee;
import com.project.bean.Project;
import com.project.database.EmployeeData;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public Employee searchRecord(int empId) {
		Employee[] employees=EmployeeData.getEmployeeList();
		for(int index=0;index<employees.length&&employees[index]!=null;index++) {
			if(employees[index].getEmpId()==empId)
				return employees[index];
		}
		return null;
	}

	@Override
	public Employee[] getAllRecords() {
		return EmployeeData.getEmployeeList();
	}

	@Override
	public boolean allocate(Employee emp, Project prj) {
		if(emp.getpId() == 0 && prj.getCount() < 10) {
			emp.setpId(prj.getProjectId());
			prj.setCount(prj.getCount()+ 1);
			return true;
		}
		return false;
	}

	@Override
	public boolean reallocate(Employee emp, Project prevPrj, Project newPrj) {
		if(emp.getpId() != 0 && newPrj.getCount() < 10) {
			prevPrj.setCount(prevPrj.getCount() - 1);
			emp.setpId(newPrj.getProjectId());
			newPrj.setCount(newPrj.getCount() + 1);
			return true;
		}
		return false;
	}

	@Override
	public Employee[] getRecordsbyProject(Project prj) {
		Employee [] employees = EmployeeData.getEmployeeList();
		Employee[] listByProject = new Employee[prj.getCount()];
		int i = 0;
			for(Employee emp : employees) {
				if(emp.getpId() == prj.getProjectId()) {
					listByProject[i] = emp;
					i++;
				}
			}
		return listByProject;
	}
	
	
}
