package com.cg.room.dao;

import com.cg.room.beans.Customer;

public interface ICustomerDao {
	public int getCustomerDetails(Customer customer);

	public Customer validateCustomer(int custid);

}
