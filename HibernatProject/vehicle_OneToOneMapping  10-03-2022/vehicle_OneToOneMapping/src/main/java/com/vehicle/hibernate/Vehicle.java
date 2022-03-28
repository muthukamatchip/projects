package com.vehicle.hibernate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle_data")
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int vehicle_id;
private String vehicle_name;
private int vehicle_model,vehicle_power;
@OneToOne(targetEntity=User.class)
private User user;

public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public int getVehicle_id() {
	return vehicle_id;
}
public void setVehicle_id(int vehicle_id) {
	this.vehicle_id = vehicle_id;
}
public String getVehicle_name() {
	return vehicle_name;
}
public void setVehicle_name(String vehicle_name) {
	this.vehicle_name = vehicle_name;
}
public int getVehicle_model() {
	return vehicle_model;
}
public void setVehicle_model(int vehicle_model) {
	this.vehicle_model = vehicle_model;
}
public int getVehicle_power() {
	return vehicle_power;
}
public void setVehicle_power(int vehicle_power) {
	this.vehicle_power = vehicle_power;
}

}
