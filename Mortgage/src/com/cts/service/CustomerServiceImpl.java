package com.cts.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.dao.CustomerDao;
import com.cts.dao.CustomerDaoImpl;
import com.cts.model.Customer;

public class CustomerServiceImpl implements CustomerService{
	
	CustomerDao customerDAO;
	public CustomerServiceImpl() {
		super();
		customerDAO =new CustomerDaoImpl();
		
	}
	
	@Override
	public List<Customer> listAll() {
		// TODO Auto-generated method stub
		List<Customer> cList = new ArrayList<>();
		if(customerDAO.listAllCustomer() != null)
		{
			cList = customerDAO.listAllCustomer();
		}
		return cList;
	}

	
}
