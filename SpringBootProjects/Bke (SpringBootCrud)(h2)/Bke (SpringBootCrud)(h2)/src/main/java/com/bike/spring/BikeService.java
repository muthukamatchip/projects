package com.bike.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BikeService 
{
   @Autowired
   public BikeRepository bikeRep;
   public List <Bike> getAllBike()
{
   List<Bike> bikes = new ArrayList<>();
   bikeRep.findAll().forEach(bikes::add);
   return bikes;
}
   public void createBike(Bike bike) {
   bikeRep.save(bike);
   }
   
   public void updateBike(int id, Bike bike ) {
   bikeRep.save(bike);
   }
   
   public void deleteBike(int id) {
   bikeRep.deleteById(id);   
	   
   
   }

}
