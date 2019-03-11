package com.cg.room.service;

import com.cg.room.beans.Customer;
import com.cg.room.dao.CustomerDaoImpl;
import com.cg.room.dao.ICustomerDao;

public class CustomerServiceImpl implements ICustomerService {

	Customer customer=new Customer();
	ICustomerDao customerDao=new CustomerDaoImpl();
	public int getCustomerDetails(Customer customer) {
	int res=	customerDao.getCustomerDetails(customer);
		
		return res;
	}
	public Customer validateCustomer(int custid) {
		customer=customerDao.validateCustomer(custid);
		return customer;
	}

}
