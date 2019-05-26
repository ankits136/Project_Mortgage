package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.model.Customer;
import com.cts.model.applyloan;

public class LoanDaoimpl  implements LoanDao{
	Connection con=null;
	PreparedStatement s=null;
	
	public LoanDaoimpl() {
		con=DBUtil.getConnection();
	}


	@Override
	public List<applyloan> listAllCustomer() {
		List<applyloan> clist = new ArrayList<>();
		try {
			s = con.prepareStatement("select * from applyLoan");
			ResultSet rs = s.executeQuery();
			while(rs.next())
			{	
				applyloan al = new applyloan();
				al.setApplicationId(rs.getInt("application_id"));
				al.setEmailId(rs.getString("emailid"));
				al.setLoanamount(rs.getLong("loan_value"));
				al.setPanId(rs.getString("pan_id"));
				al.setAadharId(rs.getString("adhar_id"));
				al.setPropertyvalue(rs.getLong("property_val"));
			//	al.setStatus(rs.getString("loan_status"));	
				clist.add(al);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clist;
	}



	}


