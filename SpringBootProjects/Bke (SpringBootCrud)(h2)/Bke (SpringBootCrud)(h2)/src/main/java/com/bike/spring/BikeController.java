package com.bike.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController
{
	@Autowired
	private BikeService bikeService;
	
	@RequestMapping("/Bikes")
	public List<Bike> getAllBike()
	{
		return bikeService.getAllBike();
	}		
	@RequestMapping(method = RequestMethod.POST, value="/Bikes")	
	public void createBike(@RequestBody Bike bike) 
	{
	bikeService.createBike(bike);
	}
	@RequestMapping(method = RequestMethod.PUT,value="/Bikes/{id}")
	public void updateBike(@PathVariable int id ,@RequestBody Bike bike)
	{
	bikeService.updateBike(id, bike);
	}
	@RequestMapping(method = RequestMethod.DELETE,value ="/Bikes/{id}")
	public void DeleteBike(@PathVariable int id )
	{
	bikeService.deleteBike(id);
	}
	
	
	}
