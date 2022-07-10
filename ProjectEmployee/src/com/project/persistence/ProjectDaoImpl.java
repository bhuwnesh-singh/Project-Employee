package com.project.persistence;

import com.project.bean.Project;
import com.project.database.ProjectData;

public class ProjectDaoImpl implements ProjectDao{

	@Override
	public Project searchRecord(int pId) {
		Project[] project=ProjectData.getProjectList();
		for(int index=0;index<project.length&&project[index]!=null;index++) {
			if(project[index].getProjectId()==pId)
				return project[index];
		}
		return null;
	}

	@Override
	public Project[] getAllRecords() {
		return ProjectData.getProjectList();
	}

	//create for count service to be updated
}
