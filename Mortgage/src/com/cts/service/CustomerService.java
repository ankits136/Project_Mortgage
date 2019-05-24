package com.cts.service;

import java.util.List;

import com.cts.model.Customer;

public interface CustomerService {

	public boolean delCustomer(String name,String email);
	public Customer listCustomer(String name,String email);
	public List<Customer> listAll();
}
