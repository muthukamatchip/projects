package com.phone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phone.model.Customers;

public interface  CustomersRepository extends JpaRepository<Customers,Long>{

}
