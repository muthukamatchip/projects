package com.example.demo;

public class BankCustomers {
private String firstName,lastName,address;
private long phoneNumber;

public BankCustomers(String firstName, String lastName, String address, long phoneNumber) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.phoneNumber = phoneNumber;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}


	
}
