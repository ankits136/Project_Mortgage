package com.cts.custapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cts.model.Customer;
import com.cts.model.applyloan;
import com.cts.service.CustomerService;
import com.cts.service.CustomerServiceImpl;
import com.cts.service.LoanService;
import com.cts.service.LoanServiceimpl;

public class loanApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoanService ls = new LoanServiceimpl();
		List<applyloan> clist = new ArrayList<>();
		clist = ls.listAll();
		for(applyloan c:clist)
		{
			System.out.println(c);
		}
	}

}
