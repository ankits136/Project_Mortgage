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
import com.cts.model.Employee;



@WebServlet("/EmployeeRegistrationServlet")
public class EmployeeRegistrationServlet extends HttpServlet {
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
	Employee emp = new Employee();
	String empname = request.getParameter("name");
	String empDesignation = request.getParameter("EmployeeDesignation");
	String emailId =request.getParameter("email");
	String password  = request.getParameter("pwd");
	
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
		s=con.prepareStatement("insert into Employee_reg(employee_name,employee_designation,emailId,password) values(?,?,?,?)");
		
		
		s.setString(1, empname);
		s.setString(2, empDesignation);
		s.setString(3, emailId);
		s.setString(4, password);
		
		
		
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
