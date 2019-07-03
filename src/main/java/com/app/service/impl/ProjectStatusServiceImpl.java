package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.impl.ProjectStatusDaoImpl;
import com.app.model.ProjectStatus;
import com.app.service.IProjectStatusService;

@Service
public class ProjectStatusServiceImpl implements IProjectStatusService{

	@Autowired
	private ProjectStatusDaoImpl dao;
	public Integer saveProjectStatus(ProjectStatus p) {
		return dao.saveProjectStatus(p);
	}

}
