package com.cts.service;

import com.cts.dao.CustomerChangePassword;
import com.cts.dao.CustomerChangePasswordImpl;
import com.cts.model.Customer;

public class ChangePasswordSeviceImpl implements ChangePasswordService{

	CustomerChangePassword ccp;
	public ChangePasswordSeviceImpl() {
		ccp = new CustomerChangePasswordImpl();
	}
	@Override
	public boolean changePasswordService(String email, String password) {
		// TODO Auto-generated method stub
		boolean cust = ccp.changePassword(email, password);
		
		return cust;
	}

	
	
}
