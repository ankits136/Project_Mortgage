package com.cts.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.dao.CustomerDao;
import com.cts.dao.CustomerDaoImpl;
import com.cts.dao.LoanDao;
import com.cts.dao.LoanDaoimpl;
import com.cts.model.Customer;
import com.cts.model.applyloan;

public class LoanServiceimpl implements LoanService {

	LoanDao loanDao;
	public LoanServiceimpl() {
		super();
		loanDao =new LoanDaoimpl();
		
	}
	@Override
	public List<applyloan> listAll() {
		// TODO Auto-generated method stub
		List<applyloan> cList = new ArrayList<>();
		if(loanDao.listAllCustomer() != null)
		{
			cList = loanDao.listAllCustomer();
		}
		return cList;
	}

}
