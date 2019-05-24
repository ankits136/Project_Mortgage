package com.cts.dao;

import com.cts.model.Customer;
import java.util.*;
public interface CustomerDao {
	
    public boolean deleteCustomer(String name,String email);;
    public Customer listCustomer(String name,String email);
    public List<Customer> listAllCustomer();
    
}
