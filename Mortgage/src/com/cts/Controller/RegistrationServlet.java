package com.cts.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.model.Customer;



@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	PreparedStatement s = null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		con=DBUtil.getConnection();
	}

	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	PrintWriter pw = response.getWriter();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	sdf.setLenient(false);
	String name = request.getParameter("name");
	String emailId =request.getParameter("email");
	String mobileNumber = request.getParameter("number");
	String	dateOfBirth = request.getParameter("dob");
	String password  = request.getParameter("pwd");
	String city = request.getParameter("city");
	String state = request.getParameter("state");

	//Date dob = sdf.parse(dateOfBirth);
	
	/*System.out.println(name);
	System.out.println(emailId);
	System.out.println(mobileNumber);
	System.out.println(dateOfBirth);
	System.out.println(password);
	System.out.println(city);
	System.out.println(state);
	*/
	try {
		s=con.prepareStatement("insert into customers(customer_name,emailId,mobileNumber,dateOfBirth,password,city,state) values(?,?,?,?,?,?,?)");
		
		
		s.setString(1, name);
		s.setString(2, emailId);
		s.setString(3, mobileNumber);
		s.setString(4, dateOfBirth);
		s.setString(5, password);
		s.setString(6, city);
		s.setString(7,state);
		
		
		int res = s.executeUpdate();
		String r;
		
		
		if(res != 0 )
		{
			r = "Registration is succesfull";
		}
		else
			r = "Registration is not succesfull";
		pw.write(r);
		
		
		
	}
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void destroy() 
	{
		// TODO Auto-generated method stub
		
		try {
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			s.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		super.destroy();
	}
	
	
	
	
}
