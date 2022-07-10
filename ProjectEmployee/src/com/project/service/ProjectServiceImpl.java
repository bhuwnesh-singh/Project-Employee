package com.project.service;

import com.project.bean.Project;
import com.project.persistence.ProjectDao;
import com.project.persistence.ProjectDaoImpl;

public class ProjectServiceImpl implements ProjectService {

	ProjectDao projectDao = new ProjectDaoImpl();
	
	@Override
	public Project searchProject(int pId) {
		// TODO Auto-generated method stub
		return projectDao.searchRecord(pId);
	}

	@Override
	public Project[] getAllProjects() {
		// TODO Auto-generated method stub
		return projectDao.getAllRecords();
	}

}
