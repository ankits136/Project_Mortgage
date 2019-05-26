package com.cts.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.model.Customer;
import com.cts.model.applyloan;
import com.cts.service.CustomerService;
import com.cts.service.CustomerServiceImpl;
import com.cts.service.LoanService;
import com.cts.service.LoanServiceimpl;

/**
 * Servlet implementation class loanListall
 */
@WebServlet("/loanListall")
public class loanListall extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	LoanService ls = new LoanServiceimpl();
	
	List<applyloan> clist = new ArrayList<>();
	PrintWriter pw = response.getWriter();
	
	clist = ls.listAll();	
	
	
	
List loan= null;

request.setAttribute("loan", clist);
RequestDispatcher rd = request.getRequestDispatcher("loanApplicants.jsp");
rd.forward(request, response);


	
}

}


