package com.app.dao;

import org.springframework.stereotype.Component;

import com.app.model.Location;

@Component
public interface ILocationDao {

	public Integer saveLocation(Location loc);
}
