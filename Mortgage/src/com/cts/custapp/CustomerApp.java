package com.cts.custapp;
import java.util.*;

import com.cts.model.Customer;
import com.cts.service.CustomerService;
import com.cts.service.CustomerServiceImpl;
public class CustomerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerService customerService = new CustomerServiceImpl();
		List<Customer> clist = new ArrayList<>();
		clist = customerService.listAll();
		for(Customer c:clist)
		{
			System.out.println(c);
		}
	}
}
