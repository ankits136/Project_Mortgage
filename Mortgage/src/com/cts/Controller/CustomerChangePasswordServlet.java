package com.cts.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.dao.Validation;
import com.cts.service.ChangePasswordService;
import com.cts.service.ChangePasswordSeviceImpl;


@WebServlet("/CustomerChangePasswordServlet")
public class CustomerChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ChangePasswordService cps;
	public CustomerChangePasswordServlet() {
		cps = new ChangePasswordSeviceImpl();
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String currentpassword = request.getParameter("currentPassword");
		String newpassword = request.getParameter("newPassword");
		if(Validation.checkUser(email,newpassword))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Registration.html");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("Username or password is incorrect");
			RequestDispatcher  rs = request.getRequestDispatcher("changePassword.html");
			rs.forward( request,response);
		}
	}

}
