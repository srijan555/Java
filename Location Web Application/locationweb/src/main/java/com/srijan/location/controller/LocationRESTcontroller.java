package com.srijan.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srijan.location.model.Location;
import com.srijan.location.repos.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRESTcontroller {

	@Autowired
	LocationRepository repos;
	
	@GetMapping
	public List<Location> getLocations()
	{
		return repos.findAll();
	}
	
	@PostMapping
	public Location createLocation(@RequestBody Location location)
	{
		return repos.save(location);
	}
	
	@PutMapping
	public Location updateLocation(@RequestBody Location location)
	{
		return repos.save(location);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMapping(@PathVariable("id") int id)
	{
		Location loc= repos.getOne(id);
		repos.delete(loc);
	}
	
	@RequestMapping("/{id}")
	public Location getLocation(@PathVariable("id") int id)
	{
		return repos.getOne(id);
	}
}
