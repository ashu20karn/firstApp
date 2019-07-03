package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.IProjectDetailsDao;
import com.app.model.ProjectDetails;
import com.app.service.IProjectDetailsService;

public class ProjectDetailsServiceImpl implements IProjectDetailsService{

	@Autowired
	private IProjectDetailsDao dao;
	
	public Integer saveProjectDetails(ProjectDetails p) {
	
		return dao.saveProjectDetails(p);
	}

}
