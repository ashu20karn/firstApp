package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.ILocationDao;
import com.app.model.Location;
import com.app.service.ILocationService;

public class LocationServiceImpl implements ILocationService{

	@Autowired
	private ILocationDao dao;
	
	public Integer saveLocation(Location loc) {
		
		return dao.saveLocation(loc);
	}

}
