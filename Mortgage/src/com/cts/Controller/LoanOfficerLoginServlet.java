package com.cts.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.dao.Validation;
import com.cts.model.LoanOfficerLogin;
import com.cts.model.CustomerLogin;

/**
 * Servlet implementation class LoanOfficerLoginServlet
 */
@WebServlet("/LoanOfficerLoginServlet")
public class LoanOfficerLoginServlet extends HttpServlet {
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
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		LoanOfficerLogin al = new LoanOfficerLogin();
		String email = request.getParameter("name");
		String password = request.getParameter("pass");
		
		
		
		if(Validation.checkEmployee(email, password))
		{
			RequestDispatcher  rs = request.getRequestDispatcher("EmployeeRegistration.html");
			rs.forward( request,response);
		}
		else
		{
			System.out.println("Username or password is incorrect");
			RequestDispatcher  rs = request.getRequestDispatcher("loanofficerlogin.html");
			rs.forward( request,response);
			
		}
			
		
		
		
	}

}

