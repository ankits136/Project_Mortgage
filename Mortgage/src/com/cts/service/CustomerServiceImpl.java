package com.cts.service;

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
	public boolean delCustomer(String name, String email) {
		// TODO Auto-generated method stub
		boolean a = customerDAO.deleteCustomer(name,email);
		return a;
	}
	
	@Override
	public Customer listCustomer(String name, String email) {
		// TODO Auto-generated method stub
		Customer b=customerDAO.listCustomer(name, email);
		return b;
	}
	@Override
	public List<Customer> listAll() {
		// TODO Auto-generated method stub
		List<Customer> clist = customerDAO.listAllCustomer(); 
		return null;
	}

	
}
