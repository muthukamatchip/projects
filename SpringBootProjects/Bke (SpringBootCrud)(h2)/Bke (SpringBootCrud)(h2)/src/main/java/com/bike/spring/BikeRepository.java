package com.bike.spring;

import org.springframework.data.repository.CrudRepository;

public interface BikeRepository extends CrudRepository<Bike,Integer>
{

}
