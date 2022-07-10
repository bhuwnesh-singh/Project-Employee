package com.project.database;

import com.project.bean.Employee;

public class EmployeeData {
	
	private static Employee[] employeeList=new Employee[20];
	static {
		employeeList[0]= new Employee(101, "AAA", 0);
		employeeList[1]= new Employee(102, "BBB", 0);
		employeeList[2]= new Employee(103, "CCC", 0);
		employeeList[3]= new Employee(104, "DDD", 0);
		employeeList[4]= new Employee(105, "EEE", 0);
		employeeList[5]= new Employee(106, "FFF", 0);
		employeeList[6]= new Employee(109, "GGG", 0);
		employeeList[7]= new Employee(110, "HHH", 0);
		employeeList[8]= new Employee(111, "III", 0);
		employeeList[9]= new Employee(112, "JJJ", 0);
		employeeList[10]= new Employee(113, "KKK", 0);
		employeeList[11]= new Employee(114, "LLL", 0);
		employeeList[12]= new Employee(115, "MMM", 0);
		employeeList[13]= new Employee(116, "NNN", 0);
		employeeList[14]= new Employee(117, "OOO", 0);
		employeeList[15]= new Employee(118, "PPP", 0);
		employeeList[16]= new Employee(119, "QQQ", 0);
		employeeList[17]= new Employee(120, "RRR", 0);
		employeeList[18]= new Employee(121, "SSS", 0);
		employeeList[19]= new Employee(122, "TTT", 0);
	}
	
	public static Employee[] getEmployeeList() {
		return employeeList;
	}
	
	public static void setEmployeeList(Employee[] employeeList) {
		EmployeeData.employeeList = employeeList;
	}
}
