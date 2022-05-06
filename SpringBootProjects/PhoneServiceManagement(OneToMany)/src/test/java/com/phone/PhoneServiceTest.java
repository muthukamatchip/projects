package com.phone;
import java.util.List;
import java.util.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import com.phone.model.Customers;
import com.phone.model.ServiceCenter;
import com.phone.repository.CustomersRepository;
import com.phone.repository.ServiceCenterRepository;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PhoneServiceTest {

	@Autowired
	private CustomersRepository customersRepository;
	
	@Autowired
	private ServiceCenterRepository serviceCenterRepository;
	
	@Test
	@Order(1)
	@Rollback(value=false)
	public void saveCustomersTest() {
		 Customers customer = Customers.builder()
				 .id(1L)
				 .customerName("Muthu")
				 .phoneNumber(8822334455L)
				 .mobileModel("pocco")
				 .complaint("Display Replacement")
				 .bill(2000.00)
				 .build();
		 
		 customersRepository.save(customer);
		 Assertions.assertThat(customer.getId()).isGreaterThan(0);
	}	 
				 
	@Test
	@Order(2)
	public void getCustomersTest() {
		Customers customer = customersRepository.findById(1L).get();
		Assertions.assertThat(customer.getId()).isEqualTo(1L);
	}
		
	@Test
	@Order(3)
	public void getListOfCustomersTest() {
		List<Customers> customer =customersRepository.findAll();
		Assertions.assertThat(customer.size()).isGreaterThan(0);
	}
	
	@Test
	@Order(4)
	@Rollback(value=false)
	public void updateCustomers() {
		Customers customer = customersRepository.findById(1L).get();
		customer.setCustomerName("Muthu");
		customer.setPhoneNumber(773653246L);
		customer.setMobileModel("Mi Note 10");
		customer.setComplaint("Software Replacement");
		customer.setBill(3000.00);
		Customers customerUpdated = customersRepository.save(customer);
		Assertions.assertThat(customerUpdated.getCustomerName()).isEqualTo("Muthu");
		Assertions.assertThat(customerUpdated.getPhoneNumber()).isEqualTo(773653246L);
		Assertions.assertThat(customerUpdated.getMobileModel()).isEqualTo("Mi Note 10");
		Assertions.assertThat(customerUpdated.getComplaint()).isEqualTo("Software Replacement");
		Assertions.assertThat(customerUpdated.getBill()).isEqualTo(3000.00);
	}
	@Test
	@Order(5)
	@Rollback(value=false)
	public void deleteCustomers() {
		Customers customer = customersRepository.findById(1L).get();
		customersRepository.delete(customer);
		Customers customer1=null;
		
		Optional<Customers> optionalCustomer =customersRepository.findById(1L);
		 
		if(optionalCustomer.isPresent()) {
			 customer1= optionalCustomer.get();
		 }
		Assertions.assertThat(customer1).isNull();
	}
	@Test
	public void saveServiceTest() {
		ServiceCenter service= ServiceCenter.builder()
				.id(1L)
				.centerName("Mi Service Center")
				.location("Dindigul")
				.build();
		serviceCenterRepository.save(service);
		 Assertions.assertThat(service.getId()).isGreaterThan(0);
		
	}
	
	
}
