package com.cg.room.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.room.beans.Customer;

class CustomerDaoImplTest {
	Customer customer= new Customer();
	CustomerDaoImpl cl= new CustomerDaoImpl();

	@Test
	void testCustDetails() {
		customer.setName("manisha");
		customer.setEmail("manisha@gmail.com");
		customer.setAddress("huda colony");
		customer.setMobile("7794646720");
		customer.setRoom_type("AC_SINGLE");
		customer.setRoom_no(101);
  assertEquals(1001, cl.getCustomerDetails(customer));

	}
	@Test
	void testValidateCust() {
		
  assertEquals(null, cl.validateCustomer(1001));

	}

}
