package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cts.model.applyloan;

public class loanValidation {
	
		public static List<applyloan> checkloanAmount(Long loanamount,Long propertyvalue ) 
	    {
			
	     List<applyloan> alist = new ArrayList<>();
	     try{
		 //creating connection with the database 
	        Connection con= DBUtil.getConnection();
	        String sql="select * from ApplyLoan where property_val(?) > loan_value(?)";
	        PreparedStatement ps =con.prepareStatement(sql);
	        ps.setLong(1, propertyvalue);
	        ps.setLong(2, loanamount);
	        ResultSet rs =ps.executeQuery();
	        while(rs.next())
	        {
	        	applyloan al = new applyloan();
	        	al.setApplicationId(rs.getInt("application_id"));
				al.setEmailId(rs.getString("emailid"));
				al.setLoanamount(rs.getLong("loan_value"));
				al.setPanId(rs.getString("pan_id"));
				al.setAadharId(rs.getString("adhar_id"));
				al.setPropertyvalue(rs.getLong("property_val"));
				alist.add(al);
	        }
	       
	     }catch(Exception e)
	     {
	         e.printStackTrace();
	     }
	        return alist;                 
	 }   
}
