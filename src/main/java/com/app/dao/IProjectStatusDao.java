package com.app.dao;

import org.springframework.stereotype.Component;

import com.app.model.ProjectStatus;

@Component
public interface IProjectStatusDao {
	public Integer saveProjectStatus(ProjectStatus p);
}
