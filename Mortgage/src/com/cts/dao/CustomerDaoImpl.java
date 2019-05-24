package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.cts.model.Customer;

public class CustomerDaoImpl implements CustomerDao{
	
	Connection con=null;
	PreparedStatement s=null;
	
	public CustomerDaoImpl() {
		con=DBUtil.getConnection();
	}

	@Override
	public boolean deleteCustomer(String name, String email) {
		// TODO Auto-generated method stub
		int res = 0;
		try {
			s = con.prepareStatement("delete from customers where name = ? and email = ?");
			s.setString(1, name);
			s.setString(2, email);
			res = s.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(res==0)
			return false;
		else
			return true;
	}

	@Override
	public Customer listCustomer(String name, String email) {
		// TODO Auto-generated method stub
		Customer cust = new Customer();
		try {
			s=con.prepareStatement("select * from Customers where name = ? and email=?");
			s.setString(1, name);
			s.setString(2, email);
			ResultSet rs = s.executeQuery();
			rs.next();
			cust.setName(rs.getString("eno));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Customer> listAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}



}
