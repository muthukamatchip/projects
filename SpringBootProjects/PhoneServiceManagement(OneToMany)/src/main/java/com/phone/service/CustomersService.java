package com.phone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phone.exception.ResourceNotFoundException;
import com.phone.model.Customers;
import com.phone.repository.CustomersRepository;

@Service
public class CustomersService {
@Autowired
public CustomersRepository customersRepository;
public List<Customers> getAllCustomers()
{
	return customersRepository.findAll();
}
public Customers getCustomersById(Long id)
{
	return customersRepository.findById(id).orElseThrow(( )->new ResourceNotFoundException("Costomer Not Found With Id:"+id));
}
public void createService(Customers customer)
{
	customersRepository.save(customer);
}
public void updateCustomers(Long id,Customers customer)
{
	Customers sc=customersRepository.findById(id).get();
	sc.setCustomerName(customer.getCustomerName());
	sc.setMobileModel(customer.getMobileModel());
	sc.setPhoneNumber(customer.getPhoneNumber());
	sc.setComplaint(customer.getComplaint());
	sc.setBill(customer.getBill());
	customersRepository.save(customer);
}
public void deleteCustomers(Long id)
{
	customersRepository.deleteById(id);
}

}
