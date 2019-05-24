package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cts.model.Customer;

public class CustomerChangePasswordImpl implements CustomerChangePassword{

	Connection con = null;
	PreparedStatement s = null;
	public CustomerChangePasswordImpl()
	{
	con = DBUtil.getConnection();
	}
	@Override
	public boolean changePassword(String email,String password) {
		// TODO Auto-generated method stub
		
		Customer cust = new Customer();
		try {
			s = con.prepareStatement("update customer set password = ? where emailid = ?");
			int r = s.executeUpdate();
			if(r!=0)
			{
				System.out.println("password updated successfully");
			}
			else
			{
				System.out.println("Sorry password not updated");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	

}
