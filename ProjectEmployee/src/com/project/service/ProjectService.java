package com.project.service;

import com.project.bean.Project;

public interface ProjectService {

	Project searchProject(int pId);
	Project[] getAllProjects();
}
