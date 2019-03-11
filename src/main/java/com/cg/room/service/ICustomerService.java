package com.cg.room.service;

import com.cg.room.beans.Customer;

public interface ICustomerService {
	public int getCustomerDetails(Customer customer);
	public Customer validateCustomer(int custid);
}
