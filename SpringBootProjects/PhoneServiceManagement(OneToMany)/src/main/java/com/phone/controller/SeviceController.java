package com.phone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.phone.model.ServiceCenter;
import com.phone.service.PhoneService;

@RestController
public class SeviceController 
{
@Autowired
private PhoneService phoneService;
@RequestMapping(method=RequestMethod.GET,value="/service")
public List <ServiceCenter> getAllServiceCenter()
{
	return phoneService.getAllServiceCenter();
}
@RequestMapping(method=RequestMethod.GET,value="/service/{id}")
public ServiceCenter getServiceCenterById(Long id)
{
	return phoneService.getServiceCenterById(id);
}
@RequestMapping(method=RequestMethod.POST,value="/service")
public void createServiceCenter(@RequestBody ServiceCenter serviceCenter)
{
	phoneService.createServiceCenter(serviceCenter);
}
@RequestMapping(method=RequestMethod.PUT,value="/service/{id}")
public void updateServiceCenter(@PathVariable Long id ,@RequestBody ServiceCenter serviceCenter)
{
	phoneService.updateServiceCenter(id, serviceCenter);
}
@RequestMapping(method = RequestMethod.DELETE,value="/service/{id}")
public void DeleteBike(@PathVariable Long id)
{
	phoneService.deleteServiceCenter(id);
}
}
