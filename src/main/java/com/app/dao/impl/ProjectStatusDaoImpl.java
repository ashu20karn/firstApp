package com.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.ProjectStatus;
import com.app.repo.ProjectStatusRepository;
import com.app.service.IProjectStatusService;

@Repository
public class ProjectStatusDaoImpl implements IProjectStatusService{

	@Autowired 
	private ProjectStatusRepository repo;
	public Integer saveProjectStatus(ProjectStatus p) {
		p = repo.save(p);
		return p.getPsId();
	}

}
