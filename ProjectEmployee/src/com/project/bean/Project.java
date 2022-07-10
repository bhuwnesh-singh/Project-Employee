package com.project.bean;

public class Project {
	
	private int projectId;
	private int count;
	private String dept;
	
	public Project() {
		super();
	}
	
	public Project(int projectId, String dept, int count) {
		super();
		this.setProjectId(projectId);
		this.setDept(dept);
		this.setCount(count);
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
