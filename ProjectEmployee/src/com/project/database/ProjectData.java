package com.project.database;

import com.project.bean.Project;

public class ProjectData {

	private static Project[] projectList = new Project[11];
	
	static {
		projectList[0] = new Project(1, "Admin", 0);
		projectList[1] = new Project(2, "Healthcare", 0);
		projectList[2] = new Project(3, "BIBA", 0);
		projectList[3] = new Project(4, "Insurance", 0);
		projectList[4] = new Project(5, "Finance", 0);
		projectList[5] = new Project(6, "CXT", 0);
		projectList[6] = new Project(7, "Management", 0);
		projectList[7] = new Project(8, "Web Tech", 0);
		projectList[8] = new Project(9, "ServiceNow", 0);
		projectList[9] = new Project(10, "Business Analytics", 0);
		projectList[10] = new Project(0, "On Bench", 0);
	}
	
	public static Project[] getProjectList() {
		return projectList;
	}
	
	public static void setEmployeeList(Project[] projectList) {
		ProjectData.projectList = projectList;
	}
}
