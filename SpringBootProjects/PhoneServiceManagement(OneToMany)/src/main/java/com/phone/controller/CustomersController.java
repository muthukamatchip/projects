package com.phone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.phone.model.Customers;
import com.phone.service.CustomersService;

@RestController
public class CustomersController 
{
@Autowired
private CustomersService customersService;

@RequestMapping(method = RequestMethod.GET,value="/customers")
public List<Customers> getAllCustomers()
{
	return customersService.getAllCustomers();
}
@RequestMapping(method = RequestMethod.GET,value="/customers/{id}")
public Customers getCustomers(@PathVariable Long id)
{
	return customersService.getCustomersById(id);
}
@RequestMapping(method = RequestMethod.POST,value="/customers")
public void createCustomers(@RequestBody Customers customers)
{
	customersService.createService(customers);
}
@RequestMapping(method = RequestMethod.PUT,value="/customers/{id}")
public void updateCustomers(@PathVariable Long id,@RequestBody Customers customers)
{
	customersService.updateCustomers(id, customers);
}
@RequestMapping(method = RequestMethod.DELETE,value="/customers/{id}")
public void DeleteCustomers(@PathVariable Long id)
{
	customersService.deleteCustomers(id);
}

}
