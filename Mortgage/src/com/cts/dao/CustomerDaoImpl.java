package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.model.Customer;

public class CustomerDaoImpl implements CustomerDao{
	
	Connection con=null;
	PreparedStatement s=null;
	
	public CustomerDaoImpl() {
		con=DBUtil.getConnection();
	}

	

	@Override
	public List<Customer> listAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> clist = new ArrayList<>();
		try {
			s = con.prepareStatement("select * from customers");
			ResultSet rs = s.executeQuery();
			while(rs.next())
			{
				Customer c = new Customer();
				c.setCustomerId(rs.getInt("customer_id"));
				c.setName(rs.getString("customer_name"));
				c.setEmailId(rs.getString("emailid"));
				c.setMobileNumber(rs.getString("mobilenumber"));
				c.setDob(rs.getDate("dateofbirth"));
				c.setPswd(rs.getString("password"));
				c.setCity(rs.getString("city"));
				c.setState(rs.getString("state"));
				clist.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clist;
	}



}
