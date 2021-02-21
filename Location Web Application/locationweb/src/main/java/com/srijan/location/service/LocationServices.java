package com.srijan.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srijan.location.model.Location;
import com.srijan.location.repos.LocationRepository;

@Service
public class LocationServices {

	@Autowired
	private LocationRepository repos;
	
	public Location saveLocation(Location location)
	{
		return repos.save(location);
	}
	
	public Location updateLocation(Location location)
	{
		return repos.save(location);
	}
	
	public void deleteLocation(Location location)
	{
		repos.delete(location);
	}
	
	public Location getLocationById(int id)
	{
		//return repos.findById(id);
		return repos.getOne(id);
	}
	
	public List<Location> getAllLocations()
	{
		return repos.findAll();
	}

	public LocationRepository getRepos() {
		return repos;
	}

	public void setRepos(LocationRepository repos) {
		this.repos = repos;
	}
}
