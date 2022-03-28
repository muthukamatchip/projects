package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
@GetMapping ("/BankCustomer")
public BankCustomers getBankCustomers1() {
	return new BankCustomers("selva","kumar","dindigul,tamilnadu",997654220l);
}
@GetMapping("/BankCustomers")
	public List<BankCustomers> getBankCustomer(){
    List <BankCustomers> c =new ArrayList <>();
    c.add( new BankCustomers("mani","kumar","chennai,tamilnadu",554344333l));
    c.add( new BankCustomers("dinesh","kumar","madurai,tamilnadu",975432247));
    c.add( new BankCustomers("rajesh","waran","trichy,tamilnadu",822356783));
    return c;
}
}
