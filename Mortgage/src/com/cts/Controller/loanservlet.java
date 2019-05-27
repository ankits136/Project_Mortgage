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

import com.cts.model.applyloan;
import com.cts.service.LoanService;
import com.cts.service.LoanServiceimpl;

/**
 * Servlet implementation class loanservlet
 */
@WebServlet("/loanservlet")
public class loanservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoanService ls = new LoanServiceimpl();
		List<applyloan> clist = new ArrayList<>();
		PrintWriter pw = response.getWriter();
		
		clist = ls.listAll();	
		List<applyloan> cl = new ArrayList<>();
		for(applyloan al:clist)
		{
			if(al.getPropertyvalue()>al.getLoanamount())
				cl.add(al);
		}
		
		for(applyloan al:cl)
			System.out.println(al);
		
		List loan= null;

		request.setAttribute("loan", cl);
		RequestDispatcher rd = request.getRequestDispatcher("loanApplicants2.jsp");
		rd.forward(request, response);
	}

}
