package com.phone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phone.exception.ResourceNotFoundException;
import com.phone.model.ServiceCenter;
import com.phone.repository.ServiceCenterRepository;

@Service
public class PhoneService 
{
@Autowired
public ServiceCenterRepository serviceCenterRepository;
public List <ServiceCenter> getAllServiceCenter()
{
	return serviceCenterRepository.findAll();
}
public ServiceCenter getServiceCenterById(Long id)
{
	return serviceCenterRepository.findById(id).orElseThrow(( )->new ResourceNotFoundException("ServiceCenter Not Found With Id:"+id));
}
public void createServiceCenter(ServiceCenter serviceCenter)
{
	serviceCenterRepository.save(serviceCenter);
}
public void updateServiceCenter(Long id,ServiceCenter serviceCenter)
{
	ServiceCenter sc = serviceCenterRepository.findById(id).get();
	sc.setCenterName(serviceCenter.getCenterName());
	sc.setLocation(serviceCenter.getLocation());
	serviceCenterRepository.save(serviceCenter);
}
public void deleteServiceCenter(Long id)
{
	serviceCenterRepository.deleteById(id);
}
}
