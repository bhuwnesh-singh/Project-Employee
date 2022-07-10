package com.project.persistence;

import com.project.bean.Project;

public interface ProjectDao {
	
	Project searchRecord(int pId);
	Project[] getAllRecords();
}
